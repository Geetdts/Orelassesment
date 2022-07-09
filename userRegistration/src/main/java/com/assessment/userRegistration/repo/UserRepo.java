package com.assessment.userRegistration.repo;

import com.assessment.userRegistration.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@Repository
//@EnableJpaRepositories("com.assessment.userRegistration.repo")
public interface UserRepo extends JpaRepository<User,Integer> {
    @Query(value = "SELECT * FROM USER WHERE ID =?1",nativeQuery = true)
    User getUserByUserID(String userID);

    @Query(value = "SELECT * FROM USER WHERE MOBILE_No =?1 AND EMAIL =?2",nativeQuery = true)
    User CheckUserAvailability(String mobileNo,String email);
//find user by user name
    User findByUsername(String username);
}
