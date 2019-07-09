package cn.org.y24.EmploySystem.controller;

import cn.org.y24.EmploySystem.service.DemoService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
public class DemoController {
    @Resource
    private DemoService demoService;

    @RequestMapping("selectAllUse/rs")
    public String selectAllUsers(Model model) {
        model.addAttribute("Users", demoService.userList());
        return "users";
    }

    @RequestMapping("/testControllerParameter")
    public String testControllerParameter() {
        return "testControllerParameter";
    }

    /*
     * Example :
     *
     * 1. @PathVariable :
     * @RequestMapping(value="/a/{b}/{c}")
     * Ps: now b and c is a value referring to the  correspond actual parameter.
     *
     * @ResponseBody
     * Note: this is necessary for response of a pure String .
     *
     * public String demoPathVariable(@PathVariable("pathVariableB") String b, @PathVariable("pathVariableC") String c) {
     *  return someFunction(b,c);
     *   }
     *
     * 2. @RequestParam :
     * public String demoRequest(@RequestParam("requestParameterNameB") String b, @RequestParam("requestParameterNameC") String c) {
     *  return someFunction(b,c);
     *   }
     *
     * 3. @ModelAttribute :
     * public String demoRequest(@ModelAttribute("modelAttributeNameB") String b, @RequestParam("modelAttributeNameC") String c) {
     *  return someFunction(b,c);
     *   }
     * */

    @RequestMapping("/hello")
    @ResponseBody
    public String hello(String content) {

        return content;
    }

}
