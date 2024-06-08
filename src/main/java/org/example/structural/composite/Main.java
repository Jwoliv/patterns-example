package org.example.structural.composite;

import org.example.structural.composite.realization.FileExplorerItem;
import org.example.structural.composite.realization.Folder;
import org.example.structural.composite.realization.File;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        FileExplorerItem component = new Folder(
                1L, "main directory",
                List.of(
                        new Folder(2L, "first inner directory", List.of(new File(1L, 30))),
                        new File(2L, 20),
                        new File(3L, 80),
                        new Folder(3L, "last inner directory", List.of(new File(4L, 10), new File(5L, 120))))
        );
        component.printInfo();
    }
}
