package org.czirman.entity;

import jakarta.persistence.*;
import lombok.*;

import java.util.UUID;

@Entity
@Table(name ="tabela")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Encja {

    @Id
    @GeneratedValue
    @Column(name = "id", updatable = false, nullable = false)
    private UUID id;

    @Column(name = "username", nullable = false, unique = true, length = 50)
    private String username;

}
