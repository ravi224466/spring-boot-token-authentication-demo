package com.ssr.token.auth.repository;

import java.util.Optional;

import com.ssr.token.auth.model.ERole;
import com.ssr.token.auth.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(ERole name);
}
