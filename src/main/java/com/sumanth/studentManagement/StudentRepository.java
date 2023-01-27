package com.sumanth.studentManagement;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

// Student Repository interacts with the database.
@Repository
public class StudentRepository {

    Map<Integer, Student> db;
    
    public StudentRepository() {
        this.db = new HashMap<>();
    }

    public String add_student(Student student) {
        db.put(student.getUid(), student);
        return "Student Added successfully";
    }

    public Student get_student(int uid) {
        return db.get(uid);
    }

    public String updateStudent(int uid, String name) {
        if (!db.containsKey(uid)) return "invalid uid";
        db.get(uid).setName(name);
        return "Name updated successfully";
    }

    public String deleteStudent(int uid) {
        if (!db.containsKey(uid)) return null;
        db.remove(uid);
        return "deleted successfully";
    }

}
