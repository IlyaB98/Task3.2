import transport.*;
import exception.*;

public class Main {
    public static void main(String[] args) throws WrongLoginException, WrongPasswordException, CantDiagnosticException {

        PassengerCar lada = new PassengerCar("Lada", "Grande", 1.7);
//        System.out.println(lada);
        PassengerCar audi = new PassengerCar("Audi", "A8 50 L TDI quattro", 3.0);
//        System.out.println(audi);
        PassengerCar bmw = new PassengerCar("BMW", "Z8", 3.0);
//        System.out.println(bmw);

//        System.out.println();
        Truck truck1 = new Truck("Truck-1", "A1", 4.0);
//        System.out.println(truck1);
        Truck truck2 = new Truck("Truck-2", "A2", 4.5);
//        System.out.println(truck2);
        Truck truck3 = new Truck("Truck-3", "A3", 3.0);
//        System.out.println(truck3);

//        System.out.println();
        Bus bus1 = new Bus("Автобус-1", "B1", 3.0);
//        System.out.println(bus1);
        Bus bus2 = new Bus("Автобус-2", "B2", 3.0);
//        System.out.println(bus2);
        Bus bus3 = new Bus("Автобус-3", "B3", 3.5);
//        System.out.println(bus3);
//
//        System.out.println();
        DriverCategoryB vladimir = new DriverCategoryB("Владимир", "B",4, audi);
        vladimir.go();
//
//        System.out.println();
//        audi.setBodyType(PassengerCar.BodyType.ФУРГОН);
//        audi.typeCar();
//        System.out.println();
//        truck1.setBodyType(Truck.BodyType.N3);
//        truck1.typeCar();
//        System.out.println();
//        bus1.setBodyType(Bus.BodyType.СРЕДНЯЯ);
//        bus1.typeCar();

//        Data data = new Data("NDho3242535tnsJnjsd", "KSAEngusrnin246487_", "KSAEngusrnin246487_");
//        Data.checkLogin(data.getLogin());
//        Data.checkPassword(data.getPassword(), data.getConfirmPassword());

//        audi.passDiagnostics();



    }
}