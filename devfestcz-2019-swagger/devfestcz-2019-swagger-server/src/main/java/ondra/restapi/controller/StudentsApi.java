/**
 * NOTE: This class is auto generated by the swagger code generator program (3.0.8).
 * https://github.com/swagger-api/swagger-codegen
 * Do not edit the class manually.
 */
package ondra.restapi.controller;

import ondra.restapi.dto.StudentDto;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import javax.validation.constraints.*;
import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.Optional;
@Api(value = "students", description = "the students API")
public interface StudentsApi {

    Logger log = LoggerFactory.getLogger(StudentsApi.class);

    default Optional<ObjectMapper> getObjectMapper() {
        return Optional.empty();
    }

    default Optional<HttpServletRequest> getRequest() {
        return Optional.empty();
    }

    default Optional<String> getAcceptHeader() {
        return getRequest().map(r -> r.getHeader("Accept"));
    }

    @ApiOperation(value = "Summary", nickname = "deleteStudent", notes = "Description", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Description") })
    @RequestMapping(value = "/students/{studentId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> _deleteStudent(@ApiParam(value = "Description",required=true) @PathVariable("studentId") Long studentId) {
        return deleteStudent(studentId);
    }

    // Override this method
    default ResponseEntity<Void> deleteStudent(Long studentId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Summary", nickname = "getStudent", notes = "Description", response = StudentDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Description", response = StudentDto.class),
        @ApiResponse(code = 404, message = "When the student cannot be found") })
    @RequestMapping(value = "/students/{studentId}",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<StudentDto> _getStudent(@ApiParam(value = "Description",required=true) @PathVariable("studentId") Long studentId) {
        return getStudent(studentId);
    }

    // Override this method
    default ResponseEntity<StudentDto> getStudent(Long studentId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Summary for the operation.", nickname = "getStudents", notes = "Description for the operation. Second paragraph of the description.", response = StudentDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Description", response = StudentDto.class, responseContainer = "List") })
    @RequestMapping(value = "/students",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    default ResponseEntity<List<StudentDto>> _getStudents() {
        return getStudents();
    }

    // Override this method
    default ResponseEntity<List<StudentDto>> getStudents() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Summary", nickname = "postStudent", notes = "Description", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 201, message = "Description") })
    @RequestMapping(value = "/students",
        consumes = { "application/json" },
        method = RequestMethod.POST)
    default ResponseEntity<Void> _postStudent(@ApiParam(value = ""  )  @Valid @RequestBody StudentDto body) {
        return postStudent(body);
    }

    // Override this method
    default ResponseEntity<Void> postStudent(StudentDto body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Summary", nickname = "putStudent", notes = "Description", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Description") })
    @RequestMapping(value = "/students/{studentId}",
        consumes = { "application/json" },
        method = RequestMethod.PUT)
    default ResponseEntity<Void> _putStudent(@ApiParam(value = "Description",required=true) @PathVariable("studentId") Long studentId,@ApiParam(value = ""  )  @Valid @RequestBody StudentDto body) {
        return putStudent(studentId, body);
    }

    // Override this method
    default ResponseEntity<Void> putStudent(Long studentId,StudentDto body) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
