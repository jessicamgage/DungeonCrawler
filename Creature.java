import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class Creature{

    int enemyAC;
    int enemyHP;

    public static void main(String[] args) {

    }

    public static String parseMonster(String monsterResponseBody){

        JSONObject monsterObject = new JSONObject(monsterResponseBody);
        int enemyAC = ((int) monsterObject.get("armor_class"));
        int enemyHP = ((int) monsterObject.get("hit_points"));

        System.out.println("armor class: " + enemyAC + " HP: " + enemyHP);

        return null;
    }

    public static String monsterType(String monsterType){

        return monsterType;
    }

    public static void monsterInfo(String monsterType){

        HttpClient monsterClient = HttpClient.newHttpClient();
        HttpRequest monsterRequest = HttpRequest.newBuilder().uri(URI.create("https://www.dnd5eapi.co/api/monsters/"
                +(monsterType)))
                .build();
        monsterClient.sendAsync(monsterRequest, HttpResponse.BodyHandlers.ofString())
                .thenApply(HttpResponse::body)
                .thenApply(Creature::parseMonster)
                .join();

    }
}