package ro.javatraining.jobfinder.jobApplicant;

import jakarta.persistence.*;
import lombok.Data;
import ro.javatraining.jobfinder.user.User;

@Entity
@Table(name = "job_applicants")
@Data
public class JobApplicant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToOne
    @JoinColumn(name = "userID", referencedColumnName = "userID")
    private User user;
    @Column(name = "first_name",nullable = false)
    private String firstName;
    @Column(name = "last_name",nullable = false)
    private String lastName;
    @Column(name = "date_of_birth",nullable = false)
    private String dateOfBirth;
    @Column(name = "resume_link",nullable = false)
    private String resumeLink;
    @Column(name = "education",nullable = false)
    private String education;
    @Column(name = "skills",nullable = false)
    private String skills;
}
