package org.example;

import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {

        Student st1 = new Student("ridma",27);
        Student st2 = new Student("john",25);

        ObjectMapper mapper = new ObjectMapper();

        Path newFile = Paths.get("E:\\Coding\\FIrsrMaven\\result.txt");

        mapper.writeValue(new File("result.txt"), st1);

        Student s=mapper.readValue(new File("result.txt"),Student.class);
        System.out.println(s);

        mapper.writeValue(newFile.toFile(), st2);
        mapper.writeValue(newFile.toFile(), st2);
        mapper.writeValue(newFile.toFile(), st1);


    }
}