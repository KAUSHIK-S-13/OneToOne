package com.onetoone.mapping.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import javax.transaction.Transactional;

@Entity
@Transactional
@Data
@NoArgsConstructor
@Table(name="address")
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="add_id")
    private Integer Id;

    @Column(name="city")
    private String city;

    @Column(name="pin_code")
    private Integer pincode;
}
