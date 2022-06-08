import java.time.LocalDate;
import java.time.Period;
import java.util.Date;

public class Person {

    private String name;
    private String surname;
    private int birthDate;
    private boolean anotherCompanyOwner;
    private boolean Pensioner;
    private boolean PublicServer;
    public float salary;

    Person(String name, String surname, int birthDate, boolean anotherCompanyOwner, boolean pensioner, boolean publicServer){
        this.name = name;
        this.surname = surname;
        this.birthDate = birthDate;
        this.anotherCompanyOwner = anotherCompanyOwner;
        this.Pensioner = pensioner;
        this.PublicServer = publicServer;
    }


    public String fullName(){
        return this.name+" "+this.surname;
    }

    double calculateYearlySalary(){
        return getSalary() * 12;
    }

    boolean isMEI(){
        if((calculateYearlySalary() < 130000) &&
                (Period.between(LocalDate.of(this.birthDate, 01,01) , LocalDate.now()).getYears() >= 18) &&
                (!this.anotherCompanyOwner) && (!this.Pensioner) && (!this.PublicServer)){
            return true;
        }else{
            return false;
        }
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }
}
