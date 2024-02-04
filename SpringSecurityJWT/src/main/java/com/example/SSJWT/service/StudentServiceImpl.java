package com.example.SSJWT.service;

import com.example.SSJWT.exception.ResourceNotFoundException;
import com.example.SSJWT.models.Student;
import com.example.SSJWT.repositories.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;


    public List<Student> listStudents() {
        return (List<Student>) studentRepository.findAll();
    }

    @Override
    public Student addStudent(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public Student getStudentById(Long id) {
        return studentRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("El cliente con ese ID no existe : " + id));
    }

    @Override
    public Student updateStudent(Student estudiante) {
        return studentRepository.save(estudiante);
    }

    @Override
    public void deleteStudent(Long id) {
        studentRepository.deleteById(id);
    }
}
