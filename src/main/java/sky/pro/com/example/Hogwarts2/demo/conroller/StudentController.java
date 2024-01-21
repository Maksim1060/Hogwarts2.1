package sky.pro.com.example.Hogwarts2.demo.conroller;

import org.springframework.web.bind.annotation.*;
import sky.pro.com.example.Hogwarts2.demo.model.Student;
import sky.pro.com.example.Hogwarts2.demo.service.StudentServiceImpl;

import java.util.Collection;

@RestController
@RequestMapping("/students")
public class StudentController {
    private final StudentServiceImpl studentService;

    public StudentController(StudentServiceImpl studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/{id}")
    public Student getStudent(@PathVariable long id) {
        return studentService.getStudent(id);
    }

    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return studentService.addStudent(student);
    }
@PutMapping("/{id}")
    public Student updateStudent(@PathVariable long id,@RequestBody Student student) {
        return studentService.updateStudent(id, student);
    }
@DeleteMapping("/{id}")
    public void removeStudent(@PathVariable long id) {
         studentService.removeStudent(id);
    }
@GetMapping
    public Collection<Student> getStudentsByAge(@RequestParam Integer age) {
        return studentService.getStudentsByAge(age);

    }
}
