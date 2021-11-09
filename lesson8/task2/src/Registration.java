public class Registration {
    public boolean rezult;
    String login;
    String password;
    String confirmPassword;

    public Registration() {
    }

    public Registration(String pLogin, String pPassword, String pConfirmPassword) {
        login = pLogin;
        password = pPassword;
        confirmPassword = pConfirmPassword;
    }

    public String getLogin() {
        return login;
    }
    public void setLogin(String log){ login=log;}

    public String getPassword() {
        return password;
    }
    public  void  setPassword(String pas){password=pas;}

    public String getConfirmPassword() {
        return confirmPassword;
    }
public void setConfirmPassword(String conPas){confirmPassword=conPas;}

    public void loginException(String pLogin) throws WrongLoginException {
        if(pLogin==null || pLogin.isEmpty()){
            throw new WrongLoginException("не введен логин!");
        }if(pLogin.length()>20){
            throw new WrongLoginException("колличество символов login превышает допустимое значение!");
        }if(!pLogin.matches("\\w+")){
            throw new WrongLoginException("не корректный символ в логине!");
        }
    }

    public void passwordException(String pPassword, String pConfirmPassword)throws WrongPasswordException{
        if (pPassword == null || pPassword.isEmpty()) {
            throw new WrongPasswordException("не введен пароль!");
        }if(pPassword.length()>20 || pPassword!=pConfirmPassword){
            throw new WrongPasswordException("колличество символов password превышает допустимое значение или парроли не совпадают!");
        }if(!pPassword.matches("\\w+")){
            throw new WrongPasswordException("не корректный символ в логине!");
        }
    }

    public boolean rezult(String pLogin, String pPassword, String pConfirmPassword) throws WrongLoginException, WrongPasswordException {

        try {
            loginException(pLogin);
            passwordException(pPassword, pConfirmPassword);
            return true;
        } catch (WrongLoginException | WrongPasswordException ex) {
            System.out.println(ex.getMessage());
            return  false;
        }


    }}
