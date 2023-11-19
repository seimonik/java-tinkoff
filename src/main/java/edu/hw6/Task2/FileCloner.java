package edu.hw6.Task2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class FileCloner {
    public static void cloneFile(Path sourcePath) {
        String fileName = sourcePath.getFileName().toString();
        String baseName = fileName.substring(0, fileName.lastIndexOf('.'));
        String extension = fileName.substring(fileName.lastIndexOf('.'));

        int copyNumber = 1;

        Path destinationPath = sourcePath.resolveSibling(getCopyName(baseName, copyNumber) + extension);

        while (Files.exists(destinationPath)) {
            copyNumber++;
            destinationPath = sourcePath.resolveSibling(getCopyName(baseName, copyNumber) + extension);
        }

        try {
            Files.copy(sourcePath, destinationPath);
            System.out.println("File cloned: " + destinationPath);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static String getCopyName(String baseName, int copyNumber) {
        if (copyNumber == 1) {
            return baseName + " — копия";
        } else {
            return baseName + " — копия (" + copyNumber + ")";
        }
    }
}
