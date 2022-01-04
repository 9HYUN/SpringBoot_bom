package com.example.hello.controller;

import com.example.hello.dto.UserRequest;
import org.apache.catalina.User;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/get")
public class GetApiController
{
    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String Hello()
    {
        return "get Hello";
    }
    
    //예전 방식
    
    @RequestMapping(path = "/hi", method = RequestMethod.GET) // get / post / put /delete 모두 사용 가능해서 get으로 지정
    public String hi()
        {
            return "hi";
        }

    // http://localhost:8080/api/get/path-variable/{name}
    // 변수가 다를 경우 (name = "name")으로 지정 후 pathName으로 사용 가능(이름을 일치 시켜줄 수 없을때 사용)
    @GetMapping("/path-variable/{name}") //주소에 대문자 안씀 --> -v로 대체
    public String pathVariable(@PathVariable(name = "name") String pathName)
    {
        System.out.println("PathVariable: " + pathName);
        return pathName;
    }

//    @GetMapping("/path-variable/{name}") //주소에 대문자 안씀 --> -v로 대체
//    public String pathVariable(@PathVariable String name) // 변수가 같을 경우 PathVariable에 속성값 지정 안해도됨
//    {
//        System.out.println("PathVariable: " + name);
//        return name;
//    }

    //http://localhost:8080/api/get/query-param?user=steve&email=steve@naver.com&age=12

    @GetMapping(path= "query-param")
    public String queryParam(@RequestParam Map<String, String> queryParam)
    {
        StringBuilder sb = new StringBuilder();

        queryParam.entrySet().forEach( entry -> {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
            System.out.println("\n");

            sb.append(entry.getKey() + "=" + entry.getValue()+ "\n");
        });

        return sb.toString();
    }

    @GetMapping("query-param02")
    public String queryParam02(@RequestParam String user, @RequestParam String email , @RequestParam int age)
    {
        System.out.println(user);
        System.out.println(email);
        System.out.println(age);

        return user+ " " + email + " " + age;
    }

    @GetMapping("query-param03")
    public String queryParam03(UserRequest userRequest)
    {
        System.out.println(userRequest.getName());
        System.out.println(userRequest.getEmail());
        System.out.println(userRequest.getAge());

        return userRequest.toString();
    }


}
