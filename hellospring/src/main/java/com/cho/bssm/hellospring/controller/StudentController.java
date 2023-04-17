package com.cho.bssm.hellospring.controller;


import com.cho.bssm.hellospring.domain.Student;
import com.cho.bssm.hellospring.service.StudentService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
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

    @GetMapping("/students")
    public String getStudent(Model model) {
        model.addAttribute("students", studentService.findStudents());
        return "students/studentslist";
    }

    @GetMapping("/students/{id}/input")
    public String updateStudent(@PathVariable Long id, Model model) {
        Student student = studentService.findOne(id);
        StudentForm form = new StudentForm();
        form.setId(student.getId());
        form.setName(student.getName());
        form.setScore(student.getScore());
        model.addAttribute("form", form);
        return "students/updateStudentsForm";
    }

    @PostMapping("/students/{id}/input")
    public String updateScore(@PathVariable Long id, @ModelAttribute StudentForm form) {
        Student student = new Student();
        student.setId(id);
        student.setScore(form.getScore());
        studentService.updateScore(student);
        return "redirect:/students";
    }
}
