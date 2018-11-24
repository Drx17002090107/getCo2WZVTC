package com.example.ddd;

import com.alibaba.fastjson.JSON;
import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

@RestController
public class BaseController {
    @PostMapping("/ss")
    public  Map<String,String> aaa(@RequestBody String aa){
        Map<String,String> map = new HashMap<>();


            Asd bb = JSON.parseObject(aa,Asd.class);

        if ("co2".equals(bb.getAa())){
            double min = 0.01;//最小值
            double max = 10000;//总和
            int scl =  2;//小数最大位数
            int pow = (int) Math.pow(10, scl);//指定小数位
            Double one = Math.floor((Math.random() * (max - min) + min) * pow) / pow;
            map.put("RESULT","S");
            map.put("SS",one.toString());
            return map;
        }
        map.put("RESULT","F");


        return map;
    }
}
