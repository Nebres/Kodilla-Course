package ThirdChallenge;

public interface Communications {

    String START_AIRPORT = "\nType departure airport ";
    String END_AIRPORT = "\nType arrival airport";
    String INTERLANDING_AIRPORT = "\nType interlanding airport";
    String MENU = "Please choose search method \n1) Flights from specified Airport. \n2) Flights to specified Airport. " +
            "\n3) Flights with interlanding.";
    String WRONG_NUMBER = "You choose wrong number! Try again. \n";
    String LIST_OF_START_AIRPORT = "We flight from: ";
    String LIST_OF_END_AIRPORT = "We flight to: ";
    String WRONG_AIRPORT = "\nYou type wrong airport. Choose Again!\n";
    String WRONG_FLIGHT_WITH_INTERLADNING = "\nSorry, there is no Flight from %s to %s with interlanding in %s";

}
