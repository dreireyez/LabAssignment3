public class SmartphoneAdapter implements PowerOutlet {
    private SmartphoneCharger phone;

    public SmartphoneAdapter(SmartphoneCharger phone) {
        this.phone = phone;
    }

    @Override
    public String plugIn() {
        return phone.chargePhone();
    }
}