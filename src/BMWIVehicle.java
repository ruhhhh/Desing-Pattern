public class BMWIVehicle implements IVehicle {


    @Override
    public String engine() {
        return "BMW Marka araçlar 1.6 litre dizel motor hacmine sahip olurlar.";
    }

    @Override
    public String vehicleType() {

        return "Sedan tipinde araçtır.";
    }

    @Override
    public String brand() {
        return "BMW";
    }
}
