public class User {

    private String brand; // required
    private String type; // required
    private String engine; // optional
    private int price;


    User(UserBuilder builder) {
        this.brand = builder.brand;
        this.type = builder.type;
        this.engine = builder.engine;
        this.price = builder.price;

    }

    public String getBrand() {
        return brand;
    }

    public String getType() {
        return type;
    }

    public String getEngine() {
        return engine;
    }

    public int getPrice(){
        return price;
    }



    public static class UserBuilder {

        private String brand;
        private String type;
        private String engine;
        private int price;


        public UserBuilder(String brand, String type, String engine) {
            this.brand = brand;
            this.type = type;
            this.engine = engine;
        }

        public UserBuilder Kasko(String brand, String type, String engine) {
            if(brand.equalsIgnoreCase("BMW"))
            {
                    this.price = 1000;
            }

            return this;
        }



        public User build() {
            return new User(this);
        }

    }
}