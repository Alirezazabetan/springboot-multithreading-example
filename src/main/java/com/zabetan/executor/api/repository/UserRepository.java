package com.zabetan.executor.api.repository;

import com.zabetan.executor.api.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,Integer> {
}
