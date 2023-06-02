package com.example.springsecurityauthenticationmysql.repository;


import com.example.springsecurityauthenticationmysql.models.ERole;
import com.example.springsecurityauthenticationmysql.models.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
