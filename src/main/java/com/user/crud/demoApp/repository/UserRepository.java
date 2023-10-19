package com.user.crud.demoApp.repository;

import com.user.crud.demoApp.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User,String> {
}
