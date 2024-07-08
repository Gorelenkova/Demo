package com.ATM.demo.Dao;

import com.ATM.demo.Entity.Client;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface ClientRepository extends JpaRepository<Client,Long> {

}
