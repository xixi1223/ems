package com.baizhi.controller;

import org.apache.commons.io.IOUtils;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.net.URLEncoder;

/**
 * Created by XIXI on 2019/10/25.
 */
@Controller
@RequestMapping("down")
public class Down {


    @RequestMapping("Do")
    public void down(String FileName, String openStyle,HttpServletResponse response, HttpServletRequest request) throws IOException {
        openStyle=openStyle==openStyle?"attachment":openStyle;
        String path= request.getSession().getServletContext().getRealPath("/Down");
        File file=  new File(path,FileName);
        FileInputStream is = new FileInputStream(file);
        //附件下载设置中文编码问题 附件形式下载 attachment
        response.setHeader("content-disposition",openStyle+";fileName"+ URLEncoder.encode(FileName,"UTF-8"));
        ServletOutputStream os=response.getOutputStream();
        IOUtils.copy(is,os);
        IOUtils.closeQuietly(is);
        IOUtils.closeQuietly(os);
    }
}
