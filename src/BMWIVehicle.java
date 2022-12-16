/**
 * Aracın özellikleri ve isminin bulunduğu sınıftır. IVehicle'dan implement edilmiştir.
 * */
public class BMWIVehicle implements IVehicle {
    /**
     * Aracın motor özelliklerini döndürür.
     * */
    @Override
    public String engine() {
        return "BMW Marka araçlar 1.5 litre dizel motor hacmine sahip olurlar.";
    }
    /**
     * Aracın tip özelliklerini döndürür.
     * */
    @Override
    public String vehicleType() {
        return "Sedan tipinde araçtır.";
    }
    /**
     * Aracın markasını döndürür.
     * */
    @Override
    public String brand() {
        return "BMW";
    }
    @Override
    public String miniOnarim() {
        return null;
    }
    @Override
    public String yedekArac() {
        return null;
    }
    @Override
    public String yetkiliServis() {
        return null;
    }
}
