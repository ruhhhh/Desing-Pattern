/**
 * Aracın özellikleri ve isminin bulunduğu sınıftır. IVehicle'dan implement edilmiştir.
 * */
public class FiatIVehicle implements IVehicle {
    /**
     * Aracın motor özelliklerini döndürür.
     * */
    @Override
    public String engine() {
        return "Fiat Marka araçlar 1.6 litre dizel motor hacmine sahip olurlar.";
    }
    /**
     * Aracın tip özelliklerini döndürür.
     * */
    @Override
    public String vehicleType() {
        return "Hatchback tipinde araçtır.";
    }
    /**
     * Aracın markasını döndürür.
     * */
    @Override
    public String brand() {
        return "Fiat";
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
