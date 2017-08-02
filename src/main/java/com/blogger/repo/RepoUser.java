package com.blogger.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.blogger.entity.User;

@Repository
public interface RepoUser extends JpaRepository<User, Integer> {

	User findByUsername(String username);

}