package Lesson7;

import HW7.AccuWeatherProvider;
import HW7.Functionality;
import HW7.Periods;
import HW7.WeatherProvider;

import java.io.IOException;
import java.util.HashMap;

public class Controller {
    WeatherProvider weatherProvider = new AccuWeatherProvider();
    Map<Integer, HW7.Functionality> variantResult = new HashMap();

    public Controller() {
        variantResult.put(1, HW7.Functionality.GET_CURRENT_WEATHER);
        variantResult.put(2, Functionality.GET_WEATHER_IN_NEXT_5_DAYS);
    }

    public void onUserInput(String input) throws IOException {
        int command = Integer.parseInt(input);
        if (!variantResult.containsKey(command)) {
            throw new IOException("There is no command for command-key " + command);
        }

        switch (variantResult.get(command)) {
            case GET_CURRENT_WEATHER:
                getCurrentWeather();
                break;
            case GET_WEATHER_IN_NEXT_5_DAYS:
                getWeatherIn5Days();
                break;
        }
    }

    public void getCurrentWeather() throws IOException {
        weatherProvider.getWeather(HW7.Periods.NOW);
    }

    public void getWeatherIn5Days() {
        throw new RuntimeException(Periods.FIVE_DAYS);
    }
}