package cn.pinghu.springboot_web.controller;

import cn.pinghu.springboot_web.utils.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * HollerWordController控制器类
 *
 * @author shenkai
 * @date 2018/12/21
 */
@Controller
public class HollerWordController {
    @Autowired
    private Person person;

    @Value("testfile")
    private String testfile;

    @ResponseBody
    @RequestMapping("/print/info")
    public String printInfo() {
        System.out.println("HollerWordController");
        System.out.println(person.toString());
        return "HollerWordController";
    }


    @ResponseBody
    @RequestMapping("/intercept")
    public String getTestfile(){
        System.out.println("intercepter");
        return "testPage";
    }
}
