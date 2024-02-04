package com.example.SSJWT.service;

import com.example.SSJWT.models.Student;

import java.util.List;

public interface StudentService {
    public List<Student> listStudents();

    public Student addStudent(Student student);

    public Student getStudentById(Long id);

    public Student updateStudent(Student estudiante);

    public void deleteStudent(Long id);
}
