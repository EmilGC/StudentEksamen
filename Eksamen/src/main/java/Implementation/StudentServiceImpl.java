package Implementation;

import Repository.StudentRepository;
import Service.StudentService;
import Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.Optional;

@Service("studentServiceImpl")
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Transactional
    public Student saveStudent(Student student) {
        return studentRepository.save(student);
    }

    @Transactional
    public Student getStudent(int id) {
        Optional<Student> studentResponse = studentRepository.findById(id);
        Student student = null;
        if(studentResponse.isPresent()) {
            student = studentResponse.get();
        }else {
            throw new RuntimeException("Ingen student fundet for givent ID");
        }
        return student;
    }

    public void deleteStudent(int id) {
        studentRepository.deleteById(id);
    }

}
