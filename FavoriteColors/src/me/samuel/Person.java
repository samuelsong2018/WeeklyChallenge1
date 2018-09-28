package me.samuel;

public class Person {

    //All these are methods!

    //Shortcut for all variables: Alt+insert, then ctrl a.
    public String getName() {
        return name;
    }

    //'this' refers to the class you are currently in.
    //These variables all need the other page to instantiate ('bring to life') these variables. In the other page, use the get method.
    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFavoriteColor() {
        return favoriteColor;
    }

    public void setFavoriteColor(String favoriteColor) {
        this.favoriteColor = favoriteColor;
    }

    private String name;
    private String email;
    private String favoriteColor;
}
