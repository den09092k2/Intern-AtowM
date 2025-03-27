package com.example.springmcv.rest;


import com.example.springmcv.entity.Student;
import com.example.springmcv.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/api/students")
public class StudentController {
    private StudentService studentService;

    @Autowired
    public StudentController(StudentService studentService){
        this.studentService = studentService;
    }

    @GetMapping("/list")
    public String listAll(Model model){
        List<Student> students = studentService.getAllStudents();
        model.addAttribute("students", students);
        return "student/students";
    }

    @GetMapping("/create")
    public String create(Model model){
        Student student = new Student();
        model.addAttribute("student", student);
        return "/student/students-form";
    }

    @PostMapping("/save")
    public String save(@ModelAttribute("student") Student student){
        studentService.addStudent(student);
        return "redirect:/api/students/list";
    }

    @GetMapping("/update")
    public String update(@RequestParam("id") String id, Model model){
        Student student = studentService.getStudentById(id);
        model.addAttribute("student", student);
        return "/student/students-from-update";
    }

    @PostMapping("/saveUpdate")
    public String saveUpdate(@ModelAttribute("student") Student student){
        studentService.updateStudent(student);
        return "redirect:/api/students/list";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam("id") String id, Model model){
        studentService.deleteStudentById(id);
        return "redirect:/api/students/list";
    }
}
