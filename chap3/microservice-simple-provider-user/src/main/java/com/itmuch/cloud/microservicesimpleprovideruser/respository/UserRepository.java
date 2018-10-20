package com.itmuch.cloud.microservicesimpleprovideruser.respository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.itmuch.cloud.microservicesimpleprovideruser.model.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>
{
}
