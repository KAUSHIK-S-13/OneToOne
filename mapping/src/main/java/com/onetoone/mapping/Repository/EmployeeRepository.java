package com.onetoone.mapping.Repository;

import com.onetoone.mapping.BaseResponse.BaseResponse;
import com.onetoone.mapping.DTO.EmployeeDTO;
import com.onetoone.mapping.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer> {



}
