public class BuilderTest {
    public static void main(String[] args) {

        VehicleFactory vehicleFactory = new VehicleFactory();

        IVehicle vehicleCar = vehicleFactory.ProduceVehicle(VehicleBrand.BMW);

        User user1 = new User.UserBuilder(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine()).Kasko(vehicleCar.brand(), vehicleCar.vehicleType(), vehicleCar.engine()).build();
        System.out.println(user1.getBrand() + " " + user1.getType() + " " + user1.getEngine());
        System.out.println("-----\nKasko Hesaplaması gerçekleştiriliyor.");
        System.out.println(user1.getPrice());

        /*String umut = "100";
        User user = new User.UserBuilder("Koray", "Peker")
                .email(umut).build();
        User user1 = new User.UserBuilder("Koray", "Peker")
                .email(umut+"2").build();

        System.out.println(user.getEmail());
        System.out.println(user1.getEmail());

         */

        //var vehicleFactory = new VehicleFactory();


    }
}
