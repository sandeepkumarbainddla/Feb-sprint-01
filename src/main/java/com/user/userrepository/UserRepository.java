package com.user.userrepository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.user.model.User;

public interface UserRepository extends CrudRepository<User,Integer> {
	
	List<User> findByName(String name);
	User save(User user);

}
