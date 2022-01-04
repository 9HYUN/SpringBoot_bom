package com.example.put;

import com.example.put.dto.PostRequestDto;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class PutApiController
{
    @PutMapping("/put/{userId}")
    public PostRequestDto put(@RequestBody PostRequestDto requestDto, @PathVariable(name = "userId") Long Id){

        System.out.println(Id);
        System.out.println(requestDto);
        return requestDto;
    }
}
