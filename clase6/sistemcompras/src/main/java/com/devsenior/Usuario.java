package com.devsenior;

public class Usuario {
    private String email;
    private String password;
    private boolean blocked;
    private boolean authenticated;


    public Usuario(String email, String password) {
        this.email = email;
        this.password = password;
        this.blocked = false;
        this.authenticated = false;
    }

    public boolean login(String password){
        if(this.blocked) return false;

        if(this.password.equals(password)){
            this.authenticated = true;
            return true;
        }
        return false;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public boolean isAuthenticated() {
        return authenticated;
    }
    
    

    
}
