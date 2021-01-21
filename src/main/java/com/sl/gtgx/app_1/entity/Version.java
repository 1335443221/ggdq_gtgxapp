package com.sl.gtgx.app_1.entity;

import lombok.Data;

@Data
public class Version {
    private Integer id;

    private String version;

    private Integer isForce;

    private Integer uploadAt;
}