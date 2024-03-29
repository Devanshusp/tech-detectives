package TechDetectives.HobbyFinder.Models;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

//An entity represents a table stored in a database. Every instance of an
//entity represents a row in the table. Once the database is set up, this
//annotation can be used.

@Entity
public class User extends UserAbstractEntity {

    private String username;

    private String pwHash;

    @OneToOne(mappedBy = "userId")
    private Survey survey;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();
    public User() {}

    public User(String username, String password){
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public boolean isMatchingPassword(String password){
        return encoder.matches(password,pwHash);
    }

    public String getUsername() {
        return username;
    }

    public Survey getSurvey() {
        return survey;
    }
}

