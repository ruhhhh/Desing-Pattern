public class MercedesIVehicle implements IVehicle {
    @Override
    public String engine() {
        System.out.println("Mercedes Marka araçlar 1.3 litre dizel motor hacmine sahip olurlar.");
        return null;
    }

    @Override
    public String vehicleType() {
        System.out.println("Suv tipinde araçtır.");
        return null;
    }

    @Override
    public String brand() {
        return "Mercedes";
    }
}
