import org.json.JSONArray;
import org.json.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.util.Scanner;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URI;
import java.net.http.HttpRequest;
import java.net.http.HttpClient;
import java.net.http.HttpResponse;
import java.net.URL;

public class APIData {
    public static void main(String[] args) throws IOException, ParseException {
        HttpClient restClient = HttpClient.newHttpClient();
        HttpRequest restRequest = HttpRequest.newBuilder().uri(URI.create("https://www.dnd5eapi.co/api/" + dataType("monsters")))
                .build();

        restClient.sendAsync(restRequest, HttpResponse.BodyHandlers.ofString()).thenApply(HttpResponse::body)
                .thenApply(APIData::data)
                .join();

        monsterList();

    }

    public static String data(String dataResponseBody){
        JSONObject dataObject = new JSONObject(dataResponseBody);
        JSONArray dataArray = (JSONArray) dataObject.get("results");

        for(int i = 0; i < dataArray.length(); i++){
            JSONObject dataUnit = (JSONObject) dataArray.get(i);
        }

        return null;
    }

    public static String dataType(String dataType){

        return dataType;
    }

    public static void getMonster(int challengeRating){

    }

    private static void monsterList() throws IOException, ParseException {
        URL monsterListURL = new URL("https://www.dnd5eapi.co/api/monsters/" + dataType("goblin"));
        HttpURLConnection conn = (HttpURLConnection) monsterListURL.openConnection();
        conn.setRequestMethod("GET");

        conn.connect();
        int responseCode = conn.getResponseCode();

        if(responseCode > 399){
            throw new RuntimeException("HttpResponseCode: " + responseCode);
        }

        Scanner monsterScanner = new Scanner(monsterListURL.openStream());
        while(monsterScanner.hasNext()){
            String inline = "";
            inline += monsterScanner.nextLine();

            System.out.println("\nJSON data in string format");
            System.out.println(inline);
            monsterScanner.close();

            JSONParser jsonParser = new JSONParser();

            JSONObject jsonObject = (JSONObject) jsonParser.parse(inline);
            JSONArray jsonArray = (JSONArray) jsonObject.get("results");
            for(int i = 0; i < jsonArray.length(); i++){
                JSONObject json2 = (JSONObject) jsonArray.get(i);

            }

            System.out.println(jsonArray);

        }

    }


    private static void spellList(){

    }

}
