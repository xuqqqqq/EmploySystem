package cn.org.y24.EmploySystem.service;

import cn.org.y24.EmploySystem.entity.User;
import cn.org.y24.EmploySystem.mapper.DemoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class DemoService {
    @Resource
    DemoMapper userMapper;
    public List<User> userList(){
        return userMapper.getAllUser();
    }
}
