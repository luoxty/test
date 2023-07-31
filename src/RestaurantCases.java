/**
 * @author Luoxty
 * @date 2023/6/26 10:22
 * @DevelopmentTool IDEA
 * @version 2021.2
 */

import com.sun.java.swing.plaf.windows.WindowsPopupMenuSeparatorUI;

import java.util.*;

public class RestaurantCases {
    public static void main(String[] args) {
        //定义数据，菜品信息
        String[] dishNames = {"红烧带鱼", "鱼香肉丝", "时令蔬菜"};
        double[] prices = {38.0, 20.5, 15};
        int[] praiseNumd = new int[3];
        //定义订单
        String[] names = new String[4];
        String[] dishMsg = new String[4];
        int[] times = new int[4];
        String[] addresses = new String[4];
        double[] sumPrices = new double[4];
        int[] states = new int[4];

        //初始化订单信息
        names[0] = "张三";
        dishMsg[0] = "红烧带鱼 2份";
        times[0] = 10;
        addresses[0] = "黄河路113号";
        sumPrices[0] = 76;
        states[0] = 0;

        names[0] = "李四";
        dishMsg[0] = "鱼香肉丝 1份";
        times[0] = 13;
        addresses[0] = "长江路113号";
        sumPrices[0] = 26;
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
            System.out.println("2:查看订单");
            System.out.println("3:签收订单");
            System.out.println("4:删除订单");
            System.out.println("5:我要点赞");
            System.out.println("6:运输系统");
            System.out.println("====================");
            System.out.println("请输入上述相对应的数字进行选择");
            int choose = input.nextInt();
            switch (choose) {
                case 1:
                    System.out.println("======我要订餐======");
                    //订餐方法
                    boolean isAdd = false; //订餐前要判断订单是否已满，如果已满（isAdd = flase），则不能进行订单操作
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] == null) {//表示订单未满，可以进行订单操作
                            isAdd = true;
                            System.out.println("请输入订餐人姓名:");
                            String name = input.next();//订餐人姓名
                            //循环输出菜品信息
                            System.out.println("序号\t菜品名\t单价\t点赞数");
                            for (int j = 0; j < dishNames.length; j++) {
                                String praise = (praiseNumd[j] == 0) ? "" : praiseNumd[j] + "赞";
                                System.out.println((j + 1) + "\t" + dishNames[j] + "\t" + prices[j] + "\t" + praise);
                            }
                            //让用户根据菜品编号的输入进行选择判断
                            System.out.println("请输入你要选择的菜品编号:");
                            int no = input.nextInt();//no表示选择的菜品编号1-4
                            while (no < 1 || no > dishNames.length) {
                                System.out.println("本店没有这个菜品，请重新选择");
                                no = input.nextInt();
                            }
                            //点菜份数选择
                            System.out.println("请输入你要点的这道菜的份数");
                            int number = input.nextInt();//number表示点菜份数
                            System.out.println("请输入送餐时间(送餐时间只能是10-20之间的整数):");
                            int time = input.nextInt();
                            while (time < 10 || time > 20) {
                                System.out.println("送餐时间有问题，亲请输入10-20之间的整数");
                                time = input.nextInt();
                            }
                            System.out.println("请输入你要的送餐地址");
                            String address = input.next();//address表示送餐地址
                            System.out.println("本次订餐成功");
                            String dishInfo = dishNames[no - 1] + "   " + number + "份";
                            System.out.println("你的订单是:" + dishInfo);
                            System.out.println("你的送餐时间是:" + time + "时");

                            double dishPrice = prices[no - 1] * number;
                            double peiSong = (dishPrice > 50) ? 0 : 6;
                            double sumPrice = dishPrice + peiSong;

                            System.out.println("餐费是:" + dishInfo + "元，配送费为" + peiSong + ",总计费用:" + sumPrice);

                            //把订单信息添加到订单数组中，注意插入的位置
                            names[i] = name;
                            dishMsg[i] = dishInfo;
                            times[i] = time;
                            addresses[i] = address;
                            sumPrices[i] = sumPrice;
                            break;
                        }
                    }
                    if (!isAdd) {
                        System.out.println("对不起，订单已满，无法下单");
                    }
                    flag = false;
                    break;
                case 2:
                    System.out.println("======查看订单======");
                    //查看订单
                    System.out.println("序号\t\t送餐人\t\t菜品\t\t配送时间\t\t配送地址\t\t订餐金额订\t\t单状态");
                    for (int i = 0; i < names.length; i++) {
                        if (names[i] != null) {
                            String time = times[i] + "时";
                            String state = (states[i] == 0) ? "已预定" : "已完成";
                            System.out.println((i + 1) + "\t" + "\t" + names[i] + "\t" + "\t" + "\t" + dishNames[i] + "\t" + time + "\t" + "\t" + addresses[i] + "\t" + "\t" + sumPrices[i] + "\t" + state);
                        }
                    }
                    break;
                case 3:
                    System.out.println("======签收订单======");
                    //签收订单
                    //签收之前需要进行判断：订单是存在，不存在的不能签收；订单已经完成状态，这是也不能签收；
                    boolean isSign = false;
                    System.out.println("请输入要签收的订单编号:");
                    int signNo = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        states[i] = 0;//
                        if ((names[i] != null) && (states[i] == 0) && (i == signNo - 1)) {
                            isSign = true;
                            states[i] = 1;
                            System.out.println("======订单签收成功======");
                        }

                    }
                    if (!isSign) {
                        System.out.println("你选择的订单不存在");
                    }
                    break;
                case 4:
                    System.out.println("======删除订单======");
                    //删除订单
                    //删除之前判断订单编号是否存在，状态为已经完成的订单可以删除，状态为预定的订单不可以删除。
                    boolean isDelete = false;//判断订单是否可以删除
                    System.out.println("请输入要删除的订单的编号");
                    int deleteNo = input.nextInt();
                    for (int i = 0; i < names.length; i++) {
                        if ((names[i] != null) && (states[i] == 0) && (i == deleteNo - 1)) {
                            isDelete = true;
                            //有订单信息，并且用户输入的订单编号已找到，订单状态为已完成，这是能删除
                            //要找到删除订单位置的下标:i,要把i后面的元素一次往前移动，最后一个元素要置空
                            //要注意的是，往前移动的过程是把后一个数组元素复制到前一个元素的过程，
                            for (int j = i; j < names.length; j++) {
                                names[j] = names[j + 1];
                                dishMsg[j] = dishMsg[j + 1];
                                times[j] = times[j + 1];
                                addresses[j] = addresses[j + 1];
                                sumPrices[j] = sumPrices[j = 1];
                                states[j] = states[j + 1];
                            }
                            //最后一个元素一定要置空，置空之后可以下新订单
                            names[names.length - 1] = null;
                            dishMsg[dishMsg.length - 1] = null;
                            times[times.length - 1] = 0;
                            addresses[addresses.length - 1] = null;
                            sumPrices[sumPrices.length - 1] = 0;
                            states[states.length - 1] = 0;
                        }
                    }
                    if (!isDelete) {
                        System.out.println("你要删除的订单不存在");
                    }
                    break;
                case 5:
                    System.out.println("======我要点赞======");
                    //我要点赞
                    //循环输出菜品信息
                    System.out.println("序号\t菜名\t单价\t点赞数");
                    for (int j = 0; j < dishNames.length; j++) {
                        String parise = (praiseNumd[j] == 0) ? "" : praiseNumd[j] + "赞";
                        System.out.println((j+1) + "\t" +dishNames[j] +"\t" + prices[j]+"\t" +parise);
                    }
                    //进行点赞
                    System.out.println("请输入你要点赞的菜品编号:");
                    int praiseNo = input.nextInt();
                    while (praiseNo <1 || praiseNo>dishNames.length){
                        System.out.println("本店没有此菜品，请从新输入菜品编号");
                        praiseNo = input.nextInt();
                    }
                    praiseNumd[praiseNo-1]++;
                    System.out.println("点赞成功");

                    break;
                case 6:
                    System.out.println("======运输系统======");
                    flag = true;
                    break;
                default:
                    flag = true;
                    break;
            }
            if (flag == false) {
                System.out.println("请输入0返回主界面");
                num = input.nextInt();
            } else {
                System.out.println("退出系统");
                break;

            }
        }
        while (num == 0);


    }
}