package com.yuxiu.edu.web.controller;

import com.yuxiu.edu.pojo.User;
import com.yuxiu.edu.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;


@Controller
@RequestMapping("user/")
public class UserController {

    @Autowired
    private UserService UserService;

    @RequestMapping(value = "{id}",method = RequestMethod.GET)
    @ResponseBody
    public ResponseEntity<User> findById(@PathVariable("id") Integer id){

        try {
            User user =    this.UserService.findById(id);
            if(null==user){
                return  ResponseEntity.status(HttpStatus.BAD_REQUEST).body(null);
            }
            return  ResponseEntity.ok(user);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).body(null);
    }

}
