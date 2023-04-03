package Peaksoft;


import Peaksoft.one_to_one.entiy.Passport;
import Peaksoft.one_to_one.entiy.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class App {
    public static void main( String[] args ) {

        SessionFactory sessionFactory=new Configuration()
                .configure()
                .addAnnotatedClass(Person.class)
                .addAnnotatedClass(Passport.class)
                .buildSessionFactory();
Session session=sessionFactory.openSession();
session.beginTransaction();
Person person=new Person();
person.setSurname("Tom");
person.setINN(000777);
Passport passport=new Passport();
passport.setNationality("Kyrgyz");
passport.setGender("Male");
person.setPassport(passport);
session.save(person);
session.getTransaction().commit();
session.close();

    }
}
