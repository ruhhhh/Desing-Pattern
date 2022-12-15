public class VehicleFactory implements IVehicleFactory{

    public IVehicle ProduceVehicle(VehicleBrand brand)
    {
        IVehicle vehicle = null;
        switch (brand)
        {
            case BMW:
                vehicle = new BMWIVehicle();
                break;
            case MERCEDES:
                vehicle = new MercedesIVehicle();
                break;
            case FIAT:
                vehicle = new FiatIVehicle();
                break;
        }
        return vehicle;
    }

}
