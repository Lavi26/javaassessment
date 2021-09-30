package com;

import java.util.List;

import javax.websocket.server.PathParam;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RecordSt {

StudentService studentService = new StudentService();

 // Get callusing spring based web service

 @GetMapping("/myurl")
public String sayHello() {

 return "hi how are you";
}

// retrive student info USing @GET MEthod
@GetMapping("/studentinfo")
public Student getDummyStudent() {

 Student s = new Student(); // creating java object
 s.setId(201);
s.setName("Ram");
s.setEmail("Ram@gmail.com");
s.setAddress("delhi");
return s;
}

 // retrive the student information by id

 @GetMapping("/studentinfoid/{id}")
public Student getDummyStudentById(@PathVariable("id") Integer id) {

 Student s = new Student();// creating java object

 s.setId(id);
s.setName("Ram");
s.setEmail("Ram@gmail.com");
s.setAddress("delhi");
return s;
}


 // add the student information POst

 @PostMapping(value = "/insertstudentdetails")
public Student insertDummyStudent(@RequestBody Student student) {
return studentService.addStudent(student); //calling the service
}

//update student info
@PutMapping("/update")
public Student updatestudentInfo(@RequestBody Student student) {
return studentService.updateStudent(student);

 }

//get student list

@GetMapping("/getlist")
public List<Student> getDummyStudentList() {
List<Student> listOfStudent = studentService.getAllStudentlist();
return listOfStudent;
}

// delete list

@DeleteMapping ("/delete/{id}")
public List<Student> deleteStudentById(@PathVariable Integer id) {
new StudentService().deleteStudent(id);
return new StudentService().getAllStudentlist();
}


}
