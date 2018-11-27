package enums;

import java.util.Scanner;

public class PlanetWeight {
    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        System.out.println("care e greutatea ta?");
        double weight = reader.nextDouble();

        double mass = weight / Planet.EARTH.surfaceGravity();

        for (Planet planet : Planet.values()) {
            System.out.print(planet.name() );
            System.out.print(": ");
            System.out.println(planet.surfaceWeight(mass));


          }
        }
    }

