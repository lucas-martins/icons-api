package com.lucas.icons_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "times")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Time {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false, length = 100)
    private String nome;

    @Column(length = 500)
    private String escudo;

    @ManyToOne(fetch = FetchType.LAZY) // pode usar EAGER se quiser carregar país sempre
    @JoinColumn(name = "id_pais")
    private Pais pais;
}
