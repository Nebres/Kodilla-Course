package collection.lists.secondTask;

import java.util.List;

public class Processor {

    private final List<String> companies;
    private static final String SEPARATOR = ", ";

    public Processor(List<String> companies) {
        this.companies = companies;
    }

    public void runProcces() {

        StringBuilder buldier = new StringBuilder();

        for (int i = 0; i < companies.size(); i++) {
            if (i == companies.size() - 1 ){
                buldier.append(companies.get(i));
            } else {
                buldier.append(companies.get(i)).append(SEPARATOR);
            }
        }
        System.out.println(buldier.toString());
    }

}
