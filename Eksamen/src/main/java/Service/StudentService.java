package Service;

import Model.Student;
import org.springframework.stereotype.Component;

@Component
public interface StudentService {
    Student saveStudent(Student student);
    Student getStudent(int id);
    void deleteStudent(int id);
}
