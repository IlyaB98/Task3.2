package transport;

import java.util.HashSet;
import java.util.Set;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final Set<Driver> drivers = new HashSet<>();
    private final Set<Mechanic> mechanics = new HashSet<>();
    private final Set<Sponsor> sponsors = new HashSet<>();


    public Transport(String brand, String model, double engineVolume) {
        setBrand(brand);
        setModel(model);
        setEngineVolume(engineVolume);
    }

    public void information() {
        System.out.println("Водитель " + getDriver() + ", спонсоры:\n" + getSponsors() +
                "\nмеханики:\n" + getMechanics());
    }

    public abstract boolean passDiagnostics() throws CantDiagnosticException;

    public abstract void start();

    public abstract void stop();

    public void addSponsor(Sponsor sponsor) {
        if (sponsors.contains(sponsor)) {
            System.out.println("Спонсор " + sponsor.getName() + " уже был добавлен в лист спонсоров");
        } else {
            sponsors.add(sponsor);
        }
    }
    public void addDriver(Driver driver) {
        if (drivers.contains(driver)) {
            System.out.println("Спонсор " + driver.getName() + " уже был добавлен в лист спонсоров");
        } else {
            drivers.add(driver);
        }
    }

    public void addMechanic(Mechanic mechanic) {
        if (mechanics.contains(mechanic)) {
            System.out.println("Спонсор " + mechanic.getName() + " уже был добавлен в лист спонсоров");
        } else {
            mechanics.add(mechanic);
        }
    }

    public Set<Driver> getDriver() {
        return drivers;
    }

    public Set<Mechanic> getMechanics() {
        return mechanics;
    }

    public Set<Sponsor> getSponsors() {
        return sponsors;
    }

    public void setBrand(String brand) {
        if (brand == null) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if (model == null) {
            this.model = "default";
        } else {
            this.model = model;
        }
    }

    public void setEngineVolume(double engineVolume) {
        if (engineVolume <= 0) {
            this.engineVolume = 1.0;
        } else {
            this.engineVolume = engineVolume;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    @Override
    public String toString() {
        return getBrand() + " " + getModel() + ", объем двигателя " + getEngineVolume();
    }
}
