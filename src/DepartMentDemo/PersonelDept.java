package DepartMentDemo;

public class PersonelDept extends DepartMent{

    private int count;//本月招聘人数





    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }


    public PersonelDept(String name, String manager, String responsbility, int count) {
       super(name,manager,responsbility);
        this.count = count;
    }

    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println("本月招聘人数" + count +"\n");
    }
}
