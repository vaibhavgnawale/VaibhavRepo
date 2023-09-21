package microservice.user.service.repository;

import microservice.user.service.entitys.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String > {

}
