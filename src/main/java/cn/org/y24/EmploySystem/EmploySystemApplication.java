package cn.org.y24.EmploySystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@SpringBootApplication
@MapperScan(value = {"cn.org.y24.EmploySystem.Mapper"})
public class EmploySystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(EmploySystemApplication.class, args);
	}

}
