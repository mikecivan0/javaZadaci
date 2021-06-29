package zadatak5;

public class Square extends Shape{

private int width;
    public Square(int a){
        this.width=a;
    }
    
    void area(){
    int w = this.width;
        System.out.println("Površina kvadrata èija je stranica dugaèka " + w + " cm je " + (w*w) + " cm2");
    }
}