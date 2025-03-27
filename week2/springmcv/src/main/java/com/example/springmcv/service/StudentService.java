package com.example.springmcv.service;



import com.example.springmcv.entity.Student;

import java.util.List;

public interface StudentService {
    public List<Student> getAllStudents();

    public Student getStudentById(String id);

    public Student addStudent(Student student);

    public Student updateStudent(Student student);

    public void deleteStudentById(String id);

}
