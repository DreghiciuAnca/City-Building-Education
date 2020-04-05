package connectLayer;

import businessLayer.*;


public class Main {
    public static void main(String[] args) {
        City nou = new City();
        nou.setName("Sebes");
        nou.setCityId(1);
        nou.setScore(25);
        nou.setPollution(100);
        CityTableGateway citytable = new CityTableGateway();
        citytable.insertCity(nou);


    }
}
