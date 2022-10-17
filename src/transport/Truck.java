package transport;

public class Truck extends Transport implements Competing {

    private BodyType bodyType;


    public enum BodyType {
        N1("с полной массой до 3,5 тонн"),
        N2("с полной массой свыше 3,5 до 12 тонн"),
        N3("с полной массой свыше 12 тонн");

       private String tonnage;

        BodyType(String tonnage) {
        }

        public String getTonnage() {
            return tonnage;
        }

        public void setTonnage(String tonnage) {
            this.tonnage = tonnage;
        }
    }

    public Truck(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public boolean passDiagnostics() throws CantDiagnosticException{
        double numb = Math.random();
        if (numb > 0.5) {
            System.out.println("Машина " + getBrand() + " " + getModel() + " диагностику прошла!");
            return true;
        }
        throw new CantDiagnosticException("Машина " + getBrand() + " " + getModel() + " диагностику не прошла!");
    }

    public void typeCar() {
        for (BodyType c : BodyType.values()) {
            if (getBodyType() == null) {
                System.out.println("Данных по авто недостаточно!");
                break;
            } else if (getBodyType().name().equals(c.name())) {
                System.out.println(getBrand() + " " + getModel() + ", относится к типу - " + c.name());
                break;
            }
        }
    }

    public BodyType getBodyType() {
        return bodyType;
    }

    public void setBodyType(BodyType bodyType) {
        this.bodyType = bodyType;
    }

    @Override
    public void start() {
        System.out.println("Начинаю движение!");
    }

    @Override
    public void stop() {
        System.out.println("Закончил движение!");
    }

    @Override
    public void pitStop() {
        System.out.println("Тут был пит-стоп!");
    }

    @Override
    public void bestTime() {
        System.out.println("Лучшее время за круг: ");
    }

    @Override
    public void maxSpeed() {
        System.out.println("Максимальная скорость: ");
    }
}
