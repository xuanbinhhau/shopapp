package com.xuanbinhhau.shopapp.dto;

import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDetailDTO {

    Long order_id;
    Long product_id;
    Float price;
    Integer number_of_products;
    Float total_money;
    String color;


}
