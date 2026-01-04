public class Main {
    public static void main(String[] args) {

        double sum = sumAll(2,
                new Fraction(3,5).doubleValue(),
                2.3);
        System.out.println("Sum: "+ sum);

        sum = sumAll(3.6,
                new Fraction(49,12).doubleValue(),
                3,
                new Fraction(3,2).doubleValue());
        System.out.println("Sum: "+ sum);

        sum = sumAll(new Fraction(1,3).doubleValue(),
                1);
        System.out.println("Sum: "+ sum);
    }

    static double sumAll(double ...summands){
        double sum = 0;

        for(double summand : summands){
            sum += summand;
        }

        return sum;
    }
}
