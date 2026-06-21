package com.xuanbinhhau.shopapp.repository;

import com.xuanbinhhau.shopapp.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface RoleRepository extends JpaRepository<Role,Long> {
}
