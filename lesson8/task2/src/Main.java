import javax.security.auth.login.LoginException;

public class Main {

    public static void main(String[] args) throws WrongLoginException, WrongPasswordException {
        Registration reg = new Registration("jfknfrjfyjfjk_ykyt", "rrfuf", "rrfuf");
        if (reg.rezult(reg.login, reg.password, reg.confirmPassword)) {
            System.out.println("Регистрация прошла успешно");
        }
    }
}
