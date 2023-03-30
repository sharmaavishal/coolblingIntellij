package com.coolbling.repositary;

import com.coolbling.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Repository
public interface UserRepositary extends JpaRepository<User, Long> {

    User findByEmail(String email);

}