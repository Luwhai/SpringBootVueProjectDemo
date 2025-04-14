package com.xa.dev.demo.crudapplication.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.xa.dev.demo.crudapplication.entity.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {

}