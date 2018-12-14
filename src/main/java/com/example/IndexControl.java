package com.example;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.HashMap;
import java.util.Map;

@Controller
@ResponseBody
public class IndexControl {
    /**
    * @Description: 页面展示
    * @Param: []
    * @return: java.util.Map<java.lang.String,java.lang.String>
    * @Author: nlj
    * @Date: 2018/12/3
    */
    @RequestMapping("index")
    public Map<String,String> index(){
        Map map = new HashMap();
        map.put("name", "zhangsan");
        map.put("age", "27");
        //map.put("high", "170");
        return map;
    }


    @RequestMapping("/hello")
    public String hello(){
        return "Hello springboot";
    }

   /**
   * @Description: cal
   * @Param: [a, b]
   * @return: java.lang.String
   * @Author: nlj
   * @Date: 2018/12/3
   */
    @RequestMapping("/cal")
    public String cal(int a,int b){
        return "计算结果是：" + a + b;
    }
}
