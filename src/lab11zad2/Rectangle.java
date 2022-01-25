package lab11zad2;

public class Rectangle extends Shape{
    protected double width,height;

    public Rectangle(String name,double width, double height) throws IllegalArgumentException {
        super(name);
        this.width = width;
        this.height = height;
        if(width<=0 ||height<=0) throw new IllegalArgumentException();
        System.out.println(name+" construed");
    }
    
    @Override
    public double area() {
       return width*height;
    }   
}