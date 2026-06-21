package com.xuanbinhhau.shopapp.model;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;


    @ManyToOne
    @Column(name = "user_id")
    User user;

    String fullname;

    String email;

    @Column(name = "phone_number",nullable = false,length = 20)
    String phoneNumber;

    @Column(name = "address")
    String adress;

    String note;

    @Column(name = "order-date")
    LocalDateTime orderDate;

    @Column(name = "status")
    String status;

    @Column(name = "total_money")
    Float totalMoney;

    @Column(name = "shipping_method")
    Float shippingMethod;

    @Column(name = "shipping_address")
    Float shippingAdress;

    @Column(name = "shipping_date")
    Date shippingDate;

    @Column(name = "tracking_number")
    String trakingNumber;

    @Column(name = "payment_method")
    String paymentMethod;

    @Column(name = "payment_status")
    String paymentStatus;

    @Column(name = "payment_date")
    Date paymentDate;

    @Column(name = "active")
    Boolean active;
}
