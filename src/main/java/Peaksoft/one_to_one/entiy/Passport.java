package Peaksoft.one_to_one.entiy;


import javax.persistence.*;

@Entity
@Table(name="pasports")

public class Passport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nationality;
    private String gender;






    public Passport(String nationality, String gender) {
        this.nationality = nationality;
        this.gender = gender;
    }

    public Passport() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Passport{" +
                "id=" + id +
                ", nationality='" + nationality + '\'' +
                ", gender='" + gender + '\'' +
                '}';
    }
}
