package JavaNewFeatures;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File {

    public static void main(String[] args) throws IOException {

        Path path = Paths.get("sample.txt");
        String text = Files.readString(path);
        System.out.println(text);
        String newText = text.replace("Hey","Hoo");
        Path newPath = Paths.get("New.txt");
        Files.writeString(newPath, newText);

    }


}
