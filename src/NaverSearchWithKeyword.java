import org.json.JSONArray;
import org.json.JSONObject;
import service.NaverApiAgent;

/**
 * Created by danawacomputer on 2017-04-17.
 */
public class NaverSearchWithKeyword {

    public static void main(String[] args) {

        String keyword = "커리";

        String json = NaverApiAgent.searchAndReturnJson(keyword);

        JSONObject obj = new JSONObject(json);

//        JSONArray list = (JSONArray)obj.get("items");
//        JSONObject theThird = (JSONObject)list.get(2);
//        String result = theThird.getString("bloggerlink");

        JSONArray list = obj.getJSONArray("items");
        String result = list.getJSONObject(2).getString("bloggerlink");

        //System.out.println(result);

        JSONArray list2 = obj.getJSONArray("items");

        for (int i = 0; i < list2.length(); i++) {
            System.out.println(
                    list2.getJSONObject(i).getString("bloggername"));
        }
    }
}
