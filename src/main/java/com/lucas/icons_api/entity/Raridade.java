package com.lucas.icons_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "raridade")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Raridade {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 50)
    private String descricao;
}
