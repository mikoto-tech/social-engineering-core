package net.mikoto.socialengineering.core.model;

import java.util.Objects;

/**
 * @author mikoto
 * Create for core
 * Create at 2022/7/16
 *
 * The model of a citizen.
 */
public class Citizen {
    private String name = null;
    private Gender gender = null;
    private long phoneNumber = 0;
    private String livingPlace = null;
    private String birthPlace = null;
    private String work = null;
    private String workingPlace = null;
    private Country country = null;
    private Education education = null;
    private Mail mail = null;
    private Credential credential = null;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getLivingPlace() {
        return livingPlace;
    }

    public void setLivingPlace(String livingPlace) {
        this.livingPlace = livingPlace;
    }

    public String getBirthPlace() {
        return birthPlace;
    }

    public void setBirthPlace(String birthPlace) {
        this.birthPlace = birthPlace;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public String getWorkingPlace() {
        return workingPlace;
    }

    public void setWorkingPlace(String workingPlace) {
        this.workingPlace = workingPlace;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public Education getEducation() {
        return education;
    }

    public void setEducation(Education education) {
        this.education = education;
    }

    public Mail getMail() {
        return mail;
    }

    public void setMail(Mail mail) {
        this.mail = mail;
    }

    public Credential getCredential() {
        return credential;
    }

    public void setCredential(Credential credential) {
        this.credential = credential;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Citizen citizen = (Citizen) o;
        return phoneNumber == citizen.phoneNumber && Objects.equals(name, citizen.name) && gender == citizen.gender && Objects.equals(livingPlace, citizen.livingPlace) && Objects.equals(birthPlace, citizen.birthPlace) && Objects.equals(work, citizen.work) && Objects.equals(workingPlace, citizen.workingPlace) && country == citizen.country && Objects.equals(education, citizen.education) && Objects.equals(mail, citizen.mail) && Objects.equals(credential, citizen.credential);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, gender, phoneNumber, livingPlace, birthPlace, work, workingPlace, country, education, mail, credential);
    }

    @Override
    public String toString() {
        return "Citizen{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", phoneNumber=" + phoneNumber +
                ", livingPlace='" + livingPlace + '\'' +
                ", birthPlace='" + birthPlace + '\'' +
                ", work='" + work + '\'' +
                ", workingPlace='" + workingPlace + '\'' +
                ", country=" + country +
                ", education=" + education +
                ", mail=" + mail +
                ", credential=" + credential +
                '}';
    }
}
