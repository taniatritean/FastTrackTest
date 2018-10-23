package org.fasttrackit.algorithm.adrianapodut.temnalab8;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;

public class FileUtilAdriana {


    public  static void saveInFile(File fileToSaveIn,String stringToWrite) {
        try {
            FileOutputStream fos=new FileOutputStream(fileToSaveIn);
            ObjectOutputStream oos=new ObjectOutputStream(fos);

            oos.writeObject(stringToWrite);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static List<String>  readFromFileStream(String fileName,File fileToRead) {
        List<String> content= null;
        try {
            FileInputStream fis=new FileInputStream(fileToRead);
            ObjectInputStream ois=new ObjectInputStream(fis);

         //perform actions here

            Path p = Paths.get(".",fileName);
            Charset c = Charset.forName("UTF-8");
            try {
                content = Files.readAllLines(p,c);
            } catch (IOException e) {
                e.printStackTrace();
            }

         //perform actions here

            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public static List<String> readFromFileAsList(String fileName) {

        Path p = Paths.get(".", fileName);
        Charset c = Charset.forName("UTF-8");
        List<String> content= null;
        try {
            content = Files.readAllLines(p,c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }



}
