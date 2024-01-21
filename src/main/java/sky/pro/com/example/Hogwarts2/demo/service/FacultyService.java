package sky.pro.com.example.Hogwarts2.demo.service;

import sky.pro.com.example.Hogwarts2.demo.model.Faculty;

public interface FacultyService {
    Faculty addFaculty(Faculty faculty);
    Faculty getFaculty(long id);
    Faculty updateFaculty(long id, Faculty faculty);
    void removeFaculty(long id);
}
