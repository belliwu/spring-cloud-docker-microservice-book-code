package com.itmuch.cloud.microservicesimpleprovideruser.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.itmuch.cloud.microservicesimpleprovideruser.model.User;
import com.itmuch.cloud.microservicesimpleprovideruser.respository.UserRepository;

@RestController
public class UserController
{
	@Autowired
	private UserRepository userRepository;

	@GetMapping("/{id}")
	public Optional<User> findById(@PathVariable Long id)
	{
		return this.userRepository.findById(id);
	}
}