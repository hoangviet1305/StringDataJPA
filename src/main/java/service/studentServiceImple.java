package service;

import entity.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import repository.RepositortyStudent;

import java.util.List;
@Service
public class studentServiceImple implements StudentService{
    @Autowired
    private RepositortyStudent repositortyStudent;
    @Override
    public Student Save(Student student) {
        return repositortyStudent.save(student);
    }

    @Override
    public List<Student> GetAll() {
        return repositortyStudent.findAll();
    }

    @Override
    public Student GetById(Long id) {
        return repositortyStudent.findById(id).get();
    }

    @Override
    public void DeleteById(Long id) {
        repositortyStudent.deleteById(id);

    }

    @Override
    public Student UpdateById(Long id, Student student) {
        Student s = repositortyStudent.findById(id).get();
        return repositortyStudent.save(s);
    }
}
