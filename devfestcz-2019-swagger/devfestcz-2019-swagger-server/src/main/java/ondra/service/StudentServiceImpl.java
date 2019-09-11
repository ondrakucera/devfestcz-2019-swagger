package ondra.service;

import ondra.domain.Student;
import ondra.domain.StudentNotFoundException;
import ondra.repository.StudentRepository;
import org.springframework.stereotype.Service;

import javax.validation.constraints.NotNull;
import java.util.List;

@Service
public class StudentServiceImpl implements StudentService {

	private StudentRepository studentRepository;

	public StudentServiceImpl(StudentRepository studentRepository) {
		this.studentRepository = studentRepository;
	}

	@Override
	public List<Student> getAllStudents() {
		return studentRepository.findAllByOrderByLastNameAscFirstNameAscYearAsc();
	}

	@Override
	public Student getStudent(long id) {
		return studentRepository.findById(id).orElseThrow(() -> new StudentNotFoundException(id));
	}

}
