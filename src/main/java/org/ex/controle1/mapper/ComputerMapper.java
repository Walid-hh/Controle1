package org.ex.controle1.mapper;


import org.ex.controle1.dao.entities.Computer;
import org.ex.controle1.dto.ComputerDTO;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

@Component
public class ComputerMapper {

    private final ModelMapper modelMapper = new ModelMapper();



    public ComputerDTO ComputerToDTO(Computer computer) {
        return modelMapper.map(computer, ComputerDTO.class);
    }

    public Computer ComputerDTOTocomputer(ComputerDTO computerDto) {
        return modelMapper.map(computerDto, Computer.class);
    }
}
