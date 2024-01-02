
package doroshenko.security;
import org.springframework.data.jpa.repository.JpaRepository;
import sumdu.edu.ua.mavenproject2.model.User;



public interface UserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);

    public void save(User user);
}