package CurrencyConverter;

public class CurrencyConverter
{
        public void convert()
        {
            System.out.println("1 Euro = " + EuroToDollar(1) + " Dollar");
            System.out.println("1 Dollar = " + DollarToEuro(1) + " Euro");
        }

        public double EuroToDollar(double euro)
        {
            return euro * 1.1;
        }

        public double DollarToEuro(double dollar)
        {
            return dollar * 0.9;
        }
}
