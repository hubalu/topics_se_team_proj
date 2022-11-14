import java.util.List;

public class ItemManagement {

    public boolean upload_item(String item_name, String item_description, int shipping_cost, String category) {
       return true;
    }

    public boolean update_item(String field, Object value){
        return true;
    }

    public void flag_item(int item_id){
    }

    public List<String> search_item(String key_word, String Category, String sort_key, String order){
        return null;
    }

    public void update_category(String action, String category){

    }

    public boolean add_to_watchlist(int item_id, int user_id){
        return true;
    }
}
