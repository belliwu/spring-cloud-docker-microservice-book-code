package edume.microservicesimpleprovideruser;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.core.MongoTemplate;

import edume.microservicesimpleprovideruser.model.User;

@SpringBootApplication
public class MicroserviceSimpleProviderUserApplication
{
	@Autowired
	private MongoTemplate mongoTemplate;

	public static void main(String[] args)
	{
		SpringApplication.run(MicroserviceSimpleProviderUserApplication.class, args);
	}

	@PostConstruct
	public void init()
	{
		User user1 = new User();
		user1.setId(1L);
		user1.setName("belli");
		user1.setAge(55);
		user1.setUsername("belliwu");

		this.mongoTemplate.save(user1);
		
		User user2 = new User();
		user2.setId(2L);
		user2.setName("Andy");
		user2.setAge(18);
		user2.setUsername("Andywu");

		this.mongoTemplate.save(user2);
	}
}
