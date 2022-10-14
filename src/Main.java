import transport.Bus;
import transport.Driver;
import transport.PassengerCar;
import transport.Truck;

public class Main {
    public static void main(String[] args) {

        PassengerCar lada = new PassengerCar("Lada", "Grande", 1.7);
        System.out.println(lada);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0);
        System.out.println(audi);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3.0);
        System.out.println(bmw);

        System.out.println();
        Truck truck1 = new Truck("Truck-1", "A1", 4.0);
        System.out.println(truck1);
        Truck truck2 = new Truck("Truck-2", "A2", 4.5);
        System.out.println(truck2);
        Truck truck3 = new Truck("Truck-3", "A3", 3.0);
        System.out.println(truck3);

        System.out.println();
        Bus bus1 = new Bus("Автобус-1", "B1", 2020);
        System.out.println(bus1);
        Bus bus2 = new Bus("Автобус-2", "B2", 2021);
        System.out.println(bus2);
        Bus bus3 = new Bus("Автобус-3", "B3", 2016);
        System.out.println(bus3);

        System.out.println();
        Driver<PassengerCar> vladimir = new Driver<>("Владимир");
        vladimir.go(audi);
    }
}