package com.losBlancos.studentManagement;

import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;
@RestController
public class studentController {
    Map<Integer,Student> db= new HashMap<>(); // map will act like database here as of now
    @GetMapping("/get_id/{id}")//getting info so getapi request
    Student getStudent(@PathVariable("id") int admno){
        return db.get(admno);// give you student details
    }
    @PostMapping("/add")//requestBody for taking object as a parameter
    String addStudent(@RequestBody() Student student){//Student type variable student
        db.put(student.getAdmno(), student);
        return "Student Added Successfully";
    }
    @DeleteMapping("/delete/{id}")
    String deleteStudent(@PathVariable("id") int admno)
    {
        db.remove(admno);
        return "Student removed Sucessfully";
    }
    @GetMapping("/get_name/{name}")//getting info so getapi request
    Student getStudent(@PathVariable("name") String name){
      for(Integer i: db.keySet())
      {
          if(db.get(i).getName().equals(name))
          {
            return db.get(i);
          }
      }
        return null;
    }
    @PutMapping("/update")//getting info so getapi request
    String updateStudentName(@RequestBody() Student s){
        if(db.containsKey(s.getAdmno())) {
            db.get(s.getAdmno()).setName(s.getName());
            db.get(s.getAdmno()).setAge(s.getAge());
            db.get(s.getAdmno()).setBranch(s.getBranch());
            return "Student detailes updated";
        }
        return "no student exists with admno: "+s.getAdmno();
    }
}
