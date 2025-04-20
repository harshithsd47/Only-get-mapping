package com.example.demo.service;

import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getStudentList(){
        List<Student> list=studentRepository.findAll();
        return list;
    }

    public Student saveStudentData(Student k){
        Student data=studentRepository.save(k);
        return data;
    }

    public List<Student> saveStudentList(List<Student> l){
        List<Student> data=studentRepository.saveAll(l);
        return data;
    }

    public Student getStudentData(int id){
        Student data=studentRepository.findById(id).get();
        return data;
    }

    public List<Student> getStudent(String name){
        List<Student> data=studentRepository.findByName(name);
        return data;
    }

    public List<Student> getStudentbyage(int age){
        List<Student> data=studentRepository.findByAge(age);
        return data;
    }




}
