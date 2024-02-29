<h1> Data Converter </h1>
<h1> Description</h1>
  This project converts time to milliseconds and returns the time to the current time zone and GMT. It uses API from 
  
  [World Time API](https://worldtimeapi.org/). The application runs on the 
  `localhost:8080`. You can also use Postman for testing.
<h1> Sonarcloud </h1>

You can evaluate the quality of the code 
[here](https://sonarcloud.io/summary/overall?id=AlnaSher_TimeConverter).
  
<h1> Used technologies: </h1>
<li>Maven</li>
<li>Java 17</li>
<li>Spring Boot 3.2.3</li>
<h1> Installation and use </h1>

  1. Clone the repository. 
  2. Run the application. 
<h1>Example of response</h1>

**Request**

`localhost:8080/api/v1/time`

**JSON response**

```
{
    "datetime": "2024-02-27T11:57:50.879364+03:00",
    "abbreviation": "+03",
    "timezone": "Europe/Minsk"
}
```
