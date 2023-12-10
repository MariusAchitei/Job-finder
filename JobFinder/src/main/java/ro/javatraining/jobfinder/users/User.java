package ro.javatraining.jobfinder.users;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table
@Data
public class User {
    @Id
    @GeneratedValue
    private long id;
    private String username;

}
