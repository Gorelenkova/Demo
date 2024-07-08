package com.ATM.demo.Dao;

import com.ATM.demo.Entity.ATMs;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ATMRepository extends JpaRepository<ATMs,Long> {
}
