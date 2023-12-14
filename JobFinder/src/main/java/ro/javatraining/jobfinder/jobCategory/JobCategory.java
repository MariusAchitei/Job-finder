package ro.javatraining.jobfinder.jobCategory;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "job_category")
class JobCategory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "description")
    private String description;
}
