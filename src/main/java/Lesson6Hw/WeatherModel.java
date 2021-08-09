package Lesson6Hw;

import java.io.IOException;
public interface WeatherModel {
    void getWeather(String selectedCity, Period period) throws IOException;
}
