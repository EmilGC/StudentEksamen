package Controller;

import Repository.StudentRepository;
import Service.StudentService;
import Model.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/StudentsDB")
public class StudentController {

    @Autowired
    StudentRepository studentRepository;
    StudentService studentService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    @ResponseBody
    public Student save(@RequestBody Student student) {
        return studentService.saveStudent(student);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.GET)
    @ResponseBody
    public Student getStudent(@PathVariable int id) {
        return studentService.getStudent(id);
    }

    @RequestMapping(value = "/{id}", method = RequestMethod.DELETE)
    @ResponseBody
    public String deleteStudent(@PathVariable int id){
        studentService.deleteStudent(id);
        return "Student has been deleted succesfully";
    }

    @ModelAttribute
    @GetMapping("/view")
    public String veiwStudents(Model model){
        model.addAttribute("students", studentRepository.findAll());
        return "/view";
    }

}


