import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<String> lines = Collections.emptyList();
        try {
            lines = Files.readAllLines(Paths.get("C:\\Users\\tatec\\IdeaProjects\\Day1\\src\\data.txt"), StandardCharsets.UTF_8);

        } catch(IOException e){
            e.printStackTrace();
        }

        solution(lines);
    }
    public static void solution(List<String> input) {

        for(int i = 0; i < input.size(); i++){
            for(int j = i + 1; j < input.size(); j++){
                int x = Integer.parseInt(input.get(i));
                int y = Integer.parseInt(input.get(j));

                if(x + y == 2020){
                    System.out.println(x * y);
                }
            }
        }
    }
}
