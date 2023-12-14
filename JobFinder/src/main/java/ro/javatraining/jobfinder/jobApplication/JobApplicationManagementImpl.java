package ro.javatraining.jobfinder.jobApplication;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationDto;
import ro.javatraining.jobfinder.jobApplication.api.JobApplicationManagement;

import java.util.List;

@Service
@RequiredArgsConstructor
public class JobApplicationManagementImpl implements JobApplicationManagement {

    private final JobApplicationRepository jobApplicationRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Long create(JobApplicationDto jobApplicationDto) {
        JobApplication jobApplication = modelMapper.map(jobApplicationDto, JobApplication.class);
        JobApplication savedJobApplication =  jobApplicationRepository.save(jobApplication);
        return savedJobApplication.getId();
    }

    @Override
    public JobApplicationDto getById(Long id) {
        return jobApplicationRepository.findById(id)
                .map(jobApplication -> modelMapper.map(jobApplication, JobApplicationDto.class))
                .orElse(null);
    }

    @Override
    public List<JobApplicationDto> getAll() {
        return jobApplicationRepository.findAll().stream()
                .map(jobApplication -> modelMapper.map(jobApplication, JobApplicationDto.class))
                .toList();
    }

    @Override
    public void update(Long id, JobApplicationDto updatedJobApplicationDto) {
        jobApplicationRepository.findById(id).ifPresent(jobApplication -> {
            modelMapper.map(updatedJobApplicationDto, jobApplication);
            jobApplicationRepository.save(jobApplication);
        });
    }

    @Override
    public void delete(Long id) {
        jobApplicationRepository.deleteById(id);
    }
}
