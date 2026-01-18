# 🌦️ Weather API – Spring Boot Project

## 📌 Project Overview
This project is a **Weather API built using Java Spring Boot**.  
Instead of maintaining our own weather data, the application fetches **real-time weather information from a third-party weather service** and returns it through RESTful endpoints.

The project is designed to help understand:
- Integration with **3rd-party APIs**
- **Caching using Redis**
- Usage of **environment variables**
- Backend API structure and request handling

---

## 🚀 Features
- Fetches real-time weather data for a given city
- Uses **Visual Crossing Weather API**
- Implements **Redis caching** to reduce repeated API calls
- Cache entries expire automatically (TTL)
- Secure handling of API keys using environment variables
- RESTful API design
- Proper error handling

---

## 🛠️ Tech Stack
- **Java**
- **Spring Boot**
- **Spring Web**
- **Redis**
- **Docker (for Redis)**
- **Maven**
- **Visual Crossing Weather API**

---

## 🌐 Third-Party Weather API
This project uses **Visual Crossing Weather API**, which is free and easy to use.

🔗 API Provider:  
https://www.visualcrossing.com/weather-api

---

## ⚙️ Caching Strategy (Redis)
- Redis is used as an **in-memory cache**
- The **city name** is used as the cache key
- Weather data is cached for **12 hours**
- Cache entries automatically expire using TTL
- Improves performance and minimizes third-party API usage

---

## 🔐 Environment Variables
Sensitive values are stored using environment variables.

### Required Environment Variables
<br><detail><pre>
WEATHER_API_KEY=your_visual_crossing_api_key
REDIS_HOST=localhost
REDIS_PORT=6379
</pre></detail>
### application.properties
    ```properties
    weather.api.key=${WEATHER_API_KEY}
    spring.redis.host=${REDIS_HOST}
    spring.redis.port=${REDIS_PORT}
    spring.cache.type=redis
    ```
### 🐳 Running Redis (Windows)
    ```bash
    docker run -d -p 6379:6379 --name redis redis
    ```
### Verify Redis is running:
    ```bash
    docker ps
    ```
link: https://roadmap.sh/projects/weather-api-wrapper-service
