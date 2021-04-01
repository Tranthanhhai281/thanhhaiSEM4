package com.example.myuploadfiles;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.File;

@SpringBootApplication
public class MyuploadfilesApplication {

    public static void main(String[] args) {
        new File(UploadingController.uploadingDir).mkdirs();
        SpringApplication.run(MyuploadfilesApplication.class, args);
    }

}
