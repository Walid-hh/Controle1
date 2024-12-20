package org.ex.controle1.dao.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString
public class Computer {

    @Id
    private Long id_pc;
    String proce;
    String ram;
    String hardDrive;
    int price;
    String macAdress;

}
