package org.example.structural.composite.realization;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
public class Folder implements FileExplorerItem {
    private Long id;
    private String title;
    private List<FileExplorerItem> elements;

    @Override
    public void printInfo() {
        System.out.printf("Directory: [%d] - [%s]\n", id, title);
        elements.forEach(FileExplorerItem::printInfo);
    }
}
