package creatures;

import creatures.Animal;
import devices.Car;
import devices.Phone;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human {
    String firstname;
    String lastname;
    final Integer yearOfBirth;
    private Animal pet;
    private Phone phone;
    private Car car;
   // private Double salary = 0.0;
   // private LocalDateTime getSalaryDate = null;
   // private Double previousSalary = 0.0;
    private Double cash = 0.0;

    /*public Double getsalary() {
        System.out.print("Pobieranie danych o ostatniej wypłacie: ");
        System.out.println(getSalaryDate == null ? "null" : getSalaryDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Poprzednia wypłata: " + previousSalary);
        getSalaryDate = LocalDateTime.now();
        previousSalary = salary;
        return salary;
    }*/

  /*  public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Pensja na minus. To tak się da?");
            return;
        }
        System.out.println("Wysłane do systemu");
        System.out.println("Trzeba odebrać aneks od pani Hani z kadr");
        System.out.println("Panowie z ZUS i US juz jadą, nie ma sensu nic ukrywać");
        this.salary = salary;
        System.out.println("Nowa pensja wynosi: " + salary);
    }*/

    public Human(Integer yearOfBirth, String firstname, String lastname) {
        this.yearOfBirth = yearOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
    }

    public Car getCar() {
        return car;
    }
    public Animal getPet(){
        return pet;
    }
    public Double getCash() {
        return cash;
    }
    public Phone getPhone(){
        return phone;
    }
    public void setPhone(Phone phone){
        this.phone = phone;
    }


    public void setCash(Double cash) {
        this.cash = cash;
    }
    public void setPet(Animal pet){
        this.pet = pet;
    }

    public void setCar(Car car) {
        this.car = car;
      /*  if (this.salary > car.getPrice()) {
            this.car = car;
            System.out.println("Kupiono za gotówkę");
        } else if (this.salary > car.getPrice() / 12) {
            this.car = car;
            System.out.println("Kupiono na kredyt");
        } else {
            System.out.println("Znajdź lepszą robotę albo proś o podwyżkę");
        }
       */
    }
    public String toString() {
        return this.firstname + " " + this.lastname + " " + this.yearOfBirth + " ";
    }
    public void sell(Human buyer, Human seller, Double price) {
        System.out.println("Handel ludzmi jest zakazany");
    }
}
