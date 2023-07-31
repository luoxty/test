package DepartMentDemo;

public class DepartMent {
    private int ID;
    private String name = "待定";
    private int amount = 0;
    private String responsbility = "待定";
    private String manager = "无";

    public DepartMent() {

    }

    public DepartMent(String name, String manager, String responsbility) {
        this.name = name;
        this.manager = manager;
        this.responsbility = responsbility;
    }

    public void printDetail() {
        System.out.println("部门" + name + "\n经理" + manager + "\n部门职责" + responsbility);
    }
    //重写 equals 方法
    @Override
    public boolean equals(Object obj) {
        if(obj ==null){
            return false;
        }
        if(this == obj){
            return true;
        }
        if (!(obj instanceof DepartMent)){//instanceof 表示该对象是否属于该类的实例
            return false;
        }
        DepartMent dm = (DepartMent)obj;//强制转换
        if (this.name.equals(dm.name) && this.manager.equals(dm.manager) && this.responsbility.equals(dm.responsbility)){
            return true;
        }else {
            return  false;
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public String getResponsbility() {
        return responsbility;
    }

    public void setResponsbility(String responsbility) {
        this.responsbility = responsbility;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }
}
