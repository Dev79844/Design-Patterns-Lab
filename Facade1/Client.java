package Facade1;
import java.util.*;

public class Client {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the dealership");
        System.out.println("1. Royal Enfield");
        System.out.println("2. Triumph");
        System.out.println("3. BMW");
        System.out.println("Enter your choice:");
        int n = sc.nextInt();

        switch(n){
            case 1:
                System.out.println(Dealership.getBike(BikeType.RE));
                break;

            case 2:
                System.out.println(Dealership.getBike(BikeType.TRIUMPH));
                break;

            case 3:
                System.out.println(Dealership.getBike(BikeType.BMW));
                break;
        }
        sc.close();
    }
}
