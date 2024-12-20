package org.ex.controle1.web;

import org.ex.controle1.dto.ComputerDTO;
import org.ex.controle1.service.ComputerManager;
import org.ex.controle1.service.ComputerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.MutationMapping;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;


@Controller
public class GraphQlController {


    @Autowired
    private ComputerService computerService;


    @QueryMapping
    public ComputerDTO getComputerByProce(@Argument String proce) {
        return ComputerService.getComputerByProce(proce);
    }
    @MutationMapping
    public ComputerDTO saveComputer(@Argument ComputerDTO computerDto) {
        return computerService.saveComputer(computerDto);
    }

}
