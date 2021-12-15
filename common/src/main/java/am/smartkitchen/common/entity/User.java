package am.smartkitchen.common.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String name;
    private String surname;
    private String email;
    private String password;
    private String passportId;
    private LocalDateTime createdDateTime;
    private double rating;
    private boolean isActive;
    private boolean isBlackList;
    @Enumerated(value = EnumType.STRING)
    private Role role;

}

