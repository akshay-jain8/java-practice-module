package com.softdebugs.javapracticemodule.controller;

import com.softdebugs.javapracticemodule.entity.Student;
import com.softdebugs.javapracticemodule.service.impl.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @PostMapping("/student")
    public ResponseEntity<Student> response(@RequestBody Student student) {
        return ResponseEntity.ok(studentService.saveStudent(student));

    }

    @GetMapping("/get/{id}")
    public ResponseEntity<Integer> getById(@PathVariable int id) {
        return ResponseEntity.ok(studentService.getById(id));
    }
}
