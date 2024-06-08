package org.example.structural.composite.realization;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
public class File implements FileExplorerItem {
    private Long id;
    private Integer size;

    @Override
    public void printInfo() {
        System.out.printf("information about file [file_example%d.txt]\t\t-\t\tsize: [%dkb]\n", id, size);
    }
}
