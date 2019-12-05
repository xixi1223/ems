package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

/**
 * Created by XIXI on 2019/10/25.
 */
@RequestMapping("upload")
@Controller
public class UploadController {

    @RequestMapping("up")
    public  String upload(MultipartFile sh, HttpServletRequest request) throws IOException {
        String path=request.getSession().getServletContext().getRealPath("/upload");
        sh.transferTo(new File(path,sh.getOriginalFilename()));
        return "index";
    }
}
