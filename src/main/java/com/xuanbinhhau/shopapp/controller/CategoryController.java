package com.xuanbinhhau.shopapp.controller;

import com.xuanbinhhau.shopapp.dto.CategoryDTO;
import jakarta.validation.Valid;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("${server.servlet.context-path}/categorys")
public class CategoryController {
    @GetMapping()
    public ResponseEntity<String> getAllCategory(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit){

        return ResponseEntity.ok().body(String.format("get category with, page = %d,limit = %d",page,limit));
    }

    @PostMapping()
    public ResponseEntity<String> insertCategory(@Valid @RequestBody CategoryDTO categoryDTO,
                                                 BindingResult result){
        if (result.hasErrors()){
            var re = result.getFieldError().getDefaultMessage().toString();
            return ResponseEntity.badRequest().body(re);
        }
        return ResponseEntity.ok("hehe" + categoryDTO.getName() );
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
