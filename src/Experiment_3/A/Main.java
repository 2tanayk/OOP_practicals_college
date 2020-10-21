package Experiment_3.A;

public class Main {
    public static void main(String[] args) {
        //Scanner sc = new Scanner(System.in);
        MethodOverloading methodOverloading = new MethodOverloading();
        System.out.println("Area of rectangle:" + methodOverloading.area(5, 9));
        System.out.println("Area of square:" + methodOverloading.area(8));
        System.out.println("Area of circle:" + methodOverloading.area(10L));
        System.out.println("Area of triangle:" + methodOverloading.area(2.5, 5.7));
    }
}
