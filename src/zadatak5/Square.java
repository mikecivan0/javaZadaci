package zadatak5;

public class Square extends Shape{

private int width;
    public Square(int a){
        this.width=a;
    }
    
    void area(){
    int w = this.width;
        System.out.println("Povr�ina kvadrata �ija je stranica duga�ka " + w + " cm je " + (w*w) + " cm2");
    }
}