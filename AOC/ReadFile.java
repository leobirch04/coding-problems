package AOC;

import java.nio.file.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadFile {
    public static ArrayList<String> read(String args) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(args));
        ArrayList<String> line = new ArrayList<>(lines);
        return line; 
    }
}

