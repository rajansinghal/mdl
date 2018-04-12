package com.xebia.firm.service;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by rsinghal on 4/12/2018.
 */
public class FileServiceTest {

    FileService fileService = new FileService();

    @Test
    public void shouldReturnFileContent() throws Exception {
        assertEquals("abc",fileService.getContent("testFile.txt"));
        assertEquals("File not found",fileService.getContent("testFile.txtt"));
    }

}