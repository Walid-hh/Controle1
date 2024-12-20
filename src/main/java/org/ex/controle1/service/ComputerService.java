package org.ex.controle1.service;

import org.ex.controle1.dao.repositories.ComputerRepo;
import org.ex.controle1.dto.ComputerDTO;
import org.ex.controle1.mapper.ComputerMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ComputerService implements ComputerManager {


    @Autowired
    private ComputerRepo computerRepo;

    @Autowired
    private ComputerMapper computerMapper;
    @Override
    public List<ComputerDTO> list() {
        return computerRepo.findAll().stream().map(computerMapper::ComputerToDTO).toList();
    }

    @Override
    public ComputerDTO getComputerByProce(String proce) {
        return computerMapper.ComputerToDTO(computerRepo.findComputerByProce(proce));
    }

    @Override
    public ComputerDTO saveComputer(ComputerDTO computerDto) {
        return computerMapper.ComputerToDTO(computerRepo.save(computerMapper.ComputerDTOTocomputer(computerDto)));
    }
}