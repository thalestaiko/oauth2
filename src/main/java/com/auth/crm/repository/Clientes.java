package com.auth.crm.repository;

import com.auth.crm.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Clientes extends JpaRepository<Cliente, Long> {

}
