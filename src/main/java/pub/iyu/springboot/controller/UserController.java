package pub.iyu.springboot.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;
import pub.iyu.springboot.pojo.User;
import pub.iyu.springboot.service.UserService;

/**
 * Created by tsinu on 2017/4/11.
 */
@Controller
public class UserController {

    private Logger logger = Logger.getLogger(UserController.class);

    @Autowired
    private UserService userService;

    /*
     *  http://localhost:8080/getUserInfo
     */
    @RequestMapping("/getUserInfo")
    @ResponseBody
    public User getUserInfo(){
        User user = userService.getUserInfo();
        return user;
    }

    /*
     *  http://localhost:8080/index
     */
    @RequestMapping("/index")
    public String index(ModelAndView model){
        User user = userService.getUserInfo();
        model.addObject("id",user.getId());
        model.addObject("name",user.getName());
        model.addObject("age",user.getAge());
        model.addObject("password",user.getPassword());
        return "index";
    }



}
