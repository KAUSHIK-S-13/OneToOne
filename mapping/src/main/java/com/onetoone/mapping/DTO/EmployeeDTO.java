package com.onetoone.mapping.DTO;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
public class EmployeeDTO {
    private Integer empId;

    private String empName;

    private Integer empAge;

    private Integer addressId;

    private String city;

    private Integer pincode;



}
