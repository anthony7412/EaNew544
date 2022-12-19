package com.compro.miu.compro.dto;

import java.util.HashMap;
import java.util.List;

public class RegistrationRequestDto {
    int student_id;
    int event_id;
    int group_id;

    HashMap<Integer, List<RequestedCourseDto>> request;
}
