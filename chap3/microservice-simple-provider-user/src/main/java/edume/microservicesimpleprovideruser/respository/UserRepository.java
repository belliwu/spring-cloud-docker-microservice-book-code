package edume.microservicesimpleprovideruser.respository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import edume.microservicesimpleprovideruser.model.User;

@Repository
public interface UserRepository extends MongoRepository<User, Long>
{

}
