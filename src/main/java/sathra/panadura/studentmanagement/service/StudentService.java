package sathra.panadura.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sathra.panadura.studentmanagement.model.Student;
import sathra.panadura.studentmanagement.repository.StudentRepository;

import java.util.List;

@Service
public class StudentService {

    @Autowired
    StudentRepository studentRepository;

    public List<Student> getAllStudents(){
       return studentRepository.findAll();
    }

    public Student saveStudent(Student s) {

        return  studentRepository.save(s);
    }
}
