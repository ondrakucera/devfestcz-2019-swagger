package ondra.service;

import ondra.domain.Student;
import org.springframework.validation.annotation.Validated;

import javax.validation.constraints.NotNull;
import java.util.List;

@Validated
public interface StudentService {

	@NotNull
	List<Student> getAllStudents();

	@NotNull
	Student getStudent(long id);

	@NotNull
	Student saveStudent(@NotNull Student student);

}
