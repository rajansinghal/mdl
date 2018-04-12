package com.xebia.firm.controller;

import com.xebia.firm.service.FileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by rsinghal on 4/12/2018.
 */
@Controller
@RequestMapping(value = "/api/v1")
public class FileController {
    @Autowired
    private FileService fileService;

    @GetMapping(value = "/read")
    @ResponseBody
    public String getContent(@RequestParam("fpath") String fpath) {

        return fileService.getContent(fpath);

    }
}
