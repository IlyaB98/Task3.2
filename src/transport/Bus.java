package transport;

public class Bus extends Transport implements Competing{

    public enum BodyType {
        ОСОБО_МАЛАЯ("до 10 мест"),
        МАЛАЯ("до 25 мест"),
        СРЕДНЯЯ("40–50 мест"),
        БОЛЬШАЯ("60–80 мест"),
        ОСОБО_БОЛЬШАЯ("100–120 мест");

        private String capacity;
        BodyType(String capacity) {
            this.capacity = capacity;
        }

        public String getCapacity() {
            return capacity;
        }

        public void setCapacity(String capacity) {
            this.capacity = capacity;
        }
    }
    private BodyType bodyType;

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    public void typeCar() {
        for(BodyType c : BodyType.values()){
            if (getBodyType() == null) {
                System.out.println("Данных по авто недостаточно!");
                break;
            }else if (getBodyType().name().equals(c.name())) {
                System.out.println(getBrand() + " " + getModel() + ", вместимость - " + c.name().toLowerCase());
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
