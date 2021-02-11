package com.xiao.edu.entities;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@ApiModel(value="EduTeacherObj", description="Teachers")
public class EduTeacher implements Serializable {
    private static final long serialVersionUID = 1L;

    @ApiModelProperty(value = "TeacherID")
    @TableId(value = "id", type = IdType.ID_WORKER_STR)
    private String id;

    @ApiModelProperty(value = "TeacherName")
    private String name;

    @ApiModelProperty(value = "TeacherIntroduction")
    private String intro;

    @ApiModelProperty(value = "Teacher Description")
    private String career;

    @ApiModelProperty(value = "level 1:Senior 2:Staff")
    private Integer level;

    @ApiModelProperty(value = "Teacher image")
    private String avatar;

    @ApiModelProperty(value = "sort")
    private Integer sort;

    @ApiModelProperty(value = "LogicDelete 1(true) 0(false)")
    @TableLogic
    private Boolean isDeleted;

    @ApiModelProperty(value = "CreatedTime")
    @TableField(fill = FieldFill.INSERT)
    private Date gmtCreated;

    @ApiModelProperty(value = "UpdatedTime")
    @TableField(fill = FieldFill.INSERT_UPDATE)
    private Date gmtModified;
}
