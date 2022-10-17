package transport;

public class PassengerCar extends Transport implements Competing{

public enum BodyType {СЕДАН, ХЕТЧБЕК, КУПЕ, УНИВЕРСАЛ, ВНЕДОРОЖНИК, КРОССОВЕР, ПИКАП, ФУРГОН, МИНИВЭН}

    private BodyType bodyType;

    public PassengerCar(String brand, String model, double engineVolume) {
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
        for(BodyType c : BodyType.values()){
            if (getBodyType() == null) {
                System.out.println("Данных по авто недостаточно!");
                break;
            }else if (getBodyType().name().equals(c.name())) {
                System.out.println(getBrand() + " " + getModel() + ", это - " + c.name().toLowerCase());
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
