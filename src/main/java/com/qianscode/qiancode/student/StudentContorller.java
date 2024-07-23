package com.qianscode.qiancode.student;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("students")
public class StudentContorller {
    @GetMapping
    public List<Student> getAllStudent(){


        return List.of(
                new Student(UUID.randomUUID(),"JAMES","Bones","JamesBones@163.com",Student.Gender.MALE),
                new Student(UUID.randomUUID(),"Quagmire","Glans","JQG@163.com",Student.Gender.FEMALE)

        );
    }
}
