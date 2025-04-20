package com.example.demo.controller;

import com.example.demo.entity.Student;
import com.example.demo.service.StudentService;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    StudentService studentService;

    @GetMapping("/studentlist")
    public List<Student> getStudentList(){
    List<Student> list=studentService.getStudentList();
    return list;
}


    @GetMapping("/finddatabyid")
    public Student data(@RequestParam int id){
        Student data= studentService.getStudentData(id);
        return data;
        }

    @GetMapping("/findbyid/{id}")
    public Student databyid(@PathVariable int id){
        Student databyId= studentService.getStudentData(id);
        return databyId;
    }


    @GetMapping("/findname/{name}")
    public List<Student> name(@PathVariable String name){
        List<Student> databyname=studentService.getStudent(name);
        return databyname;
    }

    @GetMapping("/findbyage/{age}")
    public List<Student> getDetailsbyAge(@PathVariable int age){
        List<Student> data=studentService.getStudentbyage(age);
        return data;
    }



}
