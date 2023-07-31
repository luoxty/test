package DuoTai.Service;
import DuoTai.Model.MotolVehicle;
import DuoTai.Model.Car;
import DuoTai.Model.Bus;


public class MotoOperation {
    public MotolVehicle motos[] = new MotolVehicle[8];
    public void init(){
    motos[0] = new Car("京123456","宝马","X6",800);
    motos[1] = new Car("京123456","宝马","550i",600);
    motos[2] = new Car("京123456","别克","林荫大道",300);
    motos[3] = new Car("京123456","别克","GL8",600);

    motos[4] = new Bus("京123456","金杯",16,800);
    motos[5] = new Bus("京123456","金杯",36,800);
    motos[6] = new Bus("京123456","金杯",34,1500);
    motos[7] = new Bus("京123456","金龙",34,1500);
    }
    public MotolVehicle motoLeaseOut(String brand,String tupe,int seat){
        MotolVehicle moto = null;
   /*     int []sum ={11,22,33,44,55};
        for(int i = 0;i<sum.length;i++){
            System.out.println(sum[i]);
        }
        //增强型for循环
        for(int i:sum){
            System.out.println(i);
        }*/
        for (MotolVehicle mymoto:motos){
            if(mymoto instanceof Car){
                Car car = (Car) mymoto;
                if(car.getBrand().equals(brand) && car.getType().equals(car.getType())){
                    moto =car;
                    break;
                }
            }else {
                Bus bus = (Bus) mymoto;
                if(bus.getBrand().equals(brand) && bus.getSeatCount() == seat){
                    moto = bus;
                }
            }
        }
        return moto;
    }
}
