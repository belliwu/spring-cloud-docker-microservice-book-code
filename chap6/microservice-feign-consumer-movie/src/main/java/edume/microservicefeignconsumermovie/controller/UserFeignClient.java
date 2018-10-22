package edume.microservicefeignconsumermovie.controller;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import edume.microservicefeignconsumermovie.model.User;

@FeignClient(name = "MICROSERVICE-PROVIDER-USER")
public interface UserFeignClient
{
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public User findById(@PathVariable("id") Long id);
}
