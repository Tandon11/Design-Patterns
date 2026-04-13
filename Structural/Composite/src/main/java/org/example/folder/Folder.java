package org.example.folder;

import org.example.interfaces.FileSystemItem;

import java.util.ArrayList;
import java.util.List;

public class Folder implements FileSystemItem {
    private final String name;
    private final List<FileSystemItem> children = new ArrayList<>();

    public Folder(String name) {
        this.name = name;
    }

    public void add(FileSystemItem item) {
        children.add(item);
    }

    public void remove(FileSystemItem item) {
        children.remove(item);
    }

    @Override
    public void showDetails() {
        System.out.println("--- Folder : " + name + "---");
        for(FileSystemItem item : children) {
            item.showDetails();
        }
    }
}
