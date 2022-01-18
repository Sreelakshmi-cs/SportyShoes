package com.sportyshoes1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.customer;

@Repository
public interface CustomerRepo extends JpaRepository<customer,Integer> {


	customer findByUsername(String username);

}
