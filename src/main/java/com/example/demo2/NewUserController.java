/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.example.demo2;

import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


/**
 *
 * @author Rajesh
 */
@RestController
public class NewUserController {
    
    @Autowired
    NewUserRepository userRepository;
    
    @GetMapping("/newUser")
    public List<NewUser> index(){
        return userRepository.findAll();
    }
    
    @GetMapping("newUser/{id}")
    public NewUser show(@PathVariable String id){
        int uid = Integer.parseInt(id);
        return userRepository.findOne ( uid  );
    }
    
    
    @PostMapping("/newUser")
    public NewUser create(@RequestBody Map<String, String> body ){
        String name = body.get("name");
        return userRepository.save ( new NewUser(name));
    
    }
    
}
