package klasaZDziałaniamiMatematycznymi;

public class MathTest {
    public static void main(String[] args) {
        Math math = new Math();
        boolean even = math.isEven(2);
        boolean odd = math.isOdd(1);
        double radius = math.circleField(5);
        int squareNumber = math.power(4);

        System.out.println("Czy liczba jest parzysta ? " +even);
        System.out.println("Czy liczba jest nieParzysta ? " +odd);
        System.out.println("Promień koła: " + radius);
        System.out.println("Liczba podniesiona do kwadratu: " + squareNumber);
    }
}
