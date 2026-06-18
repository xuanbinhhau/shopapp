package com.xuanbinhhau.shopapp.controller;

import com.xuanbinhhau.shopapp.dto.CategoryDTO;
import com.xuanbinhhau.shopapp.dto.ProductDTO;
import jakarta.validation.Valid;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.server.ResponseStatusException;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;
import java.util.List;
import java.util.UUID;

@RestController
@RequestMapping("${server.servlet.context-path}/products")
public class ProductController {

    @GetMapping()
    public ResponseEntity<String> getAllCategory(
            @RequestParam("page") int page,
            @RequestParam("limit") int limit){

        return ResponseEntity.ok().body(String.format("get category with, page = %d,limit = %d",page,limit));
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getProductById(@PathVariable int id){
        return ResponseEntity.ok().body("hehe");
    }

    @PostMapping(value = "",consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public ResponseEntity<String> insertProduct(@Valid @ModelAttribute ProductDTO productDTO,
                                                BindingResult result){

        List<MultipartFile> files = productDTO.getFiles();
        for (MultipartFile file :files){
            if (file != null){
                if (file.getSize() >10*1024*1024){
                    throw new ResponseStatusException(HttpStatus.PAYLOAD_TOO_LARGE);
                }
                String contenType = file.getContentType();
                if (contenType == null || contenType.startsWith("/image/")){
                    return ResponseEntity.status(HttpStatus.UNSUPPORTED_MEDIA_TYPE).body("haiz");
                }
                if (result.hasErrors()){
                    var re = result.getFieldError().getDefaultMessage().toString();
                    return ResponseEntity.badRequest().body(re);
                }
                //Lưu vào bảng product img
            }
        }
        return ResponseEntity.ok("hehe");
    }

    @PutMapping()
    public ResponseEntity<?> updateProduct(@RequestBody CategoryDTO categoryDTO){
        return ResponseEntity.ok().body("Update successfully");
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteProduct(@PathVariable long id){
        return ResponseEntity.ok().body("Delete successfully");
    }

    private String storeFile(MultipartFile file) throws IOException {
        //Get file name, remove path,Prevent hacker from overwriteing file
        String uniquefilename = StringUtils.cleanPath(file.getOriginalFilename());
        //Change uniquefilename to unique
        uniquefilename = UUID.randomUUID().toString() + uniquefilename;
        //Create folder for upload
        Path upload = Paths.get("upload");
        //Check folder exits
        if (!Files.exists(upload)){
            Files.createDirectories(upload);
        }
        // Fullpath of file
        Path destination = Paths.get(upload.toString(),uniquefilename);

        //Copppy file to fullpath
        Files.copy(file.getInputStream(),destination, StandardCopyOption.REPLACE_EXISTING);
        return uniquefilename;

    }
}
