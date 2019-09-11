package ondra.controller;

import ondra.converter.StudentConverter;
import ondra.restapi.controller.StudentsApi;
import ondra.restapi.dto.StudentDto;
import ondra.service.StudentService;
import org.springframework.http.ResponseEntity;
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

}
