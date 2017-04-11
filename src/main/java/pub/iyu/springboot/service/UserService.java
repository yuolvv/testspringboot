package pub.iyu.springboot.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pub.iyu.springboot.dao.UserMapper;
import pub.iyu.springboot.pojo.User;

/**
 * Created by tsinu on 2017/4/11.
 */
@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public User getUserInfo(){

        User user = userMapper.findUserInfo();

        return user;
    }
}
