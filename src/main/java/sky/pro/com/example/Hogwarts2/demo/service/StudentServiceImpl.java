package sky.pro.com.example.Hogwarts2.demo.service;

import org.springframework.stereotype.Service;
import sky.pro.com.example.Hogwarts2.demo.model.Student;

import java.util.HashMap;
import java.util.Map;

@Service
public class StudentServiceImpl implements StudentService {
    private final Map<Long,Student>studentMap=new HashMap<>();
    private int counter = 0;
    @Override
    public Student addStudent(Student student) {
        int id=counter++;
        Student newStudent = new Student(id, student.getName(), student.getAge());
        studentMap.put((long) id, newStudent);
        return newStudent;
    }

    @Override
    public Student getStudent(long id) {
        return studentMap.get(id);
    }

    @Override
    public Student updateStudent(long id, Student student) {
        return null;
    }

    @Override
    public void removeStudent(long id) {
        studentMap.remove(id);
        System.out.println(String.format("Student %s has been removed",id));

    }
}
