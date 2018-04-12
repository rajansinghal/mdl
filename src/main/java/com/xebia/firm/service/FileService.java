package com.xebia.firm.service;

import org.springframework.stereotype.Service;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static com.xebia.firm.constants.Constant.FILE_PATH_PREFIX;
import static com.xebia.firm.constants.Constant.NO_FILE_MESSAGE;

/**
 * Created by rsinghal on 4/12/2018.
 */
@Service
public class FileService {

    public String getContent(String filePath){

        String absolutePath = FILE_PATH_PREFIX + filePath;
        String content = "";
        String currentLine;
        try (BufferedReader br = Files.newBufferedReader(Paths.get(absolutePath))) {
            while ((currentLine = br.readLine()) != null) {
                content = content + currentLine;
            }
          } catch (IOException e) {
            content = NO_FILE_MESSAGE;
        }
        return content;
    }
}


