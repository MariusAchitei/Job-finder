package ro.javatraining.jobfinder.jobListings;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Table(name = "job_listings")
@Data
public class JobListing {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
