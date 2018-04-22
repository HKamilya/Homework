import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class client_answer {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int client_id;
    private int question_id;
    private int question_option_id;


    public int getClient_id() {
        return client_id;
    }

    public void setClient_id(int client_id) {
        this.client_id = client_id;
    }

    public int getQuestion_id() {
        return question_id;
    }

    public void setQuestion_id(int question_id) {
        this.question_id = question_id;
    }

    public int getQuestion_option_id() {
        return question_option_id;
    }

    public void setQuestion_option_id(int question_option_id) {
        this.question_option_id = question_option_id;
    }
}
