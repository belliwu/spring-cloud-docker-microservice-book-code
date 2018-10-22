package edume.microservicesimpleprovideruser.model;

import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Data;

@Data
@Document
public class User implements Serializable
{
	@Id
	private Long id;
	private String username;
	private String name;
	private Integer age;
}
