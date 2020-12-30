package com.example.demo.controller;

import com.example.demo.model.SearchParam;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")//Localhost:8008/api
public class GetController {


    @RequestMapping(method = RequestMethod.GET,path="/getMethod")//Localhost:8080/api/getMethod
    public String getRequest(){

        return "Hi getMethod";
    }

    @GetMapping("/getParameter")//Localhost:8008/api/getParameter
    public String getParameter(@RequestParam String id, @RequestParam (name="password")String pwd){
        String password="bbbb";
        System.out.println("id"+id);
        System.out.println("Password"+password);

        return id+password;
    }

    @GetMapping("/getMultiParameter")
    public SearchParam getMultiParameter(SearchParam searchParam )
    {
        System.out.println(searchParam.getAccount());
        System.out.println(searchParam.getEmail());
        System.out.println(searchParam.getPage());
        return searchParam;
    }

}
