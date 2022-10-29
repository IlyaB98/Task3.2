import hashmap.Directory;
import product.Product;
import product.Recipe;
import transport.*;
import exception.*;

import java.util.*;

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
//        audi.addSponsor(redbull);
//        audi.addSponsor(avito);
//        audi.addMechanic(andrey);
//        audi.information();

//        ServiceStation serviceStation = new ServiceStation();
//        serviceStation.addTransport(audi);
//        serviceStation.addTransport(truck1);
//        serviceStation.technicalInspection();

//        chessBoard();

        Product banana = new Product("Банан", 10, 1.0);
        Product tangerine = new Product("Мандарин", 8.5, 0.5);
        Product peach = new Product("Персик", 8.2, 1.5);
        Product mango = new Product("Манго", 15.1, 1.0);

//        ProductList productList = new ProductList();
//        productList.addProduct(banana);
//        productList.addProduct(tangerine);
//        productList.addProduct(peach);
//        productList.addProduct(mango);
////        productList.addProduct(banana);
//        productList.removeProduct(mango);


        Recipe fruitSalad = new Recipe("Фруктовый с йогуртом",new Recipe.ProductWithQuantity(banana, 3),
                new Recipe.ProductWithQuantity(mango, 2));
        Recipe fruitSalad2 = new Recipe("Фруктовый",new Recipe.ProductWithQuantity(banana, 4),
                new Recipe.ProductWithQuantity(mango, 2), new Recipe.ProductWithQuantity(peach, 3));
        Recipe fruitSalad3 = new Recipe("Фруктовый в сметане", new Recipe.ProductWithQuantity(banana, 1),
                new Recipe.ProductWithQuantity(mango, 1));
//        System.out.println(fruitSalad);

        fruitSalad.addRecipe();
        fruitSalad2.addRecipe();
        fruitSalad.priceDish();

//        SetInteger integer = new SetInteger();
//        integer.randomSetInteger();
//        integer.removeOddNumber();

//        Example example = new Example();
//        example.generateTask();

//        Passport passport1 = new Passport("245363","Артем", "Громов");
//        passport1.addSetPassport();
//        Passport.findPassport("245363");

//        Directory directory = new Directory();
//        directory.addDirectory("Человек1", "+7924584682");
//        directory.addDirectory("Человек2", "+79245684682");
//        directory.addDirectory("Человек3", "+79245654682");
//        directory.addDirectory("Человек4", "+792354682");
//        directory.addDirectory("Человек5", "+76588566682");
//        directory.addDirectory("Человек6", "+7346457682");
//        directory.addDirectory("Человек7", "+7947667564682");
//        directory.addDirectory("Человек8","+793463463454682");
//        directory.addDirectory("Человек9", "+79245764744682");
//        directory.addDirectory("Человек10", "+79345645682");
//        directory.addDirectory("Человек11", "+79265865682");
//        directory.addDirectory("Человек12", "+7922545645");
//        directory.addDirectory("Человек13", "+7926375477");
//        directory.addDirectory("Человек14", "+7924356682");
//        directory.addDirectory("Человек15", "+776984682");
//        directory.addDirectory("Человек16", "+7976954682");
//        directory.addDirectory("Человек17", "+796485796682");
//        directory.addDirectory("Человек18", "+775969860682");
//        directory.addDirectory("Человек19", "+75875696904682");
//        directory.addDirectory("Человек20", "+754756884682");
//
//        directory.printAllDirectory();


//        List<Integer> list1 = new ArrayList<>();
//        list1.add(10);
//        list1.add(20);
//        list1.add(30);
//        List<Integer> list2 = new ArrayList<>();
//        list2.add(50);
//        list2.add(3450);
//        list2.add(30);
//        List<Integer> list3 = new ArrayList<>();
//        list3.add(540);
//        list3.add(450);
//        list3.add(60);
//        Map<String, List<Integer>> map = new HashMap<>();
//        map.put("Ключ1", list1);
//        map.put("Ключ2", list2);
//        map.put("Ключ3", list3);
//        System.out.println(map.keySet());
//        System.out.println(map.values());
//
//        Map<String, Integer> map2 = new HashMap<>();
//        map2.put("Ключ1", sumNumberList(list1));
//        map2.put("Ключ2", sumNumberList(list2));
//        map2.put("Ключ3", sumNumberList(list3));
//        System.out.println(map2.keySet());
//        System.out.println(map2.values());
//
//        Map<Integer, String> map3 = new LinkedHashMap<>();
//        map3.put(1, "Один");
//        map3.put(2, "Два");
//        map3.put(3, "Три");
//        map3.put(4, "Четыре");
//        map3.put(5, "Пять");
//        map3.put(6, "Шесть");
//        map3.put(7, "Семь");
//        map3.put(8, "Восемь");
//        map3.put(3455, "Девять");
//        map3.put(10, "Десять");
//        System.out.println(map3.keySet());
//        System.out.println(map3.values());

//        Map<String, Integer> task1_3 = new HashMap<>();
//        task1_3.put("str1", 2);
//        addMapTask1_3(task1_3, "str2", 1);
////        addMapTask1_3(task1_3, "str1", 2);
//        addMapTask1_3(task1_3, "str1", 5);


    }

    public static void addMapTask1_3(Map<String, Integer> map, String str, Integer numb) {
        if (!map.containsKey(str)) {
            map.put(str, numb);
            System.out.println("Данные добавлены в коллекцию");
        } else if (map.containsKey(str) && map.get(str).equals(numb)) {
            throw new RuntimeException("Данный объект уже существует");
        } else if (map.containsKey(str) && !map.get(str).equals(numb)) {
            map.replace(str,map.get(str), numb);
            System.out.println("Дынные обновлены");
        }
    }
    public static int sumNumberList(List<Integer> list) {
        int sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += list.get(i);
        }
        return sum;
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

