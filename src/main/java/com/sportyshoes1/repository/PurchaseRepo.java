package com.sportyshoes1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.purchase;

@Repository
public interface PurchaseRepo extends JpaRepository<purchase,Integer> {
	

}
