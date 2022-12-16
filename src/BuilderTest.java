/**
 * Kullanıcıdan alından seçimlere göre ENUM sınıfına giderek yeni bir araç sınıfı oluşturur.
 * Araç sınıfının ardından kullanıcıdan kasko özelliklerine göre kasko fiyat hesabı yaparak ekrana bastırır.
 * */

import java.util.Scanner;
public class BuilderTest {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        System.out.println("BMW[1], MERCEDES[2], FIAT[3]");
        System.out.print("Lütfen araç markanızı seçiniz: ");
        Scanner read = new Scanner(System.in);
        int selectBrand = read.nextInt();
        String brandName = "";

        switch (selectBrand)
        {
            case 1: brandName = "BMW"; break;
            case 2: brandName = "MERCEDES"; break;
            case 3: brandName = "FIAT"; break;
            default: System.out.println("Geçersiz bir Seçim yaptınız."); break;
        }
        IVehicle vehicleCar = vehicleFactory.ProduceVehicle(VehicleBrand.valueOf(brandName));
        System.out.println("En Düşük Kasko[1], Mini Onarım[2], Yedek Araç[3], Yetkili Servis[4], En Full Kasko[5]");
        System.out.print("Kaskonuzda ekstra istediğiniz özelliği ekleyin: ");
        int kaskoRead = read.nextInt();
        int sonuc = 0;

        switch (kaskoRead)
        {
            case 1: sonuc = 1; break;
            case 2: sonuc = 2; break;
            case 3: sonuc = 3; break;
            case 4: sonuc = 4; break;
            default: sonuc = 5; break;
        }

        if(sonuc == 1)
        {
            System.out.println("-----");
            Builder user1 = new Builder.UserBuilder(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine(),
                    vehicleCar.miniOnarim(), vehicleCar.yedekArac(), vehicleCar.yetkiliServis()).Kasko(vehicleCar.brand(),
                    vehicleCar.vehicleType()).build();
            System.out.println(user1.getBrand() + " " + user1.getType() + " " + user1.getEngine());
            System.out.println("-----\nYukarıda verilen özelliklere göre kasko Hesaplaması gerçekleştiriliyor.");
            System.out.println("Fiyat teklifiniz " + user1.getPrice() + " TL");
        }

        else if(sonuc == 2)
        {
            System.out.println("-----");
            Builder user1 = new Builder.UserBuilder(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine(),
                    vehicleCar.miniOnarim(), vehicleCar.yedekArac(), vehicleCar.yetkiliServis() ).Kasko(vehicleCar.brand(),
                    vehicleCar.vehicleType(), vehicleCar.engine(), vehicleCar.miniOnarim()).build();
            System.out.println(user1.getBrand() + " " + user1.getType() + " " + user1.getEngine());
            System.out.println("-----\nYukarıda verilen özelliklere göre kasko Hesaplaması gerçekleştiriliyor.");
            System.out.println("Fiyat teklifiniz " + user1.getPrice() + " TL");
        }

        else if(sonuc == 3)
        {
            System.out.println("-----");
            Builder user1 = new Builder.UserBuilder(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine(),
                    vehicleCar.miniOnarim(), vehicleCar.yedekArac(), vehicleCar.yetkiliServis() ).Kasko(vehicleCar.brand(),
                    vehicleCar.vehicleType(), vehicleCar.engine(), vehicleCar.yedekArac()).build();
            System.out.println(user1.getBrand() + " " + user1.getType() + " " + user1.getEngine());
            System.out.println("-----\nYukarıda verilen özelliklere göre kasko Hesaplaması gerçekleştiriliyor.");
            System.out.println("Fiyat teklifiniz " + user1.getPrice() + " TL");
        }
        else if(sonuc == 4)
        {
            System.out.println("-----");
            Builder user1 = new Builder.UserBuilder(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine(),
                    vehicleCar.miniOnarim(), vehicleCar.yedekArac(), vehicleCar.yetkiliServis() ).Kasko(vehicleCar.brand(),
                    vehicleCar.vehicleType(), vehicleCar.engine(), vehicleCar.yetkiliServis()).build();
            System.out.println(user1.getBrand() + " " + user1.getType() + " " + user1.getEngine());
            System.out.println("-----\nYukarıda verilen özelliklere göre kasko Hesaplaması gerçekleştiriliyor.");
            System.out.println("Fiyat teklifiniz " + user1.getPrice() + " TL");
        }
        else if(sonuc == 5)
        {
            System.out.println("-----");
            Builder user1 = new Builder.UserBuilder(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine(),
                    vehicleCar.miniOnarim(), vehicleCar.yedekArac(), vehicleCar.yetkiliServis() ).Kasko(vehicleCar.brand(),
                    vehicleCar.vehicleType(), vehicleCar.engine(), vehicleCar.miniOnarim(),vehicleCar.yetkiliServis(),
                    vehicleCar.yedekArac()).build();
            System.out.println(user1.getBrand() + " " + user1.getType() + " " + user1.getEngine());
            System.out.println("-----\nYukarıda verilen özelliklere göre kasko Hesaplaması gerçekleştiriliyor.");
            System.out.println("Fiyat teklifiniz " + user1.getPrice() + " TL");
        }
        else {
            System.out.println("Maalesef geçersiz bir sayı girdiniz.");
        }
    }
}
