import java.util.Scanner;

public class Test {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Podaj imię, nazwisko, wiek i pesel osoby: ");
        int i =1;
        while (i ==1){
            try {
                Person person1 = new Person(sc.nextLine(), sc.nextLine(), sc.nextInt(), sc.nextInt());
                person1.printInfo();
                break;

            } catch (NameUndefinedException e){

                System.out.println("Podałeś za krótkie imię lub nazwisko");
                i =1;
                sc.nextLine();
            } catch (IncorrectAgeException e){
                System.out.println("Podałeś zły wiek ");
                i = 1;
                sc.nextLine();
            }}


    }
}
