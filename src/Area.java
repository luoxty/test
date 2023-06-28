import java.util.Map;
import java.util.*;
public class Area {
    public static void main(String[] args) {
        double PI = Math.PI;
        System.out.println("请输入半径:");
        Scanner input = new Scanner(System.in);
        double radius = input.nextDouble();
        double area = radius * radius *PI;
        System.out.println(area);
        System.out.println("请输入半径:");
        Scanner input2 = new Scanner(System.in);
        double radius2 = input2.nextDouble();
        double area2 = radius2 * radius2 *PI;
        System.out.println(area2);
        System.out.println();
        System.out.println();
        System.out.println();

    }
}
