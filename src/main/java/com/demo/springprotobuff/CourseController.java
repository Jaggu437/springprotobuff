package com.demo.springprotobuff;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.demo.springprotobuff.Demoproto.Course;

@RestController
public class CourseController {

    @Autowired
    CourseRepository courseRepo;

    @RequestMapping("springprotobuff/courses/{id}")
    Course customer(@PathVariable Integer id) {
        return courseRepo.getCourse(id);
    }
}
