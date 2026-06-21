package com.xuanbinhhau.shopapp.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import lombok.experimental.FieldDefaults;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@FieldDefaults(level = AccessLevel.PRIVATE)
public class OrderDTO {
    @JsonProperty("user_id")
    Long userId;
    @JsonProperty("fullname")
    String fullName;

    String email;
    @JsonProperty("phone_number")
    String phoneNumber;

    String address;
    String note;

    @JsonProperty("total_money")
    Float totalMoney;

    @JsonProperty("shipping_address")
    String shippingAddress;

    @JsonProperty("payment_method")
    String paymentMethod;
}
