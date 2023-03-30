package com.coolbling.repositary;

import com.coolbling.entity.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepositary extends JpaRepository<Role, Long> {

    Role findByName(String name);
}