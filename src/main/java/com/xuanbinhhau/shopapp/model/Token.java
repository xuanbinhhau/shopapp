package com.xuanbinhhau.shopapp.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "tokens")
public class Token {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "token",length = 255)
    String token;

    @Column(name = "token_type",length = 50)
    String tokenType;

    @Column(name = "expiration_date")
    LocalDateTime expirationDate;

    boolean revoked;
    boolean expired;

    @ManyToOne
    @Column(name = "user_id")
    User user;


}
