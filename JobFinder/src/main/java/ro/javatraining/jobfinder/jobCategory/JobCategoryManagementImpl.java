package ro.javatraining.jobfinder.jobCategory;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryDto;
import ro.javatraining.jobfinder.jobCategory.api.JobCategoryManagement;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobCategoryManagementImpl implements JobCategoryManagement {

    private final JobCategoryRepository jobCategoryRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Long create(JobCategoryDto jobCategoryDto) {
        JobCategory jobCategory = modelMapper.map(jobCategoryDto, JobCategory.class);
        JobCategory savedJobCategory =  jobCategoryRepository.save(jobCategory);
        return savedJobCategory.getId();
    }

    @Override
    public JobCategoryDto getById(Long id) {
        return jobCategoryRepository.findById(id)
                .map(jobCategory -> modelMapper.map(jobCategory, JobCategoryDto.class))
                .orElse(null);
    }

    @Override
    public List<JobCategoryDto> getAll() {
        return jobCategoryRepository.findAll().stream()
                .map(jobCategory -> modelMapper.map(jobCategory, JobCategoryDto.class))
                .toList();
    }

    @Override
    public void update(Long id, JobCategoryDto updatedJobCategoryDto) {
        jobCategoryRepository.findById(id).ifPresent(jobCategory -> {
            modelMapper.map(updatedJobCategoryDto, jobCategory);
            jobCategoryRepository.save(jobCategory);
        });
    }

    @Override
    public void delete(Long id) {
        jobCategoryRepository.deleteById(id);
    }
}
