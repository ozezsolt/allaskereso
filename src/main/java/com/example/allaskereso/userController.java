package com.example.allaskereso;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
import java.util.UUID;

@RestController
public class userController {

    @Autowired
    userService userS;
    @GetMapping("/userlist")
    private List<user> getallUser(){
        return userS.getallUser();
    }
    @GetMapping("/userlist/{id}")
    private user getUser(@PathVariable("id")int  id){
        return userS.getUserById(id);
    }
    @DeleteMapping("/userlist/{id}")
    private void deleteUser(@PathVariable("id")int  id){
        userS.delete(id);
    }

    @RequestMapping(method = RequestMethod.POST,value="/client")
    private UUID  saveUser(@RequestBody user user2){
        user2.setUUID(UUID.randomUUID());
        userS.saveUpdate(user2);
        return user2.getUUID();
    }

}
