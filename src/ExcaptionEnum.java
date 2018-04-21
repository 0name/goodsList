public enum ExcaptionEnum {
    INVALID_LOGIN("Некорректный логин"),
    INVALID_PASSWORD("Некорректный пароль"),;
    private String exceptionText;
    ExcaptionEnum(String s) {
        this.exceptionText = s;
    }

    public String getExceptionText() {
        return this.exceptionText;
    }
}
