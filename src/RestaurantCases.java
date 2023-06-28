/**
 * @author Luoxty
 * @date 2023/6/26 10:22
 * @DevelopmentTool IDEA
 * @version 2021.2
 */

import java.util.*;
public class RestaurantCases {
    public static void main(String[] args) {
        //定义数据，菜品信息
        String[] dashNames = {"红烧带鱼", "鱼香肉丝", "时令蔬菜"};
        double[] prices = {30.0, 20.5, 15};
        int[] praiseNumd = new int[3];
        //定义订单
        String[] names = new String[4];
        String[] disMsg = new String[4];
        int[] times = new int[4];
        String[] address = new String[4];
        double[] dumPrices =new double[4];
        int[] states = new int[4];

        //初始化订单信息
        names[0] = "张三";
        disMsg[0] = "红烧带鱼 2份";
        times[0] = 10;
        address[0] = "黄河路113号";
        dumPrices[0] = 76;
        states[0] = 0 ;

        names[0] = "李四";
        disMsg[0] = "鱼香肉丝 1份";
        times[0] = 13;
        address[0] = "长江路113号";
        dumPrices[0] = 26;
        states[0] = 1;

        //搭建项目整体框架流程
        Scanner input = new Scanner(System.in);
        int num = -1;
        System.out.println("==========欢迎登录在线订餐系统==========");
        //记录用户是否退出
        boolean flag = false;
        do {
            System.out.println("====================");
            System.out.println("1:我要订餐");
            System.out.println("2:");
            System.out.println("3:");
            System.out.println("4:");
            System.out.println("5:");
            System.out.println("6:");
            System.out.println("====================");
            System.out.println("请输入上述相对应的数字进行选择");
            int choose = input.nextInt();
        }while (num == 0);
    }
}
