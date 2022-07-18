package net.mikoto.socialengineering.core.model;

import java.util.Objects;

/**
 * @author mikoto
 * Create for core
 * Create at 2022/7/17
 */
public class Mail {
    private String mail = null;
    private String password = null;

    public Mail(String mail, String password) {
        this.mail = mail;
        this.password = password;
    }

    public Mail() {

    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Mail mail1 = (Mail) o;
        return Objects.equals(mail, mail1.mail) && Objects.equals(password, mail1.password);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mail, password);
    }

    @Override
    public String toString() {
        return "Mail{" +
                "mail='" + mail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
