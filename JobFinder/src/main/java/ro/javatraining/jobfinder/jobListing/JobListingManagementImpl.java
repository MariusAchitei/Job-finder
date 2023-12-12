package ro.javatraining.jobfinder.jobListing;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.jobListing.api.JobListingDto;
import ro.javatraining.jobfinder.jobListing.api.JobListingManagement;

import java.util.Collection;
import java.util.List;

@Service
@RequiredArgsConstructor
public class JobListingManagementImpl implements JobListingManagement {

    private final JobListingRepository jobListingRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Long create(JobListingDto jobListingDto) {
        final JobListing jobListing = modelMapper.map(jobListingDto, JobListing.class);
        jobListingDto.setId(null);
        return jobListingRepository.save(jobListing).getId();
    }

    @Override
    public JobListingDto getById(Long id) {
        final JobListing jobListing = jobListingRepository.findById(id).orElseThrow();
        return modelMapper.map(jobListing, JobListingDto.class);
    }

    @Override
    public Collection<JobListingDto> getAll() {
        return jobListingRepository.findAll().stream().map(jobListing -> modelMapper.map(jobListing, JobListingDto.class)).toList();
    }

    @Override
    public void update(Long id, JobListingDto jobListingDto) {
        final JobListing jobListing = jobListingRepository.findById(id).orElseThrow();
        modelMapper.map(jobListingDto, jobListing);
        jobListing.setId(id);
        jobListingRepository.save(jobListing);

    }

    @Override
    public void delete(Long id) {
        final JobListing jobListing = jobListingRepository.findById(id).orElseThrow();
        jobListingRepository.delete(jobListing);
    }
}
