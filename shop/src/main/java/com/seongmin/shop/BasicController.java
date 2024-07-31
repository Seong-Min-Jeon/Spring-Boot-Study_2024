package com.seongmin.shop;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.time.ZonedDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
    String hello() {
        return "index.html";
    }

    @GetMapping("/about")
    @ResponseBody
    String about() {
        return "hello";
    }

    @GetMapping("/mypage")
    @ResponseBody
    String mypage() {
        return "mypage";
    }

    @GetMapping("/date")
    @ResponseBody
    String date() {
//        Timestamp timestamp = new Timestamp(System.currentTimeMillis());
//        SimpleDateFormat sdf = new SimpleDateFormat ("yyyy-MM-dd hh:mm:ss");
//        return sdf.format(timestamp);
        return ZonedDateTime.now().toString();
    }

}