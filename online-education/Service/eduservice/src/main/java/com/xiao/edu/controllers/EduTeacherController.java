package com.xiao.edu.controllers;

import com.xiao.commonutils.R;
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
    public R findAllTeachers() {
        List<EduTeacher> teachers = eduTeacherService.list(null);
        return R.ok().data("teachers", teachers);
    }

    @DeleteMapping("{id}")
    public R removeById(@PathVariable String id) {
        boolean result = eduTeacherService.removeById(id);
        return result? R.ok(): R.error();
    }
}
