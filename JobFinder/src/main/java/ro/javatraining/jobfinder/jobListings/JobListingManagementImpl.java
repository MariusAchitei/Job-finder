package ro.javatraining.jobfinder.jobListings;

import lombok.RequiredArgsConstructor;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;
import ro.javatraining.jobfinder.jobApplicant.JobApplicantRepository;
import ro.javatraining.jobfinder.jobListings.api.JobListingDto;
import ro.javatraining.jobfinder.jobListings.api.JobListingManagement;
import ro.javatraining.jobfinder.recruiters.Recruiter;

import java.util.List;
@Service
@RequiredArgsConstructor
public class JobListingManagementImpl implements JobListingManagement {

    private final JobListingRepository jobListingRepository;
    private final ModelMapper modelMapper = new ModelMapper();

    @Override
    public Long create(JobListingDto jobListingDto) {
        return null;
    }

    @Override
    public JobListingDto getById(Long id) {
        return null;
    }

    @Override
    public List<JobListingDto> getAll() {
        return null;
    }

    @Override
    public void update(Long id, JobListingDto jobListingDto) {

    }

    @Override
    public void delete(Long id) {

    }
}
