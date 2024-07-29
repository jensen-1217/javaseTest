package genericity.demo9;

public class Test1 {
    public static void main(String[] args) {
        swimming (() -> {
            System.out.println("游泳");
            System.out.println("11");
        });




    }

    private static void swimming(Swim swim) {
        swim.swim();
    }

    ;
}
