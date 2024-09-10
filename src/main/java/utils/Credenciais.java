package utils;

public enum  Credenciais {

    USER("danibringteste@gmail.com", "bringTest123##");

    private final String login;
    private final String senha;

    Credenciais(String login, String senha) {
        this.login = login;
        this.senha = senha;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return senha;
    }


}
