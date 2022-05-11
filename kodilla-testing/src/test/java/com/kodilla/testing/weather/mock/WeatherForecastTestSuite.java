package com.kodilla.testing.weather.mock;

import com.kodilla.testing.weather.stub.Temperatures;
import com.kodilla.testing.weather.stub.WeatherForecast;
import org.junit.jupiter.api.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.HashMap;
import java.util.Map;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class WeatherForecastTestSuite {

    @BeforeAll
    public static void beforeAllTests() {
        System.out.println("This is the beginning of tests");
    }

    @BeforeEach
    public void beforeEachTests() {

        Map<String, Double> temperaturesMap = new HashMap<>();

        temperaturesMap.put("Rzeszow", 25.5);
        temperaturesMap.put("Krakow", 26.2);
        temperaturesMap.put("Wroclaw", 24.8);
        temperaturesMap.put("Warszawa", 25.2);
        temperaturesMap.put("Gdansk", 26.1);

    }

    @AfterAll
    public static void afterAllTests() {
        System.out.println("Tests are finished");
    }

    @Test
    public void testCalculateWeatherForecast(Map<String,Double> temperaturesMap) {

        Temperatures temperatures = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        int quantityOfSensors = weatherForecast.calculateForecast().size();
        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

        Assertions.assertEquals(5,quantityOfSensors);
    }

    @Test
    public void testGetAverageOfTemperatures(Map<String,Double> temperaturesMap) {

        Temperatures temperatures = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

        double average = weatherForecast.getAverageOfTemperatures();

        Assertions.assertEquals(25.56,average);
    }

    @Test
    public void testGetMedianOfTemperatures(Map<String,Double> temperaturesMap) {

        Temperatures temperatures = mock(Temperatures.class);
        WeatherForecast weatherForecast = new WeatherForecast(temperatures);

        when(temperatures.getTemperatures()).thenReturn(temperaturesMap);

        double median = weatherForecast.getMedianOfTemperatures();

        Assertions.assertEquals(25.5,median);
    }
}
