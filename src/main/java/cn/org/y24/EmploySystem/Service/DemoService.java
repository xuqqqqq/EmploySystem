package cn.org.y24.EmploySystem.Service;

import cn.org.y24.EmploySystem.Entity.User;
import cn.org.y24.EmploySystem.Mapper.DemoMapper;
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
