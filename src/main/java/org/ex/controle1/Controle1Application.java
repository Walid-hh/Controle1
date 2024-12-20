package org.ex.controle1;

import org.ex.controle1.dto.ComputerDTO;
import org.ex.controle1.service.ComputerManager;
import org.ex.controle1.service.ComputerService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@SpringBootApplication
public class Controle1Application {

    public static void main(String[] args) {
        SpringApplication.run(Controle1Application.class, args);
    }

    @Bean
    CommandLineRunner start(ComputerService computerService) {
        return args -> {
            Stream.of("pc1","pc2","pc3","pc4").forEach(p->{
                ComputerDTO dto = new ComputerDTO();
                dto.setProce(p);
                dto.setRam(p+"12");
                dto.setPrice(1000);
                computerService.saveComputer(dto);
            });
        };
    }

}
