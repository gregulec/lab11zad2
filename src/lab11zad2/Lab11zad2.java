package lab11zad2;

public class Lab11zad2 {

    public static void main(String[] args) {
        try {
            Rectangle rectangle=new Rectangle("ksztalt",0,3);
            Square square=new Square("kwadrat",2);
            System.out.println(rectangle.area());
            System.out.println(square.area());
        } catch (IllegalArgumentException e) {
            System.out.println("Dane mniejsze lub rowne zero");
        }
    }
    
}
