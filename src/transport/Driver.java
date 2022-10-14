package transport;

public class Driver <A extends Transport> {

    private String name;
    private boolean license;
    private double experience;

    public Driver(String name) {
        setName(name);
    }

    public void start() {
        System.out.println("Начинаю движение!");
    }

    public void stop() {
        System.out.println("Останавливаюсь!");
    }

    public void refuel() {
        System.out.println("Заправляюсь!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name == null) {
            this.name = "default";
        } else {
            this.name = name;
        }
    }

    public void go(A car) {
        System.out.println("Водитель " + getName() + " управляет автомобилем " +
                car.getBrand() + " " + car.getModel() + ", и будет участвовать в заезде!");
    }

    public boolean isLicense() {
        return license;
    }

    public void setLicense(boolean license) {
        this.license = license;
    }

    public double getExperience() {
        return experience;
    }

    public void setExperience(double experience) {
        if (experience < 0) {
            this.experience = 0;
        } else {
            this.experience = experience;
        }
    }
}
