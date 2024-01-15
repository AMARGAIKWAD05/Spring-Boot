package com.work.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.work.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
