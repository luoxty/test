package DuoTai.Model;

public class Car extends MotolVehicle {
    private String type;

    public Car() {

    }

    public Car(String vehicelId, String brand,  String type,int perRent) {
        super(vehicelId, brand, perRent);
        this.type = type;
    }

    /**
     *
     * @param days
     * @return
     * 重写计算租金
     */
    @Override
    public Float calRent(int days) {
        float price = this.getPerRent();
        if(days>7 && days<=30){
            price *=0.9f;
        }else if(days<30 && days<=150){
            price *= 0.8f;
        }else if(days >150){
            price *=0.7f;
        }
        return price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
