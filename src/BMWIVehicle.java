public class BMWIVehicle implements IVehicle {
    @Override
    public String engine() {
        return "BMW Marka araçlar 1.5 litre dizel motor hacmine sahip olurlar.";
    }
    @Override
    public String vehicleType() {
        return "Sedan tipinde araçtır.";
    }
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
