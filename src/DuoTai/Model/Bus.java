package DuoTai.Model;

public class Bus extends MotolVehicle {
    private int seatCount;

    public Bus() {

    }

    public Bus(String vehicelId, String brand, int perRent,int seatCount) {
        super(vehicelId, brand, perRent);
        this.seatCount = seatCount;
    }

    @Override
    public Float calRent(int days) {
        float price = this.getPerRent();
        if(days >=3 && days<7){
            price *= 0.9f;
        }else if(days>7 && days<=30){
            price *=0.8f;
        }else if(days<30 && days<=150){
            price *= 0.7f;
        }else if(days >150){
            price *=0.6f;
        }
        return price;
    }

    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }
}
