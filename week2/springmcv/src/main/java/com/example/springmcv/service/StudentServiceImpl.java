package com.example.springmcv.service;


import com.example.springmcv.dao.StudentRepository;
import com.example.springmcv.entity.Student;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService{
    private StudentRepository studentRepository;

    @Autowired
    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> getAllStudents() {
        return studentRepository.findAll();
    }

    @Override
    public Student getStudentById(String id) {
        return studentRepository.getById(id);
    }

    @Override
    @Transactional
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    @Transactional
    public Student updateStudent(Student student) {
        Student existingStudent = studentRepository.findById(student.getId())
                .orElseThrow(() -> new IllegalArgumentException("Student không tồn tại!"));

        existingStudent.setFirstName(student.getFirstName());
        existingStudent.setLastName(student.getLastName());
        existingStudent.setEmail(student.getEmail());
        return studentRepository.save(existingStudent);
    }

    @Override
    @Transactional
    public void deleteStudentById(String id) {
        studentRepository.deleteById(id);
    }
}
