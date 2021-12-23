package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @PostMapping("/addproduct")
    public Student addProduct(@RequestBody Student student){
        return studentService.saveStudent(student);
    }

    @PostMapping("/addproducts")
    public List<Student> addProducts(@RequestBody List<Student> students){
        return studentService.saveStudents(students);
    }

    @GetMapping("/findproducts")
    public List<Student> findAllProducts(){
        return  studentService.getStudents();
    }

    @GetMapping("/string")
    public String stringRequest(){
        return "adarsh shahi";
    }

    @GetMapping("/findproduct/{id}")
    public Student findStudentByID(@PathVariable int id){
        return studentService.getStudentByID(id);
    }

    @GetMapping("/findbyname/{name}")
    public Student findStudentByName(@PathVariable String name){
        return studentService.getStudentByName(name);
    }

    @PutMapping("/update")
    public Student updateStudent(@RequestBody Student student){
        return studentService.updateStudent(student);
    }

    @DeleteMapping("delete/{id}")
    public String deleteStudent(@PathVariable int id){
        return studentService.deleteStudent(id);
    }






}
