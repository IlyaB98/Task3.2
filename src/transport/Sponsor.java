package transport;

public class Sponsor {

    private String name;
    private double sum;

    public Sponsor(String name) {
        this.name = name;
    }

    public void sponsorRace() {
        System.out.println("Заезд спонсирует " + getName());
    }

    public String getName() {
        return name;
    }

    public double getSum() {
        return sum;
    }

    public void setSum(double sum) {
        this.sum = sum;
    }

    @Override
    public String toString() {
        return "Спонсор " + name;

    }
}
