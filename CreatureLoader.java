import org.json.JSONObject;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class CreatureLoader {
        public static void main(String[] args) {

        }

        public static String parseCreature(String creatureResponseBody){

            JSONObject creatureObject = new JSONObject(creatureResponseBody);
            int armorClass = ((int) creatureObject.get("armor_class"));
            int hitPoints = ((int) creatureObject.get("hit_points"));

            System.out.println("armor class: " + armorClass + " HP: " + hitPoints);

            return null;
        }

        public static void monsterInfo(String monsterType){

            HttpClient monsterClient = HttpClient.newHttpClient();
            HttpRequest monsterRequest = HttpRequest.newBuilder().uri(URI.create("https://www.dnd5eapi.co/api/monsters/"
                    +(monsterType).toLowerCase()))
                    .build();
            monsterClient.sendAsync(monsterRequest, HttpResponse.BodyHandlers.ofString())
                    .thenApply(HttpResponse::body)
                    .thenApply(CreatureLoader::parseCreature)
                    .join();
        }
}

