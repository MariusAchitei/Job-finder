package ro.javatraining.jobfinder.jobListings;

import org.springframework.data.jpa.repository.JpaRepository;

public interface JobListingRepository  extends JpaRepository<JobListing,Long> {
}
