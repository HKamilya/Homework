import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class client_achievment {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int client_id;
    private int achievment_id;

    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getAchievment_id() {
        return achievment_id;
    }

    public void setAchievment_id(int achievment_id) {
        this.achievment_id = achievment_id;
    }
}
