package exception;

import exception.WrongLoginException;
import exception.WrongPasswordException;

public class Data {

    private String login;
    private String password;
    private String confirmPassword;



    public Data(String login, String password, String confirmPassword) {
        this.login = login;
        this.password = password;
        this.confirmPassword = confirmPassword;
    }

    public static void checkPassword(String password, String confirmPassword) throws WrongPasswordException {
        if(password.length() == 0){
            throw new WrongPasswordException("Задайте пароль!");
        }  if (password.length() > 20) {
            throw new WrongPasswordException("Пароль слишком длинный!");
        } else if (!containsAllowedSymbols(password)) {
            throw new WrongPasswordException("Недопустимые символы!");
        } else if (!password.equals(confirmPassword)) {
            throw new WrongPasswordException("Пароли не совпадают!");
        } else {
            System.out.println("Пароль правильный!");
        }
    }

    public static boolean containsAllowedSymbols(String value) {
        for (int i = 0; i < value.length(); i++) {
            char symbol = value.charAt(i);
            boolean isCharValid = (symbol >= 'a' && symbol <= 'z') || (symbol >= 'A' && symbol <= 'Z') ||
                    (symbol >= '0' && symbol <= '9') || symbol == '_';
            if (!isCharValid) {
                return false;
            }
        }
        return true;
    }

    public static void checkLogin(String login) throws WrongLoginException {
        if (login.length() == 0 || login.length() > 20 || !containsAllowedSymbols(login)) {
            throw new WrongLoginException("Неправильно задан логин!");
        } else {
            System.out.println("Логин правильный!");
        }
    }


    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    public static void data(String login, String password, String confirmPassword) {
    }
}
