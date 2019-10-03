package KlasyiObiekty;

public class cellPhoneMain {
    public static void main(String[] args) {
        Phone phone1 = new Phone();
        phone1.brand = "Xiaomi";
        phone1.model = "Redmi note 6 pro";
        phone1.size = "mały";
        phone1.color = "czarny";
        phone1.wireless = true;
        phone1.internet = true;
        phone1.camera = true;

        Phone phone2 = new Phone();
        phone2.brand ="Sony";
        phone2.model = "Xperia Z2";
        phone2.size = "mały";
        phone2.color = "biały";
        phone2.wireless = true;
        phone2.internet = true;
        phone1.camera = false;

        phone1.showPhone();
        phone2.showPhone();

    }
}
