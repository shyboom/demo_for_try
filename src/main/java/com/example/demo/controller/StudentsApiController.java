package com.example.demo.controller;

import com.example.demo.dto.Student;
import com.example.demo.service.StudentService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.constraints.*;
import javax.validation.Valid;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.List;
import java.util.Map;
@javax.annotation.Generated(value = "io.swagger.codegen.v3.generators.java.SpringCodegen", date = "2020-10-21T07:39:59.895Z[GMT]")
@Controller
public class StudentsApiController implements StudentsApi {

    private static final Logger log = LoggerFactory.getLogger(StudentsApiController.class);

    private final ObjectMapper objectMapper;

    private final HttpServletRequest request;

    @Autowired
    StudentService studentService;
    
    @org.springframework.beans.factory.annotation.Autowired
    public StudentsApiController(ObjectMapper objectMapper, HttpServletRequest request) {
        this.objectMapper = objectMapper;
        this.request = request;
    }

    public ResponseEntity<Void> addStudent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Student body
) {
        String accept = request.getHeader("Accept");
        if (studentService.addStudent(body)) {
        	
        	return new ResponseEntity<Void>(HttpStatus.OK);
			
		}
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<List<Student>> getAllStudent() {
        String accept = request.getHeader("Accept");
        if (accept != null && accept.contains("application/json")) {
            try {
            	List<Student> studentList = studentService.selectAll();
				/*
				 * if (studentList.size()==6) { return new
				 * ResponseEntity<>(HttpStatus.NOT_FOUND); }
				 */
                return new ResponseEntity<List<Student>>(studentList, HttpStatus.OK);
            } catch (Exception e) {
                log.error("Couldn't serialize response for content type application/json", e);
                return new ResponseEntity<List<Student>>(HttpStatus.INTERNAL_SERVER_ERROR);
            }
        }

        return new ResponseEntity<List<Student>>(HttpStatus.NOT_IMPLEMENTED);
    }

    public ResponseEntity<Void> updateStudent(@ApiParam(value = "" ,required=true )  @Valid @RequestBody Student body
) {
        String accept = request.getHeader("Accept");
        if (studentService.updateStudent(body)) {
			return new ResponseEntity<Void>(HttpStatus.OK);
		}
        return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
    }

}
