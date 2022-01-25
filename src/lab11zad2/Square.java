package lab11zad2;

public class Square extends Rectangle{

    public Square(String name,double width) throws IllegalArgumentException{
        super(name,width,width);
        if(width<=0 ||height<=0) throw new IllegalArgumentException();
        System.out.println(name+" construed");
    }
    
    @Override
    public double area(){
        return width*width;
    }
}
