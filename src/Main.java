public class Main {
    public static void main(String[] args) {
        
        // Devices
        Laptop laptop = new Laptop();
        Refrigerator ref = new Refrigerator();
        SmartphoneCharger phone = new SmartphoneCharger();

        // Adapters
        PowerOutlet laptopOutlet = new LaptopAdapter(laptop);
        PowerOutlet refOutlet = new RefrigeratorAdapter(ref);
        PowerOutlet phoneOutlet = new SmartphoneAdapter(phone);

        // Using the respective plugIn() methods of the adapters
        System.out.println(laptopOutlet.plugIn());
        System.out.println(refOutlet.plugIn());
        System.out.println(phoneOutlet.plugIn());
    }
}