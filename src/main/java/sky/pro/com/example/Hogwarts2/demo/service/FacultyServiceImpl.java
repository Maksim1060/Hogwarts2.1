package sky.pro.com.example.Hogwarts2.demo.service;

import org.springframework.stereotype.Service;
import sky.pro.com.example.Hogwarts2.demo.model.Faculty;

import java.util.HashMap;
import java.util.Map;

@Service
public class FacultyServiceImpl implements FacultyService {
    private final Map<Long,Faculty>facultyMap=new HashMap<>();
    private long counter=0;

    @Override
    public Faculty addFaculty(Faculty faculty) {
        long id=counter++;
        Faculty newFaculty = new Faculty(id, faculty.getName(), faculty.getColor());
        facultyMap.put(id, newFaculty);
        return newFaculty;
    }

    @Override
    public Faculty getFaculty(long id) {
        return facultyMap.get(id);
    }

    @Override
    public Faculty updateFaculty(long id, Faculty faculty) {
        Faculty existingFaculty = facultyMap.get(id);
        existingFaculty.setName(faculty.getName());
        existingFaculty.setColor(faculty.getColor());
        return existingFaculty;
    }

    @Override
    public void removeFaculty(long id) {
        facultyMap.remove(id);

    }
}
