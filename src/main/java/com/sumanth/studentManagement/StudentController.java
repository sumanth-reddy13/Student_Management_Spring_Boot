package com.sumanth.studentManagement;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

// A notation to denote that an API is declared in this function.
// Here in Controller, we are listing our APIs.
// Controller interacts with StudentService Class.
@RestController
public class StudentController {

    /// Autowired is used to create special objects. Here we used Autowired to create layered objects. Created objects for StudentRepository class and StudentService class.
    @Autowired
    StudentService studentService;

    // A notation to get the API. This is path variable
//    @GetMapping("/get_student/{uid}")
//    public Student get_student(@PathVariable("uid ") int uid) {
//        return db.get(uid);
//    }

    // A notation to create the values in API
    @PostMapping("/add_student")
    public ResponseEntity add_student(@RequestBody Student student) {
        String response = studentService.add_student(student);
        return new ResponseEntity(response, HttpStatus.CREATED);
    }

    // This is Request Parameter.
    @GetMapping("/get_student")
    public ResponseEntity get_student(@RequestParam("uid") int uid) {
        Student response = studentService.get_student(uid);
        if (response == null) {
            return new ResponseEntity<>("Invalid id", HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(response, HttpStatus.FOUND);
    }

    // To update in the API
    @PutMapping("/put_student")
    public ResponseEntity put_student(@RequestParam("uid") int uid, @RequestParam("name") String name) {
       String response = studentService.put_student(uid, name);
       if (response.equals("invalid uid")) return new ResponseEntity<>("invalid uid entered", HttpStatus.NOT_FOUND);
       return new ResponseEntity<>(response, HttpStatus.OK);
    }


    // To perform deletion in the API
    @DeleteMapping("/delete_student")
    public ResponseEntity delete_student(@RequestParam("uid") int uid) {
       String response = studentService.delete_student(uid);
       if (response == null) return new ResponseEntity<>("Error. uid Not Found" , HttpStatus.NOT_FOUND);
       return new ResponseEntity(response, HttpStatus.FOUND);
    }

    // creating data in the API using name of the student;
//    @PostMapping("/add_student_object")
//    public String add_student_name(@RequestBody Student student) {
//        String name = student.getName();
//        dB.put(name, student);
//        return "student paired successfully with name in the database.";
//    }

    // Get the API using name.
//    @GetMapping("/get_student_object")
//    public Student get_student_object(@RequestParam("name") String name) {
//        return dB.get(name);
//    }


    // 3 ways to fetch a request from the client.
    // 1) request params;
    // 2) path variables;
    // 3) request body;
}
