package transport;

public class Mechanic {

    private String name;
    private String lastName;
    private String company;
    private Transport specificity;

    public Mechanic(String name, Transport specificity) {
        this.name = name;
        this.specificity = specificity;
    }

    public void service() {
        System.out.println("Техобслуживание проведено!");
    }

    public void fixCar() {
        System.out.println("Машина починена!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public Transport getSpecificity() {
        return specificity;
    }

    public void setSpecificity(Transport specificity) {
        this.specificity = specificity;
    }

    @Override
    public String toString() {
        return "Механик " + name;
    }
}
