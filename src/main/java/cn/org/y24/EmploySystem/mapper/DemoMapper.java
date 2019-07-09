package cn.org.y24.EmploySystem.mapper;

import cn.org.y24.EmploySystem.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface DemoMapper {
    @Select("select * from User")
    List<User> getAllUser();
}
