public class Validator {
    public static boolean ValidatorLogin(String login){
        if(login == null || login.trim().length()<3) {
            return false;
        }
        return true;
    }
    public static boolean ValidatorPassword(String password){
        if(password == null || password.isEmpty()) {
            return false;
        }
        return true;
    }
}
