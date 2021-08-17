public class Point {
    private double x,y;
    public Point(double x,double y){
        this.x=x;
        this.y=y;
    }
    public void print(){
        System.out.println("Point with cords"+x +" , "+y);
    }
    class ColorPoint extends Point{
        String color;
        public ColorPoint(double x, double y, String color){
            super(x, y);
            this.color=color;
            super.print();
            System.out.println("and color"+color);
        }

    }

    //public static void main(String[] args) {
       // ColorPoint c=new ColorPoint(1,2,"red");
       // c.print();
  //  }


}
