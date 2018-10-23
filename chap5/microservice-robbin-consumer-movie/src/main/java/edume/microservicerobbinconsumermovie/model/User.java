package edume.microservicerobbinconsumermovie.model;

import lombok.Data;

@Data
public class User
{
	private Long id;
	private String username = null;
	private String name = null;
	private Integer age = 0;
}
