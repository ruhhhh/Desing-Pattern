public class MercedesIVehicle implements IVehicle {
    @Override
    public String engine() {
        return "Mercedes Marka araçlar 1.3 litre dizel motor hacmine sahip olurlar.";
    }
    @Override
    public String vehicleType() {
        return "Suv tipinde araçtır.";
    }
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
