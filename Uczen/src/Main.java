import java.util.Scanner;

public class Main {

    public static class Uczen{
        String imie;
        String nazwisko;
        String pesel;

        public void UstawImie(){

            Scanner myObj = new Scanner(System.in);  // Create a Scanner object
            System.out.println("Wpisz swoje imie");
            String a = myObj.nextLine();

            this.imie = a;

        }
        public void UstawNazwisko(){

            Scanner myObj = new Scanner(System.in);  
            System.out.println("Wpisz swoje nazwisko");
            String a = myObj.nextLine();

            this.nazwisko = a;
        }
        public void UstawPesel(){

            Scanner myObj = new Scanner(System.in);  
            System.out.println("Wpisz swoj pesel");
            String a = myObj.nextLine();

            this.pesel = a;
        }
    }

    public static class UczenSzkoly extends Uczen{
        String nazwaSzkoly;
        public void UstawSzkole(){

            Scanner myObj = new Scanner(System.in);
            System.out.println("Wpisz nazwe szkoly");
            String a = myObj.nextLine();

            this.nazwaSzkoly = a;
        }

    }

    public static class UczenKlasy extends UczenSzkoly{
        String klasa;

        public void UstawKlase(){

            Scanner myObj = new Scanner(System.in); 
            System.out.println("Wpisz swoja klase");
            String a = myObj.nextLine();

            this.klasa = a;
        }
    }

    public static void main(String[] args) {

        UczenKlasy uczenKlasy = new UczenKlasy();

        uczenKlasy.UstawImie();
        uczenKlasy.UstawNazwisko();
        uczenKlasy.UstawPesel();
        uczenKlasy.UstawSzkole();
        uczenKlasy.UstawKlase();

        System.out.println(uczenKlasy.imie);
        System.out.println(uczenKlasy.nazwisko);
        System.out.println(uczenKlasy.pesel);
        System.out.println(uczenKlasy.nazwaSzkoly);
        System.out.println(uczenKlasy.klasa);


    }
}
