package ro.javatraining.jobfinder.jobApplications;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job_applications")
@Data
public class JobApplication {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
