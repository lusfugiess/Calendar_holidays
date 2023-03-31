package CalendarWithAPI;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class HolidayApi {
    public Holiday[] getHolidays(int year, String countryCode) {
        try {
            String jsonString = readJsonFromUrl("https://date.nager.at/api/v3/publicholidays/" + year + "/" + countryCode);
            JSONArray jsonArray = new JSONArray(jsonString);
            Holiday[] holidays = new Holiday[jsonArray.length()];

            for (int i = 0; i < jsonArray.length(); i++) {
                JSONObject jsonObject = jsonArray.getJSONObject(i);
                holidays[i] = new Holiday(jsonObject.getString("name"), jsonObject.getString("date"));
            }

            return holidays;
        } catch (IOException | JSONException e) {
            e.printStackTrace();
            return new Holiday[0];
        }
    }

    private static String readJsonFromUrl(String url) throws IOException {
        try (InputStream is = new URL(url).openStream();
             Scanner scanner = new Scanner(is, StandardCharsets.UTF_8.toString())) {
            scanner.useDelimiter("\\A");
            return scanner.hasNext() ? scanner.next() : "";
        }
    }
}
