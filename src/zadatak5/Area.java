package zadatak5;

import java.util.Scanner;


// zadatak je napraviti aplikaciju za izra�un 
// povr�ine kvadrata i kruga
// aplikacija mora sadr�avati abstraktnu klasu Shape
// u kojoj su varijabla width i abstrakstna metoda area()
// klasa Circle i klasa Square naslje�uju klasu Shape
// obje podklase preko konstruktora primaju od korisnika cijeli broj koji 
// �e se spremiti u varijablu width
// aplikacija vra�a povr�inu kvadrata i kruga
// prema dobivenim du�inama od korisnika


public class Area {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi du�inu stranice kvadrata");
        int x = sc.nextInt();
        System.out.println("Unesi radius kru�nice");
        int y = sc.nextInt();
        sc.close();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
        
    }
}
