package set;

import java.time.LocalDate;
import java.util.*;

public class Passport {

    private String passportNumber;
    private String name;
    private String middleName;
    private String lastName;
    private LocalDate birth;

    private static Map<String, Passport> passports = new HashMap<>();

    public Passport(String passportNumber, String name, String lastName) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public void addSetPassport(Passport passport) {
//        Как я понял этот метод должен быть в классе работника,
//        и он уже может его вызывать и производить добавление, я правильно понимаю?
        if (passports.containsValue(passport)) {
            passport.name = passport.getName();
            passport.middleName = passport.getMiddleName();
            passport.lastName = passport.getLastName();
            passport.birth = passport.getBirth();
            System.out.println("Дынные обновлены");
        } else {
            passports.put(getPassportNumber(), passport);
            System.out.println("Паспорт добавлен в список");
        }
    }

    public static void findPassport(String passportNumber) {
        System.out.println(passports.get(passportNumber));
    }

    public void setName(String name) {
        if (name == null || name.isBlank() || name.isEmpty()) {
            throw new IllegalArgumentException("Заполните поле NAME");
        } else {
            this.name = name;
        }
    }

    public void setMiddleName(String middleName) {
        if (middleName == null || middleName.isBlank() || middleName.isEmpty()) {
            throw new IllegalArgumentException("Заполните поле MIDDLE_NAME");
        } else {
            this.middleName = middleName;
        }
    }

    public void setLastName(String lastName) {
        if (lastName == null || lastName.isBlank() || lastName.isEmpty()) {
            throw new IllegalArgumentException("Заполните поле LAST_NAME");
        } else {
            this.lastName = lastName;
        }
    }

    public void setPassportNumber(String passportNumber) {
        if (passportNumber == null || passportNumber.isBlank() || passportNumber.isEmpty()) {
            throw new IllegalArgumentException("Заполните поле PASSPORT_NUMBER");
        } else {
            this.passportNumber = passportNumber;
        }
    }

    public void setBirth(LocalDate birth) {
        this.birth = birth;
    }

    public String getPassportNumber() {
        return passportNumber;
    }

    public String getName() {
        return name;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public LocalDate getBirth() {
        return birth;
    }

    public Map<String, Passport> getPassport() {
        return passports;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Passport passport = (Passport) o;
        return passportNumber.equals(passport.passportNumber);
    }

    @Override
    public int hashCode() {
        return Objects.hash(passportNumber);
    }

    @Override
    public String toString() {
        return "Passport{" +
                "passportNumber='" + passportNumber + '\'' +
                ", name='" + name + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birth=" + birth +
                '}';
    }
}
