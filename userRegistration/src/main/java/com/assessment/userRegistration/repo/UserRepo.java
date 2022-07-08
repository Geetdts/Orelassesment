package com.assessment.userRegistration.repo;

import com.assessment.userRegistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepo extends JpaRepository<User,Integer> {
}
