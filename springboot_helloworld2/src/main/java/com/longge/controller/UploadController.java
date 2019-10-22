package com.longge.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

/**
 * @author longge
 * @create 2019-10-21 下午7:06
 */
@RestController
public class UploadController {

    @RequestMapping("/fileupload")
    public Map<String,Object> fileUpload(MultipartFile upload) throws Exception{
        upload.transferTo(new File("/Users/longyonghua/Desktop/"+upload.getOriginalFilename()));
        Map<String,Object> map = new HashMap<>();
        map.put("msg","ok");
        return map;
    }

}
