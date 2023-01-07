package com.gzero.springbootbeginnner.controller;

import com.gzero.springbootbeginnner.dto.MemberDTO;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/v1/get-api") // 공통되는 url
public class GetController {
    // http://localhost:8888/api/v1/get-api/hello
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public String getHello() {
        return "Hello World!";
    }

    @GetMapping(value = "/name")
    public String getName() {
        return "jiyoungHan";
    }

    // http://localhost:8888/api/v1/get-api/variable1/{variable-String 값}
    @GetMapping(value = "/variable1/{variable}")
    public String getVariable1(@PathVariable String variable) {
        return variable;
    }

    @GetMapping(value = "/variable2/{variable}")
    public String getVariable2(@PathVariable("variable") String var) {
        return var;
    }

    @GetMapping(value = "/variable2_1/{variable}")
    public String getVariable2_1(@PathVariable("variable") String var, @PathVariable String var2) {
        return var;
    }

    @GetMapping(value = "/variable2_2/{variable}")
    public String getVariable2_2(@PathVariable("variable") String var, @PathVariable String var2, @PathVariable String var3) {
        return var;
    }

    // http://localhost:8888/api/v1/get-api/request1?name=jiyounghan&email=jiyounghan@gmail.com&organization=samsung
    @GetMapping(value = "/request1")
    public String getRequestParam1(
            @RequestParam String name,
            @RequestParam String email,
            @RequestParam String organization) {
        return name + " " + email + " " + organization;
    }

    @GetMapping(value = "/request2")
    public String getRequestParams2(@RequestParam Map<String, String> param) {
        StringBuilder sb = new StringBuilder();
        param.entrySet().forEach(map -> {
            sb.append(map.getKey() + " : " + map.getValue() + "\n");
        });
        return sb.toString();
    }

    @GetMapping(value = "/request3")
    public String getRequestParam3(MemberDTO memberDTO) {
        return memberDTO.toString();
    }
}
