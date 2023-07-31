package CollectionDemo.SetDemo;

/**
 * 新闻类
 */
public class NewTitle {
    private int id;
    private String tltleName;
    private String creater;

    public NewTitle(){

    }
    public NewTitle(int id, String tltleName, String creater){
        this.id=id;
        this.creater=creater;
        this.tltleName=tltleName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTltleName() {
        return tltleName;
    }

    public void setTltleName(String tltleName) {
        this.tltleName = tltleName;
    }

    public String getCreater() {
        return creater;
    }

    public void setCreater(String creater) {
        this.creater = creater;
    }
}
