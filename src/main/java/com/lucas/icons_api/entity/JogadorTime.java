package com.lucas.icons_api.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(
        name = "jogadores_times",
        uniqueConstraints = {
                @UniqueConstraint(name = "uk_jogador_time", columnNames = {"jogador_id", "time_id"})
        }
)
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class JogadorTime {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "jogador_id", nullable = false)
    private Jogador jogador;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "time_id", nullable = false)
    private Time time;
}
