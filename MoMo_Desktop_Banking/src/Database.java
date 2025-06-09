import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// This is account database class
// Which includes account
class Record{
    private String card_f4, card_s4, card_t4, card_l4;
    private String password;
    private String user_name;

    public Record(String card_number, String password, String user_name) throws Exception {
        if (card_number.length() != 16){
            throw new Exception();
        } else if (password.length() < 6){
            throw new Exception();
        }

        this.user_name = user_name;

        this.card_f4 = card_number.substring(0, 4);
        this.card_s4 = card_number.substring(4, 8);
        this.card_t4 = card_number.substring(8, 12);
        this.card_l4 = card_number.substring(12, 16);
        this.password = password;
    }

    public void set_user_name(String new_user_name) throws Exception{
        if (new_user_name.length() < 2){
            throw new Exception();
        }
        this.user_name = new_user_name;
    }

    public String get_user_name(){
        return this.user_name;
    }

    public void set_card_s4(String new_card_s4) throws Exception {
        if (new_card_s4.length() != 4){
            throw new Exception();
        }

        for (int i = 0; i < new_card_s4.length(); i++){
            String digits = "0123456789";
            if (!digits.contains(String.valueOf(digits.charAt(i)))){
                throw new Exception();
            }
        }
        this.card_s4 = new_card_s4;
    }

    public String get_card_s4() {
        return this.card_s4;
    }

    public String get_card_f4() {
        return this.card_f4;
    }

    public void set_card_f4(String new_card_f4) throws Exception {
        if (new_card_f4.length() != 4){
            throw new Exception();
        }

        for (int i = 0; i < new_card_f4.length(); i++){
            String digits = "0123456789";
            if (!digits.contains(String.valueOf(digits.charAt(i)))){
                throw new Exception();
            }
        }
        this.card_f4 = new_card_f4;
    }

    public void set_card_t4(String new_card_t4) throws Exception {
        if (new_card_t4.length() != 4){
            throw new Exception();
        }

        for (int i = 0; i < new_card_t4.length(); i++){
            String digits = "0123456789";
            if (!digits.contains(String.valueOf(digits.charAt(i)))){
                throw new Exception();
            }
        }
        this.card_t4 = new_card_t4;
    }

    public String get_card_t4() {
        return this.card_t4;
    }

    public void set_card_l4(String new_card_l4) throws Exception {
        if (new_card_l4.length() != 4){
            throw new Exception();
        }

        for (int i = 0; i < new_card_l4.length(); i++){
            String digits = "0123456789";
            if (!digits.contains(String.valueOf(digits.charAt(i)))){
                throw new Exception();
            }
        }
        this.card_l4 = new_card_l4;
    }

    public String get_card_l4() {
        return this.card_l4;
    }

    public String get_card_num(){
        return this.card_f4 + this.card_s4 + this.card_t4 + this.card_l4;
    }

    public void set_password(String new_password) throws Exception {
        if (password.length() < 6){
            throw new Exception();
        }
        this.password = new_password;
    }

    public String get_password(){
        return this.password;
    }
}

public class Database{
    private int capacity;
    private String Name;
    private List<Record> Record_List;

    public Database(int capacity, String Name) throws Exception{
        if (capacity <= 2 || capacity >= 2000){
            throw new Exception();
        } else if (Name.length() <= 2){
            throw new Exception();
        }
        this.capacity = capacity;
        this.Name = Name;
        this.Record_List = new ArrayList<>(capacity);
    }

    public void set_capacity(int newCap) throws Exception {
        if (newCap <= 2 || newCap >= 50){
            throw new Exception();
        }
        this.capacity = newCap;
    }

    public int get_capacity() {
        return this.capacity;
    }

    public void set_Name(String newName) throws Exception {
        if (Name.length() <= 2){
            throw new Exception();
        }
        this.Name = newName;
    }

    public String get_Name() {
        return this.Name;
    }

    public void add_record_list(Record record1, Record record2, Record record3) {
        this.Record_List = new ArrayList<>(Arrays.asList(record1, record2, record3));
    }

    public void add_record(Record record) {
        this.Record_List.add(record);
    }

    public List<Record> get_Record_List(){
        return this.Record_List;
    }
}