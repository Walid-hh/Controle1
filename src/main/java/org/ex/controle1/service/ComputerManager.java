package org.ex.controle1.service;


import org.ex.controle1.dto.ComputerDTO;

import java.util.List;

public interface ComputerManager {

    List<ComputerDTO> list();
    ComputerDTO getComputerByProce(String proce);
    ComputerDTO saveComputer(ComputerDTO computerDto);
}
