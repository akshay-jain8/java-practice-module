package com.softdebugs.javapracticemodule.service.impl;

import com.softdebugs.javapracticemodule.entity.Student;
import com.softdebugs.javapracticemodule.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public int getById(int id) {
        if(studentRepository.findById(id).isPresent()) {
            return studentRepository.findById(id).get().getId();
        }
        return 0;
    }

    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }
}
