package interface1;

public class Rectangle implements Shape{
    private double length;
    private double width;

    public Rectangle(Double length, double width){
        this.length = length;
        this.width = width;
    }
    @Override
    public double calculateArea() {
        return length * width;
    }
}
