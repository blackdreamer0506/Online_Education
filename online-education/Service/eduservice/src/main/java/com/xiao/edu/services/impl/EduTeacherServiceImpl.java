package com.xiao.edu.services.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xiao.edu.entities.EduTeacher;
import com.xiao.edu.mappers.EduTeacherMapper;
import com.xiao.edu.services.EduTeacherService;
import org.springframework.stereotype.Service;

@Service
public class EduTeacherServiceImpl extends ServiceImpl<EduTeacherMapper, EduTeacher>
        implements EduTeacherService {

}
