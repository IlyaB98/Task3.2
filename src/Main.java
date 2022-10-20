import transport.*;
import exception.*;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

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
        DriverCategoryB vladimir = new DriverCategoryB("Владимир", "B", 4, audi);
//        vladimir.go();
//
//        System.out.println();
//        audi.setBodyType(PassengerCar.BodyType.СЕДАН);
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

//        List carList = new ArrayList<Transport>();
//
//        Sponsor redbull = new Sponsor("Redbull");
//        Sponsor avito = new Sponsor("Avito");
//        Mechanic andrey = new Mechanic("Андрей", audi);
//        audi.addDriver(vladimir);
//        audi.addSponsor(redbull);
//        audi.addSponsor(avito);
//        audi.addMechanic(andrey);
//        audi.information();

//        ServiceStation serviceStation = new ServiceStation();
//        serviceStation.addTransport(audi);
//        serviceStation.addTransport(truck1);
//        serviceStation.technicalInspection();

        chessBoard();
    }

    public static void supermarket() {

        Queue<String> queue1 = new ArrayDeque<>(5);
        Queue<String> queue2 = new ArrayDeque<>(5);

        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue1.offer("Покупатель" + (i + 1));
        }
        for (int i = 0; i < Math.floor(Math.random() * 5); i++) {
            queue2.offer("Покупатель" + (i + 1));
        }
    }
    public static void addStringToQueue(String name, Queue<String> q1, Queue<String> q2) {
        if (q1.size() == q2.size() && q1.size() == 5) {
            System.out.println("Галя иди за кассу!");
        } else if (q1.size() <= q2.size()) {
            q1.add(name);
            System.out.println(name + " встал в очередь на 1 кассу");
        } else if (q1.size() > q2.size()) {
            q2.add(name);
            System.out.println(name + " встал в очередь на 2 кассу");
        }
    }
    public static void removeStringToQueue(Queue<String> q1, Queue<String> q2) {
        double numb = Math.random();
        if (numb >= 0.5) {
            q1.poll();
        }
        if (numb < 0.5) {
            q2.poll();
        }
    }

    public static void chessBoard() {
        List<List<String>> biDemArrList = new ArrayList<>();
        boolean change = true;
        for (int i = 0; i < 8; i++) {
            biDemArrList.add(i, new ArrayList<>());
            for (int j = 0; j < 8; j++) {
                int relation = 0;
                if (change) relation = 1;
                if (j % 2 != relation) {
                    biDemArrList.get(i).add(j, "◯");
                } else {
                    biDemArrList.get(i).add(j, "●");
                }
            }
            change = !change;
        }
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                System.out.print(biDemArrList.get(i).get(j) + " ");
            }
            System.out.println();
        }
    }
}

