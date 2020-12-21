package Repository;

import org.springframework.data.repository.CrudRepository;
import Model.Student;
import org.springframework.stereotype.Repository;
import java.io.Serializable;

@Repository
public interface StudentRepository extends CrudRepository<Student, Serializable> {
}