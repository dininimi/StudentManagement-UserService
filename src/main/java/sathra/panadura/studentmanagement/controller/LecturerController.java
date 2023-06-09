package sathra.panadura.studentmanagement.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import sathra.panadura.studentmanagement.model.Lecturer;
import sathra.panadura.studentmanagement.service.LecturerService;

import java.util.List;



@CrossOrigin("http://localhost:3000")
@RestController
public class LecturerController {

    @Autowired
    LecturerService lecturerService;


    @GetMapping(path = "/lecturers")
    public List<Lecturer> getAllLecturers(){
        return lecturerService.getAllLecturers();

    }

    @GetMapping(path = "/lecturers/{id}")
    public Lecturer getLecturerByGivenId(@PathVariable int id){

        return lecturerService.getLecturerById(id);
    }

}
