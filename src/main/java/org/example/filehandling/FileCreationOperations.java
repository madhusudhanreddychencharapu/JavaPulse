package org.example.filehandling;

import java.io.File;
import java.io.IOException;

public class FileCreationOperations {
    public static void main(String[] args) throws IOException {
        File file = new File("C:\\Users\\reddy\\Desktop\\filehandling\\resume.txt");
//        if(file.isDirectory())
//            file.delete();
//        System.out.println(file.mkdir());
        if(file.isFile())
            file.delete();
        System.out.println("The file is created :"+file.createNewFile());
    }
}
