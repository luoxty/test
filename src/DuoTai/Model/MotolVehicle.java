package DuoTai.Model;

/**
 * @author Luoxty
 * @version 2021.2
 * @date 2023/7/2 10:17
 * @DevelopmentTool IDEA
 */

public abstract class MotolVehicle {
    private String vehicelId;
    private String brand;
    private int perRent;

    public abstract Float calRent(int days);

    public MotolVehicle() {

    }

    public MotolVehicle(String vehicelId, String brand, int perRent) {
        this.brand = brand;
        this.vehicelId = vehicelId;
        this.perRent = perRent;
    }

    public String getVehicelId() {
        return vehicelId;
    }

    public void setVehicelId(String vehicelId) {
        this.vehicelId = vehicelId;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPerRent() {
        return perRent;
    }

    public void setPerRent(int perRent) {
        this.perRent = perRent;
    }
}
