package sathra.panadura.studentmanagement.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;
import sathra.panadura.studentmanagement.model.Student;
import sathra.panadura.studentmanagement.service.StudentService;

import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000")
public class StudentController {

    @Autowired
    StudentService studentService;

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping(path = "/students")
    public List<Student> getAllStudents(){
        return studentService.getAllStudents();
    }
    @GetMapping(path = "/students/{id}")
    public Student getStudentById(@PathVariable int id){

        return studentService.getStudentById(id);
    }

    @PostMapping(path="/students")
    public Student saveStudent(@RequestBody Student s){
           return studentService.saveStudent(s);
    }


    @GetMapping(path="/courses")
    public List<String> getSubjectForGivenLecId(){


        String url="http://localhost:8081/courseNames";
        List<String> courseDetails=restTemplate.getForObject(url,List.class);

        return courseDetails;

    }


}

