package com.sportyshoes1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sportyshoes1.model.admin;

@Repository
public interface AdminRepo extends JpaRepository<admin,Integer> {

	admin findByUsername(String username);
}
