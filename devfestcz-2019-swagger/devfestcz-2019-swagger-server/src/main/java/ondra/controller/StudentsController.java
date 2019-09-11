package ondra.controller;

import ondra.restapi.controller.StudentsApi;
import ondra.restapi.dto.StudentDto;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class StudentsController implements StudentsApi {

	@Override
	public ResponseEntity<List<StudentDto>> getStudents() {
		return ResponseEntity.ok(Collections.emptyList());
	}

}
