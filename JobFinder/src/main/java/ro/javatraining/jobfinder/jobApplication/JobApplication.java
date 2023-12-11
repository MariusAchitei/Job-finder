package ro.javatraining.jobfinder.jobApplication;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.core.utils.JobApplicationStatus;
import ro.javatraining.jobfinder.jobApplicant.JobApplicant;
import ro.javatraining.jobfinder.jobListing.JobListing;

import java.util.Date;

@Entity
@Data
@Table(name = "job_application")
public class JobApplication {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @ManyToOne
        @JoinColumn(name = "job_posting_id")
        private JobListing jobListing;

        @ManyToOne
        @JoinColumn(name = "job_applicant_id")
        private JobApplicant jobApplicant;

        @Column(name = "application_date")
        private Date applicationDate;

        @Column(name = "status")
        private JobApplicationStatus status;
}