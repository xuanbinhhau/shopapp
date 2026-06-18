package com.xuanbinhhau.shopapp.dto;

import jakarta.validation.constraints.NotEmpty;
import lombok.AccessLevel;
import lombok.Data;
import lombok.experimental.FieldDefaults;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@FieldDefaults(level = AccessLevel.PRIVATE)
@Data
public class CategoryDTO {

    @NotEmpty (message = "NOTNULL")
    String name;

}
