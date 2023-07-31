package DepartMentDemo;

public class Test {
    public static void main(String[] args) {
        PersonelDept pd1 = new PersonelDept("人事部", "张三", "负责公司人才招聘", 10);
        ResearchDept rd1 = new ResearchDept("研发部","李四","负责手机研发","移通通信");
        ResearchDept rd2 = new ResearchDept("研发部","李四","负责手机研发","移通通信");
        pd1.printDetail();
        rd1.printDetail();
        if(rd1 == rd2){
            System.out.println("二者为同一个对象");
        }else{
            System.out.println("  二者不为同一个对象");
        }
        if(rd1.equals(rd2)){
            System.out.println("二者为同一个对象");
        }else{
            System.out.println("  二者不为同一个对象");
        }
    }
}
