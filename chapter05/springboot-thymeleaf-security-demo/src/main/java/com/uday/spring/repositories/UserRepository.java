package com.uday.spring.repositories;

import com.uday.spring.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;



/**
 * @author uday
 *
 */
public interface UserRepository extends JpaRepository<User, Integer>
{

	User findByEmail(String email);

}