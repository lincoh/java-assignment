public class Air_vehicles extends type_of_vehicles {
    private String number_of_engines;
    private String use;

    public String getNumber_of_engines() {
        return number_of_engines;
    }

    public void setNumber_of_engines(String number_of_engines) {
        this.number_of_engines = number_of_engines;
    }

    public String getPurpose() {
        return use;
    }

    public void use(String purpose) {
        this.use = purpose;
    }
}
