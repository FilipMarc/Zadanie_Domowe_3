package KlasyiObiekty;

public class Phone {
    String color;
    String size;
    String brand;
    String model;
    boolean wireless;
    boolean internet;
    boolean camera;

    void showPhone(){
        System.out.println(brand +", model " + model +", wielkość " +size +", kolor " +color+
                ", czy jest berzprzewodowy ? " +wireless + ", czy posiada Internet ? " + internet
        +", czy posiada aparat ? " + camera);
    }


}
