package set;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.Set;

public class Passport {

    private String passportNumber;
    private String name;
    private String middleName;
    private String lastName;
    private LocalDate birth;

    private static Set<Passport> passports = new HashSet<>();

    public Passport(String passportNumber, String name, String lastName) {
        this.passportNumber = passportNumber;
        this.name = name;
        this.lastName = lastName;
    }

    public void addSetPassport() {
        if (passports.contains(this)) {
            this.name = this.getName();
            this.middleName = this.getMiddleName();
            this.lastName = this.getLastName();
            this.birth = this.getBirth();
            System.out.println("Дынные обновлены");
        } else {
            passports.add(this);
            System.out.println("Паспорт добавлен в список");
        }
    }

    public static void findPassport(String passportNumber) {
        for (Passport current : passports) {
            if (current.getPassportNumber().equals(passportNumber)) {
                System.out.println(current);
            } else {
                System.out.println("null");
            }
        }
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

    public Set<Passport> getPassport() {
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
