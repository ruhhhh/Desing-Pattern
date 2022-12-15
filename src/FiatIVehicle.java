public class FiatIVehicle implements IVehicle {

    @Override
    public String engine() {
        System.out.println("Fiat Marka araçlar 1.6 litre dizel motor hacmine sahip olurlar.");

        return null;
    }

    @Override
    public String vehicleType() {
        System.out.println("Hatchback tipinde araçtır.");
        return null;
    }

    @Override
    public String brand() {
        return "Fiat";
    }
}
