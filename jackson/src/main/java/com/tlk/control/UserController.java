package com.tlk.control;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.tlk.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.ArrayList;

@RestController
public class UserController {

    @RequestMapping(value = "/j1")
    //@ResponseBody
    public String json1() throws JsonProcessingException {
        //jackson
        ObjectMapper mapper = new ObjectMapper();

        User user = new User("tlk" , 3 , "boy");
        String str = mapper.writeValueAsString(user);
        return str;
    }

    @RequestMapping(value = "/j2")
    public String json2() throws JsonProcessingException {
        //jackson
        ObjectMapper mapper = new ObjectMapper();

        List<User> list = new ArrayList<>();
        User user1 = new User("tlk1" , 3 , "boy");
        User user2 = new User("tlk2" , 3 , "boy");
        User user3 = new User("tlk3" , 3 , "boy");
        User user4 = new User("tlk4" , 3 , "boy");
        list.add(user1);
        list.add(user2);
        list.add(user3);
        list.add(user4);
        String str = mapper.writeValueAsString(list);
        return str;
    }

    @RequestMapping("/j3")
    public String json3() throws JsonProcessingException {
        ObjectMapper mapper = new ObjectMapper();

        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        mapper.setDateFormat(sdf);
        Date date = new Date();
        return mapper.writeValueAsString(date);
    }
}
