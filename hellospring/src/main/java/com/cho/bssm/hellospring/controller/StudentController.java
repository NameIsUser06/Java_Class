package com.cho.bssm.hellospring.controller;


import com.cho.bssm.hellospring.domain.Student;
import com.cho.bssm.hellospring.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/students/new")
    public String createForm() {
        return "/students/createStudentForm";
    }

    @PostMapping("/students/new")
    public String create(StudentForm form) {
        Student student = new Student();
        student.setId(form.getId());
        student.setName(form.getName());
        studentService.edit(student);
        return "redirect:/";
    }
}
