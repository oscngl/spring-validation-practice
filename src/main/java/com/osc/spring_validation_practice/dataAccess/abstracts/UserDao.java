package com.osc.spring_validation_practice.dataAccess.abstracts;

import com.osc.spring_validation_practice.entities.concretes.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserDao extends JpaRepository<User, Integer> {

}
