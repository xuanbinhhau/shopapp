package com.xuanbinhhau.shopapp.controller;

import com.xuanbinhhau.shopapp.dto.CategoryDTO;
import com.xuanbinhhau.shopapp.dto.OrderDTO;
import com.xuanbinhhau.shopapp.dto.OrderDetailDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("${server.servlet.context-path}/orderdetails")
public class OrderDetailController {
    //Thêm mới 1 orderdetails
    @PostMapping()
    public ResponseEntity<?> createOrderDetail(@Valid @RequestBody OrderDetailDTO orderDetailDTO){



        return ResponseEntity.ok().body("Ok tạo xong orderdetail r nhé fen");
    }

    @GetMapping()
    public ResponseEntity<?> getOrderDetail(@Valid @PathVariable Long orderID){
        return ResponseEntity.ok().body("This is order id of" + orderID);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateOrderDetail(@PathVariable String id,@RequestBody OrderDetailDTO dto){
        return ResponseEntity.ok().body("Update OrderDetail successfully");
    }
}
