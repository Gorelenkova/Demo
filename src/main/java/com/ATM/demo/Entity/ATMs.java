package com.ATM.demo.Entity;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "ATMs")
@Data
@NoArgsConstructor
public class ATMs {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
}
