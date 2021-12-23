package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    private StudentRepository repository;

    public Student saveStudent(Student student){
        repository.save(student);
        return student;
    }

    public List<Student> saveStudents(List<Student> students){
        repository.saveAll(students);
        return students;
    }

    public List<Student> getStudents(){
        return repository.findAll();
    }

    public Student getStudentByID(int id){
        return repository.findById(id).orElse(null);
    }

    public Student getStudentByName(String name){
        return repository.findByName(name);
    }

    public String deleteStudent(int id){
        repository.deleteById(id);
        return "Student deleted "+id;
    }


    public Student updateStudent(Student student){
        Student existingStudent = repository.findById(student.getId()).orElse(null);
        existingStudent.setName(student.getName());
        existingStudent.setCity(student.getCity());
        existingStudent.setAge(student.getAge());
        repository.save(existingStudent);
        return existingStudent;

    }





















}
