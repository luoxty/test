package DuoTai;

/**
 * 汽车租赁管理类
 */
import DuoTai.Model.MotolVehicle;
import DuoTai.Service.MotoOperation;

import java.util.Scanner;

public class RentMagrSys {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        MotoOperation motoMgrSys = new MotoOperation();
        motoMgrSys.init();
        MotolVehicle moto =null;
        System.out.println("***************欢迎光临汽车租赁公司**************");
        System.out.println("1.轿车 \t 2.公交车");
        System.out.println("请选择你要租赁的车型");
        int motoTpty = input.nextInt();
        String brand = "";
        String type = "";
        int seat = 0;

        if(motoTpty == 1){
            System.out.println("请选择你要租赁的汽车品牌:1.别克 \t 2.宝马");
            int choose2= input.nextInt();
            if(choose2 ==1){
                brand = "别克";
                System.out.println("请选择你要租赁的汽车类型:1.林荫大道 \t  2.GL8");
                type = (input.nextInt()==1)?" 林荫大道":"GL8";
            }else if(choose2 ==2){
                System.out.println("请选择你要租赁的汽车类型:1.X6 \t  2.550i");
                type = (input.nextInt()==1)?" X6":"550i";
            }
        }else if(motoTpty ==2){
            System.out.println("请选择你要租赁的汽车品牌:1.金龙 \t 2.金杯");
            brand = (input.nextInt()==1)?" 林荫大道":"GL8";
            System.out.println("请选择你要租赁的汽车座位数:1.26座 \t 2.34座");
            seat  = (input.nextInt()==1)?16:34;

        }
        moto = motoMgrSys.motoLeaseOut(brand, type, seat);
        System.out.println("请输入租赁的天数:");
        int days = input.nextInt();
        float money = moto.calRent(days);
        System.out.println("您的这牌好号是:" + moto.getVehicelId());
        System.out.println("您需要交付的租金为" + money  +"元");


    }
}
