package com.xiao.edu.controllers;

import com.xiao.edu.entities.EduTeacher;
import com.xiao.edu.services.EduTeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
