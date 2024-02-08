package com.exception.main;

import com.exception.io.FileReader;
import com.exception.io.FileReaderWithoutHandling;

public class ExceptionModuleRunner {

    public static void main(String[] args) {
        FileReaderWithoutHandling fileReader = new FileReaderWithoutHandling();
        fileReader.readFile();
    }
}