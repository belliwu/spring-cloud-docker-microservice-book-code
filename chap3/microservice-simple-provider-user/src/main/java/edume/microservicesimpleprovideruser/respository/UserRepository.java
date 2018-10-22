package edume.microservicesimpleprovideruser.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import edume.microservicesimpleprovideruser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
}
