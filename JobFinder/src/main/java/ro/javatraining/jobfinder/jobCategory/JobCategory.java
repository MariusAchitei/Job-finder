package ro.javatraining.jobfinder.jobCategory;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.core.utils.JobApplicationStatus;

import java.util.Date;

@Entity
@Data
@Table(name = "job_category")
public class JobCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
