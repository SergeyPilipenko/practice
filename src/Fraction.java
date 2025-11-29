public class Fraction {
    private int numerator;
    private int denominator;

    public Fraction(int numerator, int denominator) {
        if (denominator <= 0) {
            throw new IllegalArgumentException("Знаменатель должен быть > 0");
        }
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public Fraction sum(Fraction fr) {
        Fraction frModified1 = new Fraction(numerator * fr.getDenominator(),
                denominator * fr.getDenominator());
        Fraction frModified2 = new Fraction((fr.getNumerator()) * denominator,
                fr.getDenominator() * denominator);

        return new Fraction(frModified1.getNumerator() + frModified2.getNumerator(),
                frModified1.getDenominator());
    }

    public Fraction minus(Fraction fr) {
        Fraction frModified1 = new Fraction(numerator * fr.getDenominator(),
                denominator * fr.getDenominator());
        Fraction frModified2 = new Fraction((fr.getNumerator()) * denominator,
                fr.getDenominator() * denominator);

        return new Fraction(frModified1.getNumerator() - frModified2.getNumerator(),
                frModified1.getDenominator());
    }

    public Fraction minus(int num) {

        Fraction frTemp = new Fraction(num, 1);

        Fraction frModified1 = new Fraction(numerator * frTemp.getDenominator(),
                denominator * frTemp.getDenominator());
        Fraction frModified2 = new Fraction((frTemp.getNumerator()) * denominator,
                frTemp.getDenominator() * denominator);

        return new Fraction(frModified1.getNumerator() - frModified2.getNumerator(),
                frModified1.getDenominator());
    }

    @Override
    public String toString() {
        return String.format("%s/%s", numerator, denominator);
    }
}
