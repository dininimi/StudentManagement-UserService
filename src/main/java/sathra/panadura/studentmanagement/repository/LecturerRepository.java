package sathra.panadura.studentmanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sathra.panadura.studentmanagement.model.Lecturer;

@Repository
public interface LecturerRepository extends JpaRepository<Lecturer,Integer> {

}
