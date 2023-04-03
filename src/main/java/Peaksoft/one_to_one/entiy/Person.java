package Peaksoft.one_to_one.entiy;


import javax.persistence.*;

@Entity
@Table(name="persons")

public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private int INN;
    private String surname;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="passpord_id")
    private Passport passport;

    public Person(int INN, String surname) {
        this.INN = INN;
        this.surname = surname;
    }

    public Person() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public int getINN() {
        return INN;
    }

    public void setINN(int INN) {
        this.INN = INN;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public Passport getPassport() {
        return passport;
    }

    public void setPassport(Passport passport) {
        this.passport = passport;
    }
}
