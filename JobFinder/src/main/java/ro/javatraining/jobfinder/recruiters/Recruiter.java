package ro.javatraining.jobfinder.recruiters;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "recruiters")
@Data
public class Recruiter {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
