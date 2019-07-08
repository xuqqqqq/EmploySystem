package cn.org.y24.EmploySystem.Controller;

import cn.org.y24.EmploySystem.Service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

@Controller
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("selectAllUsers")
    public String selectAllUsers(Model model) {
        model.addAttribute("Users", demoService.userList());
        return "users";
    }

    @RequestMapping("hello")
    public String hello() {
        return "demo";
    }
}
