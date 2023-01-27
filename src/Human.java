import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Human{
    String firstname;
    String lastname;
    final Integer yearOfBirth;
    Animal pet;
    Car car;
    private Double salary = 0.0;
    private LocalDateTime getSalaryDate = null;
    private Double previousSalary = 0.0;
    public Double getsalary(){
        System.out.print("Pobieranie danych o ostatniej wypłacie: ");
        System.out.println(getSalaryDate == null ? "null" : getSalaryDate.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm")));
        System.out.println("Poprzednia wypłata: " + previousSalary);
        getSalaryDate = LocalDateTime.now();
        previousSalary = salary;
        return salary;
    }
    public void setSalary(Double salary) {
        if (salary < 0) {
            System.out.println("Pensja na minus. To tak się da?");
            return;
        }
        System.out.println("Wysłane do systemu");
        System.out.println("Trzeba odebrać aneks od pani Hani z kadr");
        System.out.println("Panowie z ZUS i US juz jadą, nie ma sensu nic ukrywać");
        this.salary = salary;
        System.out.println("Nowa pensja wynosi: " + salary);
    }

    Human(Integer yearOfBirth, String firstname, String lastname){
        this.yearOfBirth = yearOfBirth;
        this.firstname = firstname;
        this.lastname = lastname;
    }
}
