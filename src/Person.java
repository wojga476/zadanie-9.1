public class Person {

    private  String firstName;
    private String lastName;
    private int age;
    private int pesel;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getPesel() {
        return pesel;
    }

    public void setPesel(int pesel) {
        this.pesel = pesel;
    }

    public Person(String firstName, String lastName, int age, int pesel) throws NameUndefinedException, IncorrectAgeException {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.pesel = pesel;
        if (getFirstName() == null || getFirstName().length()<3) {
            throw new NameUndefinedException();
        }
        if (getLastName() == null || getLastName().length()<3){
            throw  new NameUndefinedException();

        }
        if (getAge() <1){
            throw new IncorrectAgeException();
        }

    }
    public void printInfo(){
        System.out.println("Imie: "+firstName +" Nazwisko: "+ lastName + " Wiek: "+ age + " Numer pesel: "+pesel);
    }
}
