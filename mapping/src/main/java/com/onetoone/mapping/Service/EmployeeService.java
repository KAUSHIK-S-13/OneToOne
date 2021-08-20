package com.onetoone.mapping.Service;

import com.onetoone.mapping.BaseResponse.BaseResponse;
import com.onetoone.mapping.DTO.EmployeeDTO;
import com.onetoone.mapping.Repository.AddressRepository;
import com.onetoone.mapping.Repository.EmployeeRepository;
import com.onetoone.mapping.entity.Address;
import com.onetoone.mapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;
    @Autowired
    private AddressRepository addressRepository;


    public BaseResponse det(EmployeeDTO employeeDTO)
    {
        Employee employee=new Employee();
        Address address=new Address();
        BaseResponse baseResponse=new BaseResponse();
        address.setCity(employeeDTO.getCity());
        address.setPincode(employeeDTO.getPincode());
        address=addressRepository.save(address);
        employee.setEmpName(employeeDTO.getEmpName());
        employee.setEmpAge(employeeDTO.getEmpAge());
        employee.setAddressId(address);
        employee=employeeRepository.save(employee);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(employee);
        baseResponse.setData(address);
        baseResponse.setData(employeeDTO);
        return  baseResponse;
    }

    public List<Employee> listAll() {
        return employeeRepository.findAll();
    }
    public BaseResponse deleted(){
        BaseResponse baseResponse = new BaseResponse();
        employeeRepository.deleteAll();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("employee info deleted successfully..");
        return baseResponse;
    }


    public BaseResponse updatedetail(EmployeeDTO employeeDTO) {
        Employee existemployee = employeeRepository.findById(employeeDTO.getEmpId()).orElse(null);

        Address address=new Address();
        BaseResponse baseResponse=new BaseResponse();
        address.setCity(employeeDTO.getCity());
        address.setPincode(employeeDTO.getPincode());
        address=addressRepository.save(address);
        existemployee.setEmpName(employeeDTO.getEmpName());
        existemployee.setEmpAge(employeeDTO.getEmpAge());
        existemployee.setAddressId(address);
        existemployee=employeeRepository.save(existemployee);
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("success");
        baseResponse.setData(existemployee);
        baseResponse.setData(address);
        baseResponse.setData(employeeDTO);
        return  baseResponse;
    }





}
