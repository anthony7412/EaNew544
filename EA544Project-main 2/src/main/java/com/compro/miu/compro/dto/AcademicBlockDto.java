package com.compro.miu.compro.dto;

import lombok.Data;

@Data
public class AcademicBlockDto {
    private String name;
    private String semester;
    private  int startWeek;
    private  int endWeek;
    private int year;
    private int month;
    private int day;


}
