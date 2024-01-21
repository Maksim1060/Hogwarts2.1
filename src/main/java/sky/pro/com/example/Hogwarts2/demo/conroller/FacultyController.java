package sky.pro.com.example.Hogwarts2.demo.conroller;

import org.springframework.web.bind.annotation.*;
import sky.pro.com.example.Hogwarts2.demo.model.Faculty;
import sky.pro.com.example.Hogwarts2.demo.service.FacultyServiceImpl;

@RestController
@RequestMapping("/faculty")
public class FacultyController {
    private final FacultyServiceImpl facultyService;

    public FacultyController(FacultyServiceImpl facultyService) {
        this.facultyService = facultyService;
    }
@GetMapping("/{id}")
    public Faculty getFaculty(@PathVariable long id) {
        return facultyService.getFaculty(id);
    }
@PostMapping
    public Faculty createFaculty(@RequestBody Faculty faculty) {
        return facultyService.addFaculty(faculty);
    }
@PutMapping
    public Faculty updateFaculty(@PathVariable long id, @RequestBody Faculty faculty) {
        return facultyService.updateFaculty(id,faculty);
    }
@DeleteMapping
    public void removeFaculty(@PathVariable long id) {
        facultyService.removeFaculty(id);
    }
}
