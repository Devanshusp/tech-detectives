package TechDetectives.HobbyFinder.data;


import TechDetectives.HobbyFinder.models.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

    User findByUsername(String username);
}
