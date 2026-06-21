package com.xuanbinhhau.shopapp.model;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "social_accounts")
public class SocialAccount {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;

    @Column(name = "provider")
    String provider;

    @Column(name = "provider_id")
    String providerId;

    @Column(name = "email",length = 150)
    String email;

    @Column(name = "name",length = 100)
    String name;

    @ManyToOne(fetch = FetchType.LAZY)
    User user;

}
