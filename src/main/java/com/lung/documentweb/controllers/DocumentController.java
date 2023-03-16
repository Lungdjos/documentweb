package com.lung.documentweb.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class DocumentController {

    // method to display the upload page
    @RequestMapping("/displayUpload")
    public String displayUpload(){ return "documentUpload";}
}
    // method to handle the file upload
