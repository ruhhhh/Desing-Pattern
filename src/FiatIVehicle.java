public class FiatIVehicle implements IVehicle {
    @Override
    public String engine() {
        return "Fiat Marka araçlar 1.6 litre dizel motor hacmine sahip olurlar.";
    }
    @Override
    public String vehicleType() {
        return "Hatchback tipinde araçtır.";
    }
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
