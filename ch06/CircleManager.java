package ch06;
// 실습문제 Bonus1
class Circle{
    private int x,y,radius;
    public Circle(int x, int y, int radius){
        this.x=x;
        this.y=y;
        this.radius=radius;
    }
    public String toString(){
        return "("+x+","+y+")"+"반지름 "+radius;
    }
    public boolean equals(Circle c){
        if(this.radius==c.radius)
            return true;
        else
            return false;
    }   
}
public class CircleManager {
    public static void main(String[] args) {
        Circle a = new Circle(1, 2, 10);
        Circle b = new Circle(5, 6, 10);
        System.out.println("원 1: "+a);
        System.out.println("원 2: "+b);
        if(a.equals(b))
            System.out.println("같은 원입니다.");
        else
            System.out.println("다른 원입니다.");
    }
}
