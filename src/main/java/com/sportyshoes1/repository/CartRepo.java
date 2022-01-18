package com.sportyshoes1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.cartitem;

@Repository
public interface CartRepo extends JpaRepository<cartitem,Integer> {

}
