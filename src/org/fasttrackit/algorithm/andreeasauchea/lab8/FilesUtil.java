package org.fasttrackit.algorithm.andreeasauchea.lab8;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.List;

public class FilesUtil {

    public static void main(String[] args) {

    }

    public static void saveInFile(String filename, Object object) {
        try {
            File fileOne = new File(filename);
            FileOutputStream fos = new FileOutputStream(fileOne);
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(object);
            oos.flush();
            oos.close();
            fos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    private static void readFromFileStream(String filename) {
        try {
            File fileToRead = new File(filename); // sau orice nume ai dat la fisier
            FileInputStream fis = new FileInputStream(fileToRead);
            ObjectInputStream ois = new ObjectInputStream(fis);

//perform actions here

            ois.close();
            fis.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static List<String> readFromFileAsList(String fileName) {

        Path p = Paths.get(".", fileName);
        Charset c = Charset.forName("UTF-8");
        List<String> content = null;
        try {
            content = Files.readAllLines(p, c);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return content;
    }

    public String readFromFile(String fileName) {
        Path p = Paths.get(".", fileName);
        Charset c = Charset.forName("UTF-8");
        List<String> content = null;
        try {
            content = Files.readAllLines(p, c);
        } catch (IOException e) {
            e.printStackTrace();
        }

        String rezultat = "";

        for (String s : content
        ) {
            rezultat = rezultat + s + System.getProperty("line.separator");
        }

        return rezultat;

    }

    public static void writeFile(String fileName, String content) {

        try {
            Path p = Paths.get(".", fileName);
            if (Files.exists(p)) {
                Files.write(p, content.getBytes(), StandardOpenOption.APPEND);
            } else {

                Files.write(p, content.getBytes());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile(String fileName, List<String> listOfStrings) {

        try {
            Path p = Paths.get(".", fileName);
            if (Files.exists(p)) {
                Files.write(p, listOfStrings, StandardOpenOption.APPEND);
            } else {

                Files.write(p, listOfStrings);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


}
