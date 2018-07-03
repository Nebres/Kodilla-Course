import com.kodilla.good.patterns.challenges.MovieStore;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


public class MainRunner {

    public static void main(String[] args){

       Map<String, List<String>> listMap = new MovieStore().getMovies();

       String result = listMap.values().stream()
               .flatMap(s -> s.stream())
               .collect(Collectors.joining(" ! "," "," "));

       System.out.println(result);
    }

}