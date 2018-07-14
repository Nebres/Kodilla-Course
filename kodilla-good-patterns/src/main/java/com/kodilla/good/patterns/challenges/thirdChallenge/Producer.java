package com.kodilla.good.patterns.challenges.thirdChallenge;

public interface Producer {

    String getInformationAboutCompany();
    void process(String productName, double quantity);

}
