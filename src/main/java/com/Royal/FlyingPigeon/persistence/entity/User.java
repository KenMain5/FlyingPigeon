package com.Royal.FlyingPigeon.persistence.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@Builder
@AllArgsConstructor @NoArgsConstructor
@Setter @Getter
@ToString @EqualsAndHashCode
public class User {

    @Id @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private long id;

    private String email;

    private String username;

    private String password;
}
