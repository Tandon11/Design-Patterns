package org.example.leaf;

import org.example.interfaces.FileSystemItem;

public class File implements FileSystemItem {
    private final String name;

    public File(String name) {
        this.name = name;
    }

    @Override
    public void showDetails() {
        System.out.println("File : "+name);
    }
}
