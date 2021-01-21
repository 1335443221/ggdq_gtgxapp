package com.sl.gtgx.app_1.entity;

import lombok.Data;

@Data
public class PatrolType {
    private Integer id;

    private String description;

    private Integer companyId;

    private Integer departmentId;
}