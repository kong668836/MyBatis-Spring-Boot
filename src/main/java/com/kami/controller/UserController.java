package com.kami.controller;
import com.kami.entity.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.ArrayList;
import java.util.List;
/**
 * @kami
 */
@RestController
@RequestMapping(value = "/")
public class UserController {
    @RequestMapping(value = "/user")
    public List<User> user() {
        List<User> list= new ArrayList<>();
        User user=new User();
        user.setSex(1);
        user.setUserName("kaminame");
        list.add(user);
        return list;
    }
}
