package ro.javatraining.jobfinder.recruiters;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.user.User;

@Entity
@Table(name = "recruiter")
@Data
public class Recruiter {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @Column(name = "company_name", nullable = false)
    private String companyName;

    @Column(name = "contact_info", nullable = false)
    private String contactInfo;

    public Recruiter() {

    }
}
    

