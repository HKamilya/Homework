import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity

public class achievment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String achievment_name;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAchievment_name() {
        return achievment_name;
    }

    public void setAchievment_name(String achievment_name) {
        this.achievment_name = achievment_name;
    }
}
