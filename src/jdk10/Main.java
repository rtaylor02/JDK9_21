package src.jdk10;

public class Main {
    public static void main(String[] args) {
        var myString = "this is something";
        System.out.println(myString.getClass().getSimpleName());

        var myValue = 100;
        //myValue = 12.0; // CE

        // var: reserved identifier
        var var  = new Var();
    }

    private static class Var {

    }
}
