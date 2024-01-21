package sky.pro.com.example.Hogwarts2.demo.service;

import sky.pro.com.example.Hogwarts2.demo.model.Student;

public interface StudentService {
    Student addStudent(Student student);
    Student getStudent(long id);
    Student updateStudent(long id,Student student);
    void removeStudent(long id);

}
