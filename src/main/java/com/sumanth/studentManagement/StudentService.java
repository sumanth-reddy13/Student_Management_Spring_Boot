package com.sumanth.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

// StudentService interacts with StudentRepository.
// service layer is the important of the three layers.
@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;
    public String add_student(Student student) {
        return studentRepository.add_student(student);
    }

    public Student get_student(int uid) {
        return studentRepository.get_student(uid);
    }

    public String put_student(int uid, String name) {
        return studentRepository.updateStudent(uid, name);
    }

    public String delete_student(int uid) {
        return studentRepository.deleteStudent(uid);
    }
}
