package LLD_Sytem_Design.CompositeDesignPattern.FileSystem;

import java.util.ArrayList;
import java.util.List;

public class Directory implements FileSystem {
    List<FileSystem> fileSystemList;
    String directoryName;

    public Directory(String directoryName) {
        this.fileSystemList = new ArrayList<>();
        this.directoryName = directoryName;
    }

    public void add(FileSystem fileSystemObj){
        fileSystemList.add(fileSystemObj);
    }

    @Override
    public void ls() {
        System.out.println("Directory name: " + directoryName);
        for(FileSystem fileSystem:fileSystemList){
            fileSystem.ls();
        }
    }
}
