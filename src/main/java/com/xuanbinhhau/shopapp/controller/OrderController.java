package com.xuanbinhhau.shopapp.controller;

import com.xuanbinhhau.shopapp.dto.CategoryDTO;
import com.xuanbinhhau.shopapp.dto.OrderDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@RequestMapping("${server.servlet.context-path}/orders")
public class OrderController {
    @GetMapping()
    public ResponseEntity<String> getAllOrder(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit){

        return ResponseEntity.ok().body(String.format("get order with, page = %d,limit = %d",page,limit));
    }

    @PostMapping()
    public ResponseEntity<?> createOrder(@Valid @RequestBody OrderDTO orderDTO,
                                              BindingResult result){
       try{
           if (result.hasErrors()){
               List<String> errorMessages = result.getFieldErrors()
                       .stream().map(FieldError::getDefaultMessage).toList();
               return ResponseEntity.badRequest().body(errorMessages);
           }

       }catch (Exception e) {
           return ResponseEntity.badRequest().body(e.getMessage());
       }
            return ResponseEntity.ok("hehe" + orderDTO.getFullName());
    }

    @PutMapping()
    public ResponseEntity<?> updateCategory(@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok().body("Update successfully");
    }

    @DeleteMapping
    public ResponseEntity<?> deleteCategory(){
        return ResponseEntity.ok().body("Delete successfully");
    }
}
