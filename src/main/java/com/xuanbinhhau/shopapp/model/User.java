package com.xuanbinhhau.shopapp.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "user")
public class User extends BaseEntity{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "fullname",length = 250)
    String fullName;

    @Column(name = "phone_number",length = 20)
    String phoneNumber;

    @Column(name = "address",length = 200)
    String address;

    @Column(name = "password",length = 200,nullable = false)
    String password;

    boolean active;

    @Column(name = "date_of_birth")
    private Date dateOfBirth;

    @Column(name = "facebook_account_id")
    int facebookAccountId;

    @Column(name = "google_account_id")
    int googleAccountId;


    @ManyToOne(fetch = FetchType.LAZY)
    @Column(name = "role_id")
    Role role;



}
