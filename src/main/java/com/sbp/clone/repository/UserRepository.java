package com.sbp.clone.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sbp.clone.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{

}
