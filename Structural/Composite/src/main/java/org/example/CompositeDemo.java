package org.example;

import org.example.folder.Folder;
import org.example.leaf.File;

public class CompositeDemo {
    static void main() {
        File resume = new File("Resume.pdf");
        File image = new File("image.png");
        File audio = new File("audio.mp3");

        Folder root = new Folder("My Documents");
        Folder subFolder = new Folder("work");

        subFolder.add(audio);
        root.add(image);
        root.add(resume);
        root.add(subFolder);

        root.showDetails();

        root.remove(resume);
        root.showDetails();
    }
}
