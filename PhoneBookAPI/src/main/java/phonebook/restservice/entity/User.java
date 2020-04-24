package phonebook.restservice.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {

    @Id
    private String nickname;
    private String password;
    private String firstname;
    private String lastname;
    private String phones;
    private String email;
    private String notes;

    // nickname
    public String getNickname() {
        return nickname;
    }
    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    // password
    public String getPassword() { return password; }
    public void setPassword(String password) {
        this.password = password;
    }

    // firstname
    public String getFirstName() { return firstname; }
    public void setFirstName(String firstname) {
        this.firstname = firstname;
    }

    // lastname
    public String getLastName() {
        return lastname;
    }
    public void setLastName(String lastname) {
        this.lastname = lastname;
    }

    // phones
    public String getPhones() { return phones; }
    public void setPhones(String phones) {
        this.phones = phones;
    }

    // email
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    // notes
    public String getNotes() {
        return notes;
    }
    public void setNotes(String notes) {
        this.notes = notes;
    }

    @Override
    public String toString() {
        return "User{" + "nickname='" + nickname + '\'' + ", password='" + password + '\''
                + ", firstname='" + firstname + '\'' + ", lastname='" + lastname + '\''
                + ", phones='" + phones + '\'' + ", email='" + email + '\''
                + ", notes='" + notes + '\'' + '}';
    }
}
