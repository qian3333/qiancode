package com.qianscode.qiancode.student;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.sql.SQLException;
import java.util.List;


@RestController
@RequestMapping("students")
public class StudentContorller {

    private final StudentService studentService;

    @Autowired
    public StudentContorller(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> getAllStudent() throws SQLException {
        return studentService.getStudentList();
    }
}
