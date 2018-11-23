package com.example.ddd;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BaseController {
    @PostMapping("ss")
    public Map<String,String> aaa(@RequestBody String ss){
        Map<String,String> map = new HashMap<>();

        if ("ss".equals("co2")){
            double min = 0.01;//最小值
            double max = 10000;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            Double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            map.put("RESULT","S");
            map.put("SS",one.toString());
        }
        return map;
    }
}
