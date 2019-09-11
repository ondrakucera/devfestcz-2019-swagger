package ondra.controller;

import ondra.converter.StudentConverter;
import ondra.domain.Student;
import ondra.domain.StudentNotFoundException;
import ondra.restapi.controller.StudentsApi;
import ondra.restapi.dto.StudentDto;
import ondra.service.StudentService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StudentController implements StudentsApi {

	private StudentService studentService;
	private StudentConverter studentConverter;

	public StudentController(StudentService studentService, StudentConverter studentConverter) {
		this.studentService = studentService;
		this.studentConverter = studentConverter;
	}

	@Override
	public ResponseEntity<List<StudentDto>> getStudents() {
		return ResponseEntity.ok(studentConverter.toDtos(studentService.getAllStudents()));
	}

	@Override
	public ResponseEntity<Long> postStudent(StudentDto studentDto) {
		Student student = studentService.saveStudent(studentConverter.fromDto(studentDto));
		return ResponseEntity.ok(student.getId());
	}

	@Override
	public ResponseEntity<StudentDto> getStudent(Long studentId) {
		return ResponseEntity.ok(studentConverter.toDto(studentService.getStudent(studentId)));
	}

	@Override
	public ResponseEntity<Void> putStudent(Long studentId, StudentDto studentDto) {
		Student student = studentConverter.fromDto(studentDto);
		student.setId(studentId);
		studentService.saveStudent(student);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@Override
	public ResponseEntity<Void> deleteStudent(Long studentId) {
		studentService.deleteStudent(studentId);
		return new ResponseEntity<>(HttpStatus.NO_CONTENT);
	}

	@ResponseStatus(value= HttpStatus.NOT_FOUND)
	@ExceptionHandler(StudentNotFoundException.class)
	public void handleStudentNotFound() {
	}

}
