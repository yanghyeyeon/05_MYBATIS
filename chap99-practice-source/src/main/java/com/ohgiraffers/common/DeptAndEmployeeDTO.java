package com.ohgiraffers.common;

import lombok.*;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString

public class DeptAndEmployeeDTO {

    private String deptId;
    private String deptTitle;
    private String locationId;

    private List<EmployeeDTO> deptList;
}
