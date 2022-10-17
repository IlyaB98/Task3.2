package transport;

public  abstract class Driver <A extends Transport & Competing> {

    private String name;
    private String license;
    private double experience;

    public Driver(String name, String license, double experience) {
        setName(name);
        setLicense(license);
        setExperience(experience);
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

    public String isLicense() {
        return license;
    }

    public void setLicense(String license) {
        if (license == null || license.isBlank() || license.isEmpty()) {
            throw new IllegalArgumentException("Неверно указана категория прав!");
        } else {
            this.license = license;
        }
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
