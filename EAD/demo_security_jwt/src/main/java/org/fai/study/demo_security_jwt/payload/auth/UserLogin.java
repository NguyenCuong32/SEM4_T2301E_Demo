package org.fai.study.demo_security_jwt.payload.auth;

public class UserLogin {
    private String username;
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserLogin(String username, String password) {
        this.username = username;
        this.password = password;
    }
}
