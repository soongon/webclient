import service.NaverApiAgent;

/**
 * Created by danawacomputer on 2017-04-17.
 */
public class NaverSearchWithKeyword {

    public static void main(String[] args) {

        String keyword = "자바라";

        String json = NaverApiAgent.searchAndReturnJson(keyword);

        System.out.println(json);

    }
}
