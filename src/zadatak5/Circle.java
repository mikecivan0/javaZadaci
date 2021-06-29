package zadatak5;

public class Circle extends Shape{

private int width;
    public Circle(int a){
        this.width=a;
    }
    
    void area(){
    int w = this.width;
        System.out.println("Površina kruga èiji je radius dug " + w + " cm je " + (Math.PI*w*w) + " cm2");
    }
}
