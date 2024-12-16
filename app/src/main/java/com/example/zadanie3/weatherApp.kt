package com.example.zadanie3

class Weather {
    companion object {
        val Forecast = mapOf<String, String>(
            "New York" to "Sunny",
            "London" to "Rainy",
            "Paris" to "Cloudy",
            "Tokyo" to "Windy",
            "Sydney" to "Sunny",
            "Berlin" to "Rainy",
            "Moscow" to "Snowy",
            "Dubai" to "Hot",
            "Cape Town" to "Clear",
            "Rio de Janeiro" to "Humid"
        )
    }
}

fun WeatherApp() {
    print("Search for city: ")
    var city: String = readln()
    var localWeather = Weather.Forecast.filter { it.key == city }
    for (entry in localWeather) {
        println(entry.value)
    }
    println()

    WeatherApp()
}
fun main() {
    WeatherApp()
}