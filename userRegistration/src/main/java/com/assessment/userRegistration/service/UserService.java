package com.assessment.userRegistration.service;

import com.assessment.userRegistration.dto.UserDTO;
import com.assessment.userRegistration.entity.User;
import com.assessment.userRegistration.repo.UserRepo;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
@Transactional
public class UserService {
    @Autowired
    private ModelMapper modelMapper;
    @Autowired
    private UserRepo userRepo;
    //save User service
    public UserDTO saveUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }
    //get All Users Service
    public List<UserDTO> getAllUsers(){
        List<User> userList = userRepo.findAll();
        return  modelMapper.map(userList,new TypeToken<List<UserDTO>>(){}.getType());
    }
    //Update User Service
    public  UserDTO updateUser(UserDTO userDTO){
        userRepo.save(modelMapper.map(userDTO,User.class));
        return userDTO;
    }
    //Delete User Service
    public boolean deleteUser(UserDTO userDTO){
        userRepo.delete(modelMapper.map(userDTO,User.class));
        return true;
    }
}
