/**
 * Aracın özellikleri ve isminin bulunduğu sınıftır. IVehicle'dan implement edilmiştir.
 * */
public class MercedesIVehicle implements IVehicle {
    /**
     * Aracın motor özelliklerini döndürür.
     * */
    @Override
    public String engine() {
        return "Mercedes Marka araçlar 1.3 litre dizel motor hacmine sahip olurlar.";
    }
    /**
     * Aracın tip özelliklerini döndürür.
     * */
    @Override
    public String vehicleType() {
        return "Suv tipinde araçtır.";
    }
    /**
     * Aracın markasını döndürür.
     * */
    @Override
    public String brand() {
        return "Mercedes";
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
