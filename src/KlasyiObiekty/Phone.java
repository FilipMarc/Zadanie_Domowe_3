package KlasyiObiekty;

public class Phone {
    String brand;
    String model;
    String size;
    String color;
    boolean wireless;
    boolean internet;
    boolean camera;

    public Phone(String bra, String mod, String siz, String colo, boolean wireles, boolean interne, boolean camer) {
        brand = bra;
        model = mod;
        size = siz;
        color = colo;
        wireless = wireles;
        internet = interne;
        camera = camer;
    }

    void showPhone(){
        System.out.println(brand +", model " + model +", wielkość " +size +", kolor " +color+
                ", czy jest berzprzewodowy ? " +wireless + ", czy posiada Internet ? " + internet
                +", czy posiada aparat ? " + camera);
    }
}
