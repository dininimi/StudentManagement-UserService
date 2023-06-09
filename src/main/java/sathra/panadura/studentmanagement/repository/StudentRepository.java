package sathra.panadura.studentmanagement.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import sathra.panadura.studentmanagement.model.Student;

@Repository
public interface StudentRepository extends JpaRepository<Student,Integer> {

}
