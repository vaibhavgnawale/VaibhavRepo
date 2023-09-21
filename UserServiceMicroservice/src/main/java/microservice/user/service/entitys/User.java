package microservice.user.service.entitys;

import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Setter
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "micro_users")
public class User {
    @Id
    @Column(name = "ID")
    private String  userId;
    @Column(name = "NAME",length = 25)
    private String name;
    @Column(name = "EMAIL")
    private String email;
    @Column(name = "ABOUT")
    private String about;
    //Transient Stands for don't store in db we get and store rating in another microService
    @Transient
    private List<Rating> ratings= new ArrayList<>();
}
