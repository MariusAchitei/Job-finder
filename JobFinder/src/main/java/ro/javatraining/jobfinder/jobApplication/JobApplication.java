package ro.javatraining.jobfinder.jobApplication;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.core.utils.JobApplicationStatus;

import java.util.Date;

@Entity
@Data
@Table(name = "job_application")
class JobApplication {
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(name = "job_listing_id")
        private Long jobListingId;

        @Column(name = "job_applicant_id")
        private Long jobApplicantId;

        @Column(name = "application_date")
        private Date applicationDate;

        @Column(name = "status")
        private JobApplicationStatus status;
}