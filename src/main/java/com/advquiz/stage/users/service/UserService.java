package com.advquiz.stage.users.service;

import com.advquiz.stage.users.Users;
import com.advquiz.stage.users.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userdao;

    public List<Users> getAllUsers(){
        return userdao.findAll();
    }

    public List<Users> getAllMenUsers(String gender){
        return userdao.findUserByGender(gender);

    }


}
