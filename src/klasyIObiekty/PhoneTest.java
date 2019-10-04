package klasyIObiekty;

public class PhoneTest {
    public static void main(String[] args) {
        Phone phone1 = new Phone("Xiaomi","Redmi note 6 pro","mały","czarny"
        ,true,true,true);

        Phone phone2 = new Phone("Sony","Xperia Z2","mały","biały"
        ,true,true,false);



        phone1.showPhone();
        phone2.showPhone();

    }
}
