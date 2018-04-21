abstract class DefaultUser extends Throwable implements UserInterface {
    protected String login;
    protected String password;

    public DefaultUser(String login, String password) throws ExceptionTasker{
        this.setLogin(login);
        this.setPassword(password);
    }

    @Override
    public String getLogin() {
        return this.login;
    }

    @Override
    public void setLogin(String login) throws ExceptionTasker{ // null ""
        if(!Validator.ValidatorPassword(login)) {
            throw new ExceptionTasker(ExcaptionEnum.INVALID_LOGIN.getExceptionText());
        }
            this.login = login;
    }

    @Override
    public String getPassword() {
        return this.password;
    }

    @Override
    public void setPassword(String pass) throws ExceptionTasker{
        if(!Validator.ValidatorPassword(pass)){
            throw new ExceptionTasker(ExcaptionEnum.INVALID_PASSWORD.getExceptionText());
        }
        this.password = pass;
    }
}
