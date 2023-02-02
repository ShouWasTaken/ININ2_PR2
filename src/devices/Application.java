package devices;

public class Application {
    private String appName;
    private String version;
    private double price;

    public String getAppName() {
        return appName;
    }

    public String getVersion() {
        return version;
    }

    public double getPrice() {
        return price;
    }

    public Application(String appName, String version, double price) {
        this.appName = appName;
        this.version = version;
        this.price = price;
    }
}
