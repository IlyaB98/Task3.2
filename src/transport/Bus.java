package transport;

public class Bus extends Transport implements Competing{

    public Bus(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
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
