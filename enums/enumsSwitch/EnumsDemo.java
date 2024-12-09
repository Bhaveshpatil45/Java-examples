package com.bhavesh.practice.enums.enumsSwitch;

enum Cars{
    BMW,
    FORD,
    AUDI,
    JAGUAR,
    FIAT,
    JEEP;
}
public class EnumsDemo {
    public static void main(String[] args) {

        Cars c;
        c = Cars.JAGUAR;

        switch (c){
            case BMW:
                System.out.println("You choose BMW !");
                break;
            case FORD:
                System.out.println("You choose FORD !");
                break;
            case AUDI:
                System.out.println("You choose ODI !");
                break;
            case JAGUAR:
                System.out.println("You choose JAGUAR !");
                break;
            case FIAT:
                System.out.println("You choose FIAT !");
                break;
            case JEEP:
                System.out.println("You choose JEEP !");
                break;
            default:
                System.out.println("New brand's Car.");
                break;
        }
    }

}
