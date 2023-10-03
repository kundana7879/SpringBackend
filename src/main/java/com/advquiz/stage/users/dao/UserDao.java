package com.advquiz.stage.users.dao;

import com.advquiz.stage.users.Users;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserDao extends JpaRepository<Users, Integer> {
    List<Users> findAll();
    List<Users> findUserByGender(String gender);

}
