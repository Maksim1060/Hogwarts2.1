package sky.pro.com.example.Hogwarts2.demo.service;

import org.springframework.stereotype.Service;
import sky.pro.com.example.Hogwarts2.demo.exception.StudentNitFoundException;
import sky.pro.com.example.Hogwarts2.demo.model.Student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

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
        if (studentMap.containsKey(id)) {
            throw new StudentNitFoundException(String.format("Student [%s] not found",id));
        }
        return studentMap.get(id);
    }

    @Override
    public Student updateStudent(long id, Student student) {
        Student existingStudent = studentMap.get(id);
        existingStudent.setName(student.getName());
        existingStudent.setAge(student.getAge());
        return existingStudent;
    }

    @Override
    public void removeStudent(long id) {
        studentMap.remove(id);
        System.out.println(String.format("Student %s has been removed",id));

    }

    @Override
    public List<Student> getStudentsByAge(int age) {
       return studentMap.values().stream().filter(student -> student.getAge() == age).toList();

    }
}
