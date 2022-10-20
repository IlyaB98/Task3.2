package transport;

import java.util.ArrayList;
import java.util.List;

public abstract class Transport {
    private String brand;
    private String model;
    private double engineVolume;

    private final List drivers = new ArrayList<Driver>();
    private final List mechanics = new ArrayList<Mechanic>();
    private final List sponsors = new ArrayList<Sponsor>();


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
        sponsors.add(sponsor);
    }
    public void addDriver(Driver driver) {
        drivers.add(driver);
    }

    public void addMechanic(Mechanic mechanic) {
        mechanics.add(mechanic);
    }

    public List getDriver() {
        return drivers;
    }

    public List getMechanics() {
        return mechanics;
    }

    public List getSponsors() {
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
