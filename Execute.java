package CurryPc;

public class Execute {
    public static void main(String[] args) {

        System.out.println("LG");

        LG standard = new LG();
        standard.SelectTV();
        standard.ScreenType();
        standard.ScreenSize();
        standard.Resolution();
        standard.price();

        System.out.println("Panasonic");

        Panasonic good = new Panasonic();
        good.SelectTV();
        good.ScreenType();
        good.ScreenSize();
        good.Resolution();
        good.price();

        System.out.println("Philips");

        Philips poor = new Philips();
        poor.SelectTV();
        poor.ScreenType();
        poor.ScreenSize();
        poor.Resolution();
        poor.price();

        System.out.println("Samsung");

        Samsung quality = new Samsung();
        quality.SelectTV();
        quality.ScreenType();
        quality.ScreenSize();
        quality.Resolution();
        quality.price();

        System.out.println("Sharp");

        sharp advantage = new sharp();
        advantage.SelectTV();
        advantage.ScreenType();
        advantage.ScreenSize();
        advantage.Resolution();
        advantage.price();

        System.out.println("Sony");

        Sony profit = new Sony();
        profit.SelectTV();
        profit.ScreenType();
        profit.ScreenSize();
        profit.Resolution();
        profit.price();

        System.out.println("Toshiba");

        Toshiba excellent = new Toshiba();
        excellent.SelectTV();
        excellent.ScreenType();
        excellent.ScreenSize();
        excellent.Resolution();
        excellent.price();






    }
}
