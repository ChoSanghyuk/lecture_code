package hellojpa;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Test {

    @Id
    Long id;
    String col1;
    String col2;

    public Test(){

    }
    public Test(Long id, String col1, String col2) {
        this.id = id;
        this.col1 = col1;
        this.col2 = col2;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCol1() {
        return col1;
    }

    public void setCol1(String col1) {
        this.col1 = col1;
    }

    public String getCol2() {
        return col2;
    }

    public void setCol2(String col2) {
        this.col2 = col2;
    }
}
