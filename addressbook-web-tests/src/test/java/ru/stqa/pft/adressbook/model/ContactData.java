package ru.stqa.pft.adressbook.model;

public class ContactData {

    private final String firstname;
    private final String lastname;
    private final String nickname;
    private final String mobile;
    public ContactData(String firstname, String lastname, String nickname, String mobile) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.nickname = nickname;
        this.mobile = mobile;
    }

    public String getFirstname() { return firstname; }
    public String getLastname() { return lastname; }
    public String getNickname() { return nickname; }
    public String getMobile() { return mobile; }
}
