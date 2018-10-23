package edume.microservicerobbinconsumermovie.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import edume.microservicerobbinconsumermovie.model.User;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RestController
public class MovieController
{
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private LoadBalancerClient loadBalancerClient;
	
	@Autowired
	private DiscoveryClient client;

	@GetMapping("/user/{id}")
	public User findById(@PathVariable Long id)
	{
		return this.restTemplate.getForObject("http://microservice-provider-user/" + id, User.class);
	}
	
	@GetMapping("/user-instance")
	public List<ServiceInstance> showInfo()
	{
		return this.client.getInstances("microservice-provider-user");
	}

	@GetMapping("/log-user-instance")
	public void logUserInstance()
	{
		ServiceInstance serviceInstance = this.loadBalancerClient.choose("microservice-provider-user");
		
		log.info("{}:{}:{}", serviceInstance.getServiceId(), serviceInstance.getHost(), serviceInstance.getPort());
	}
}
