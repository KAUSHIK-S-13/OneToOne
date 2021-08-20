package com.onetoone.mapping.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="employee_details")
public class Employee {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="emp_id")
    private Integer empId;

    @Column(name = "emp_Name")
    private String empName;

    @Column(name = "emp_Age")
    private Integer empAge;

    @OneToOne(cascade =CascadeType.ALL)
    @JoinColumn(name = "fk_add_id")
    private Address addressId;

}
