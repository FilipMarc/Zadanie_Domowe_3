package klasaZDziałaniamiMatematycznymi;

public class Math {

    boolean isEven(int value){
        return value %2 ==0;
    }

    boolean isOdd(int value){
        return value %2 ==1;
    }

    double circleField(double value){
        double radius = 3.14*value *value;
        return radius;
    }

    int power(int value){
        int square = value * value;
        return square;
    }
}
