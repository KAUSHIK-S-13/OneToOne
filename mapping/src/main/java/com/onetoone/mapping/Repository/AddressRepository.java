package com.onetoone.mapping.Repository;

import com.onetoone.mapping.entity.Address;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AddressRepository extends JpaRepository<Address,Integer> {
}
