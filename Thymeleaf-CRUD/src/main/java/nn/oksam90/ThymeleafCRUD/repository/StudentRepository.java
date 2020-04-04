package nn.oksam90.ThymeleafCRUD.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import nn.oksam90.ThymeleafCRUD.entity.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long>{
	List<Student> findByName(String name);
}
