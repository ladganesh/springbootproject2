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
public class MyUsersController {
    
    @Autowired
    UserRepository userRepository ;
    
    @GetMapping("/myuser")
    public List<MyUsers> index(){
        return userRepository.findAll ();
    }
    
    @GetMapping("/myuser/{id}")
    public MyUsers show(@PathVariable String id){
        int myuserId = Integer.parseInt(id);
        return userRepository.findOne(myuserId) ;
    }
    
//    @PostMapping("/myuser/search")
//    public List<MyUsers> search(@RequestBody Map<String, String> body){
//        String searchTerm = body.get("text");
//        return userRepository.findByTitleContainingOrContentContaining(searchTerm, searchTerm);
//    }
    
    @PostMapping("/myuser")
    public MyUsers create(@RequestBody Map<String, String> body){
        String name = body.get("name");
        String email = body.get("email");
        String phone = body.get("phone");
        return userRepository.save(new MyUsers(name, email, phone));
    }

    @PutMapping("/myuser/{id}")
    public MyUsers update(@PathVariable String id, @RequestBody Map<String, String> body){
        int userId = Integer.parseInt(id);
        // getting blog
        MyUsers user = userRepository.findOne(userId);
        user.setName(body.get("name"));
        user.setEmail(body.get("email"));
         user.setPhone(body.get("phone"));
        return userRepository.save(user);
    }
    
    @DeleteMapping("myuser/{id}")
    public boolean delete(@PathVariable String id){
        int blogId = Integer.parseInt(id);
        userRepository.delete(blogId);
        return true;
    }
}
