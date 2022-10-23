package transport;

import java.util.Objects;

public abstract class Driver<A extends Transport & Competing> {

    private String name;
    private String license;
    private double experience;
    private A transport;

    public Driver(String name, String license, double experience, A transport) {
        setName(name);
        setLicense(license);
        setExperience(experience);
        this.transport = transport;
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

    public String getLicense() {
        return license;
    }

    public A getTransport() {
        return transport;
    }

    public void setTransport(A transport) {
        this.transport = transport;
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

    public void go() {
        System.out.println("Водитель " + getName() + " управляет автомобилем " +
                transport.getBrand() + " " + transport.getModel() + ", и будет участвовать в заезде!");
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

    @Override
    public String toString() {
        return  name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Driver<?> driver = (Driver<?>) o;
        return Double.compare(driver.experience, experience) == 0 && name.equals(driver.name) &&
                Objects.equals(license, driver.license) && Objects.equals(transport, driver.transport);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, license, experience, transport);
    }
}
