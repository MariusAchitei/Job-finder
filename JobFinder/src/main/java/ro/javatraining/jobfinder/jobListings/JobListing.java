package ro.javatraining.jobfinder.jobListings;

import jakarta.persistence.*;
import ro.javatraining.jobfinder.jobCategory.JobCategory;
import ro.javatraining.jobfinder.recruiters.Recruiter;

import java.util.Date;

@Entity
@Table(name = "job_listing")
public class JobListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "job_id")
    private Long id;

    @ManyToOne
    @JoinColumn(name = "recruiter_id", nullable = false)
    private Recruiter recruiter;

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

    @ManyToOne
    @JoinColumn(name = "job_category_id", nullable = false)
    private JobCategory jobCategory;
}
