package Driver;

import model.Motor;
import model.Pedicab;
import model.Vehicle_Type;
import model.Car;
import java.util.Scanner;

public class Vehicle {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        Motor motor = new Motor("Yamaha", "NMAX", "Black");
        Pedicab pedicab = new Pedicab("Kawasaki", "Becak", "Yellow");
        Car car = new Car("Toyota", "Avanza", "White");
        Vehicle_Type vehType = null;
        boolean loop = true;

        while(loop && in.hasNext() ){
        
        System.out.println("Choose your option :");
        System.out.println("1. Motor");
        System.out.println("2. Pedicab");
        System.out.println("3. Car\n");

        int option = in.nextInt();
        
        if (option == 1) {
            vehType = Vehicle_Type.Motor;
            if (vehType == Vehicle_Type.Motor) {
                System.out.println(motor.showDetail());
                System.out.println();
            }
        } else if (option == 2) {
            vehType = Vehicle_Type.Pedicab;
            if (vehType == Vehicle_Type.Pedicab) {
                System.out.println(pedicab.showDetail());
                System.out.println();
            }
        } else if (option == 3) {
            vehType = Vehicle_Type.Car;
            if (vehType == Vehicle_Type.Car) {
                System.out.println(car.showDetail());
                System.out.println();
            }
        } else if (option == 4) {
            loop = false;
        } else {
            System.out.println("Invalid option");
        }
    }
        in.close();
    }
}
