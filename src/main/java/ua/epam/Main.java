package ua.epam;

public class Main {

    public static void main(String[] args) {
	    double a = 7;
        double b = 6;

        Arithmetics arrrith = new Arithmetics();

        double sum = arrrith.getSum(a, b);
        System.out.println("sum = " + sum);

        double div = arrrith.getDiv(a, b);
        System.out.println("div = " + div);

        double mult = arrrith.getMult(a, b);
        System.out.println("mult = " + mult);

        double del = arrrith.getDel(a, b);
        System.out.println("del = " + Math.round(del));
    }
}
