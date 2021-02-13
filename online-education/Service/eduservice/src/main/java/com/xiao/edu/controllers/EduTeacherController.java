package com.xiao.edu.controllers;

import com.xiao.edu.entities.EduTeacher;
import com.xiao.edu.services.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("eduservice/teacher")
public class EduTeacherController {

    @Autowired
    private EduTeacherService eduTeacherService;

    @GetMapping("findAll")
    public List<EduTeacher> findAllTeachers() {
        List<EduTeacher> teachers = eduTeacherService.list(null);
        return teachers;
    }

    @DeleteMapping("{id}")
    public boolean removeById(@PathVariable String id) {
        return eduTeacherService.removeById(id);
    }
}
