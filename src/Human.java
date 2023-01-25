public class Human{
    String firstname;
    String lastname;
    final Integer yearOfBirth;
    Animal pet;
    Car car;

    Human(Integer yearOfBirth, String firstname, String lastname){
        this.yearOfBirth = yearOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
    }

}
