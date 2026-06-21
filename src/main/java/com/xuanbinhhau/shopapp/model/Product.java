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
@Table(name = "products")
public class Product extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    Long id;

    @Column(name = "name",nullable = false,length = 250)
    String name;

    Float price;

    @Column(name = "thumbnail",nullable = true,length = 250)
    String thumbnail;

    @Column(name = "description",nullable = true,length = 250)
    String description;

    @ManyToOne
    @Column(name = "category_id")
    private Category categoryId;


}
