package ro.javatraining.jobfinder.jobCategories;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job_category")
@Data
public class JobCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
