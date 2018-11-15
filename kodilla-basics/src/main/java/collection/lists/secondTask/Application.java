package collection.lists.secondTask;

import java.util.Arrays;
import java.util.List;

public class Application {


    private static List<String> initCompaniesList() {
        return Arrays.asList (
            "DELL", "APPLE", "SAMSUNG", "SONY","ALCATEL" );
    }

    public static void main (String[] args) {

        new Processor(initCompaniesList()).runProcces();
    }

}
