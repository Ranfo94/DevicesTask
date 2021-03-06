package utils;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.util.Random;

public class RandomStringSelector {

    public String selectRandomString(){
        List<String> lines = null;
        try {
            lines = Files.readAllLines(new File("C:\\Users\\ranf2\\IdeaProjects\\DevicesTask\\src\\words.txt").toPath());
        } catch (IOException e) {
            e.printStackTrace();
        }
        Random rand = new Random();
        return lines.get(rand.nextInt(lines.size()));
    }

}
