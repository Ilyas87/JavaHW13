package org.itstep.Lesson13.service;

import org.itstep.Lesson13.entity.Student;

import javax.persistence.EntityManagerFactory;
import java.util.List;

public interface DbService {

    EntityManagerFactory ENTITY_MANAGER_FACTORY = null;

    void createStudent(String name, Integer age);

    List<Student> getAllStudents();

    void deleteStudent(Long id);

    void updateStudent(Long id, String name, Integer age);
}
