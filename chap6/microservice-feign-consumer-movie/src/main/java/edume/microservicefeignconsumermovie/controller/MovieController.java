package edume.microservicefeignconsumermovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edume.microservicefeignconsumermovie.model.User;


@RestController
public class MovieController
{
	@Autowired
	private DiscoveryClient client;

	@Autowired
	private UserFeignClient userFeignClient;
	
	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id)
	{
		return this.userFeignClient.findById(id);
	}
	
	@GetMapping("/user-instance")
	public List<ServiceInstance> showInfo()
	{
		return this.client.getInstances("microservice-provider-user");
	}
}
