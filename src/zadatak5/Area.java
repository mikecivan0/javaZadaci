package zadatak5;

import java.util.Scanner;


// zadatak je napraviti aplikaciju za izraèun 
// površine kvadrata i kruga
// aplikacija mora sadržavati abstraktnu klasu Shape
// u kojoj su varijabla width i abstrakstna metoda area()
// klasa Circle i klasa Square nasljeðuju klasu Shape
// obje podklase preko konstruktora primaju od korisnika cijeli broj koji 
// æe se spremiti u varijablu width
// aplikacija vraæa površinu kvadrata i kruga
// prema dobivenim dužinama od korisnika


public class Area {
    public static void main(String[ ] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Unesi dužinu stranice kvadrata");
        int x = sc.nextInt();
        System.out.println("Unesi radius kružnice");
        int y = sc.nextInt();
        sc.close();
        
        Square a = new Square(x);
        Circle b = new Circle(y);
        a.area();
        b.area();
        
    }
}
