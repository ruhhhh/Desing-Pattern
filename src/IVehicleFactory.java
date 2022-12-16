/**
 * Factory pattern i ile marka çatısı altında oluşturulan sınıftır.
 * */
public interface IVehicleFactory {
    IVehicle ProduceVehicle(VehicleBrand brand);
}
