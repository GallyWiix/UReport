package com.hy.ureport.entity.query;

import lombok.Data;

@Data
public class TableQuery {
    private Long regionCode;
    private String type;
    private String isActive;
    private String isCommit;
}
