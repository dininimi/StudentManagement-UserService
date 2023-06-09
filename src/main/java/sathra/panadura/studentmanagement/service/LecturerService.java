package sathra.panadura.studentmanagement.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import sathra.panadura.studentmanagement.model.Lecturer;
import sathra.panadura.studentmanagement.repository.LecturerRepository;

import java.util.List;

@Service
public class LecturerService {

    @Autowired
    LecturerRepository lecturerRepository;
    public List<Lecturer> getAllLecturers() {

        return lecturerRepository.findAll();

    }

    public Lecturer getLecturerById(int id) {

        return lecturerRepository.findById(id).orElse(null);
    }
}
