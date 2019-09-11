package ondra.converter;

import ondra.domain.Student;
import ondra.restapi.dto.StudentDto;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;

@Component
public class StudentConverter {

	public StudentDto toDto(Student student) {
		return new StudentDto()
				.id(student.getId())
				.firstName(student.getFirstName())
				.lastName(student.getLastName())
				.year(student.getYear());
	}

	public List<StudentDto> toDtos(List<Student> students) {
		return students.stream().map(this::toDto).collect(Collectors.toList());
	}

}
