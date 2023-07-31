package DepartMentDemo;

public class ResearchDept extends DepartMent {
    private String sepcilality;

    @Override
    public void printDetail() {
        super.printDetail();
        System.out.println("研发种类:" + sepcilality + '\n');
    }

    public ResearchDept(String name, String manager, String responsbility, String sepcilality) {
        super(name, manager, responsbility);
        this.sepcilality = sepcilality;

    }

    public String getSepcilality() {
        return sepcilality;
    }

    public void setSepcilality(String sepcilality) {
        this.sepcilality = sepcilality;
    }
}
