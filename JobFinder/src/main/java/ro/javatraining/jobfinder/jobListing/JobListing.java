package ro.javatraining.jobfinder.jobListing;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.jobCategory.JobCategory;
import ro.javatraining.jobfinder.recruiter.Recruiter;

import java.util.Date;

@Entity
@Data
@Table(name = "job_listing")
public class JobListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "recruiter_id", nullable = false)
    private Long recruiterId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "description", nullable = false)
    private String description;

    @Column(name = "location", nullable = false)
    private String location;

    @Column(name = "salary_range")
    private String salaryRange;

    @Column(name = "posted_date", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date postedDate;

    @Column(name = "deadline", nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    private Date deadline;

    @Column(name = "job_category_id", nullable = false)
    private Long jobCategoryId;

    public JobListing(){

    }
}
