/**
 * NOTE: This class is auto generated by the swagger code generator program (2.3.1).
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

    @ApiOperation(value = "Deletes a student", nickname = "deleteStudent", notes = "Deletes a `Student`.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Description") })
    @RequestMapping(value = "/students/{studentId}",
        method = RequestMethod.DELETE)
    default ResponseEntity<Void> _deleteStudent(@ApiParam(value = "Student id",required=true) @PathVariable("studentId") Long studentId) {
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


    @ApiOperation(value = "Obtains a student", nickname = "getStudent", notes = "Obtains a `Student` by its id.", response = StudentDto.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = StudentDto.class),
        @ApiResponse(code = 404, message = "When the student cannot be found") })
    @RequestMapping(value = "/students/{studentId}",
        method = RequestMethod.GET)
    default ResponseEntity<StudentDto> _getStudent(@ApiParam(value = "Student id",required=true) @PathVariable("studentId") Long studentId) {
        return getStudent(studentId);
    }

    // Override this method
    default ResponseEntity<StudentDto> getStudent(Long studentId) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("{  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"year\" : 4,  \"id\" : 0}", StudentDto.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Obtains a list of students", nickname = "getStudents", notes = "Obtains a list of `Students`. The list is sorted by `lastName`, then by `firstName`, and then by `year`.", response = StudentDto.class, responseContainer = "List", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = StudentDto.class, responseContainer = "List") })
    @RequestMapping(value = "/students",
        method = RequestMethod.GET)
    default ResponseEntity<List<StudentDto>> _getStudents() {
        return getStudents();
    }

    // Override this method
    default ResponseEntity<List<StudentDto>> getStudents() {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("[ {  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"year\" : 4,  \"id\" : 0}, {  \"firstName\" : \"firstName\",  \"lastName\" : \"lastName\",  \"year\" : 4,  \"id\" : 0} ]", List.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Creates a student", nickname = "postStudent", notes = "Creates a `Student`.", response = Long.class, tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Successful response", response = Long.class) })
    @RequestMapping(value = "/students",
        method = RequestMethod.POST)
    default ResponseEntity<Long> _postStudent(@ApiParam(value = "Student" ,required=true )  @Valid @RequestBody StudentDto student) {
        return postStudent(student);
    }

    // Override this method
    default ResponseEntity<Long> postStudent(StudentDto student) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
            if (getAcceptHeader().get().contains("application/json")) {
                try {
                    return new ResponseEntity<>(getObjectMapper().get().readValue("0", Long.class), HttpStatus.NOT_IMPLEMENTED);
                } catch (IOException e) {
                    log.error("Couldn't serialize response for content type application/json", e);
                    return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
                }
            }
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }


    @ApiOperation(value = "Saves a student", nickname = "putStudent", notes = "Saves a `Student`.", tags={  })
    @ApiResponses(value = { 
        @ApiResponse(code = 204, message = "Successful response") })
    @RequestMapping(value = "/students/{studentId}",
        method = RequestMethod.PUT)
    default ResponseEntity<Void> _putStudent(@ApiParam(value = "Student id",required=true) @PathVariable("studentId") Long studentId,@ApiParam(value = "Student" ,required=true )  @Valid @RequestBody StudentDto student) {
        return putStudent(studentId, student);
    }

    // Override this method
    default ResponseEntity<Void> putStudent(Long studentId,StudentDto student) {
        if(getObjectMapper().isPresent() && getAcceptHeader().isPresent()) {
        } else {
            log.warn("ObjectMapper or HttpServletRequest not configured in default StudentsApi interface so no example is generated");
        }
        return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
    }

}
