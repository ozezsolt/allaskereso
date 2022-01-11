package com.example.allaskereso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class userService {
    @Autowired
    UserRepository userRepository;
    public List<user> getallUser(){
        List<user> users= new ArrayList<user>();
        userRepository.findAll().forEach(user -> users.add(user));
        return users;
    }
    public user getUserById(int  id){
        return userRepository.findById(id).get();
    }
    public  void saveUpdate(user user2){
        userRepository.save(user2);
    }
    public void delete(int id){
        userRepository.deleteById(id);
    }
}
