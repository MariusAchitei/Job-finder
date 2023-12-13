package ro.javatraining.jobfinder.recruiter;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.user.User;

@Entity
@Table(name = "recruiters")
@Data
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "user_id", nullable = false)
    private Long userId;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "contact_info", nullable = false)
    private String contactInfo;

    public Recruiter() {

    }
}
    

