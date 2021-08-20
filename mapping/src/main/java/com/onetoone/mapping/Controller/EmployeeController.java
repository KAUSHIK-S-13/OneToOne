package com.onetoone.mapping.Controller;

import com.onetoone.mapping.BaseResponse.BaseResponse;
import com.onetoone.mapping.DTO.EmployeeDTO;
import com.onetoone.mapping.Service.EmployeeService;
import com.onetoone.mapping.entity.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/employee_detail")
@RestController
public class EmployeeController {

    @Autowired
    private EmployeeService obj;

    @PostMapping("/emp")
    public BaseResponse det(@RequestBody EmployeeDTO employeeDTO) {
        return obj.det(employeeDTO);
    }

    @GetMapping("/getAll")
    public List<Employee> list(){
        return obj.listAll();
    }
    @DeleteMapping("/deletall")
    public BaseResponse deleted( ){
        return obj.deleted();
    }
    @PutMapping("/Update")
    public BaseResponse updatedetail(@RequestBody EmployeeDTO employeeDTO) {
        return obj.updatedetail(employeeDTO);
    }


   /* @PostMapping("/addemployees")
    public BaseResponse saveEmployees(@RequestBody List<Employee> empdata){
        employeeRepository.saveAll(empdata);
        BaseResponse baseResponse=new BaseResponse();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("sucess");
        baseResponse.setData(empdata);
        return baseResponse;
    }
    @GetMapping("/all")
    public List<Employee>  getAll(){
        return employeeRepository.findAll();
    }

    @PutMapping("/update")
    public BaseResponse updatedetail(@RequestBody List<Employee> Data) {
        employeeRepository.saveAll(Data);
        BaseResponse baseResponse=new BaseResponse();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("sucess");
        baseResponse.setData(Data);
        return baseResponse;
    }

    @DeleteMapping("/delete/{id}")
    public BaseResponse deletedetail(@PathVariable Long id) {
        employeeRepository.deleteById(id);
        BaseResponse baseResponse=new BaseResponse();
        baseResponse.setStatusCode("200");
        baseResponse.setStatusMsg("sucess");
        baseResponse.setData(id);
        return baseResponse;

    }*/
}
