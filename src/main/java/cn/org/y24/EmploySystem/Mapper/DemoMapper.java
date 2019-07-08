package cn.org.y24.EmploySystem.Mapper;

import cn.org.y24.EmploySystem.Entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {
    @Select("select * from User")
    List<User> getAllUser();
}
