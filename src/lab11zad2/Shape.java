package lab11zad2;

public abstract class Shape {
    protected String name;

    public Shape(String name) {
        this.name = name;
        System.out.println(name+" construed");
    }

    public void setName(String name){
        name=name;
    }
    
    public String getName(){
        return name;
    }
    public abstract double area();   
}
