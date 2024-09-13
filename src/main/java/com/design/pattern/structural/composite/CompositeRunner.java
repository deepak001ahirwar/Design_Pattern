package com.design.pattern.structural.composite;

import java.util.ArrayList;
import java.util.List;

public class CompositeRunner {

    public static void main(String[] args) {



        /**The Composite Design Pattern enables creating tree structures to represent part-whole
         *  hierarchies, allowing uniform treatment of individual and composite objects
         *   Object insdie Object ( file System , Directory )*/



        Directory directory = new Directory("Movie");
        FileSystem file1 = new File("Border");
        directory.addFile(file1);

        Directory directory2 = new Directory("ComedyMovie");
        FileSystem file2 = new File("Hulchul");
        directory2.addFile(file2);

        // add the ComedyMovie inside the Movice Dir
        directory.addFile(directory2);

        directory.ls();




    }
}


class Directory implements FileSystem {

    String dirName;
    List<FileSystem> fileList ;

    Directory(String dirName){
        this.dirName=dirName;
        this.fileList = new ArrayList<>();
    }

    public void addFile(FileSystem file){
        fileList.add(file);
    }

    @Override
    public void ls() {
        System.out.println(" Directory :"+dirName);
        for (FileSystem obj : fileList) {
            obj.ls();
        }
    }
}


class  File implements FileSystem {

    String fileName;

    public File(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void ls() {
        System.out.println( " File: "+ fileName );
    }
}

interface  FileSystem {
    public void ls();
}
