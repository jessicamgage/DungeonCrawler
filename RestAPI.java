import org.json.JSONArray;
import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class RestAPI{
    public static void main(String[] args) {

        HttpClient client = HttpClient.newHttpClient();
        HttpRequest request = HttpRequest.newBuilder().uri(URI.create("https://www.dnd5eapi.co/api/monsters/")).build();
        client.sendAsync(request, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(RestAPI::parseMonster)
                .join();

    }

    public static String parseMonster(String monsterResponseBody){

        JSONObject monsterObject = new JSONObject(monsterResponseBody);
        JSONArray monsters = (JSONArray) monsterObject.get("results");

        for(int i = 0; i <monsters.length(); i++){
            JSONObject monster = (JSONObject) monsters.get(i);
            String index = monster.getString("index");
            String name = monster.getString("name");
            String url = monster.getString("url");

            System.out.println(name + " " + index + " " + url);
        }

        return null;
    }
}