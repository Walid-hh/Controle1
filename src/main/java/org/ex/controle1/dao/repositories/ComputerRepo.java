package org.ex.controle1.dao.repositories;

import org.ex.controle1.dao.entities.Computer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ComputerRepo extends JpaRepository<Computer , Long> {
    Computer findComputerByProce(String proce);
}
