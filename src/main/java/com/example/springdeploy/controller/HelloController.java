package com.example.springdeploy.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    /*
        Value nos permite rescatar el valor de la carpeta aplication.properties
        ese valor se lo asigna autmaticament e la avariable que  hemos crea String message
        podemos crear distintos properties para distintes pefiles dessarrollo produccion prueba etc

    * */
    @Value("${app.prueba}")
    String message;
    @GetMapping("/hola")
    public String holaMundo(){
        System.out.println(message);
        return  "hola mundo que hace papi flow cogemos cambios ono";
    }

    @GetMapping("/bootstrap")
    public  String boostrap(){

        return """
                <!doctype html>
                <html lang="en">
                  <head>
                    <meta charset="utf-8">
                    <meta name="viewport" content="width=device-width, initial-scale=1">
                    <title>Bootstrap demo</title>
                    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
                  </head>
                  <body>
                    <h1>Hola mundo desde spring boot con una plantiilla de bostrap </h1>
                    <a class="btn btn-primary" href="https://www.google.com/design/">Google</a>
                    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
                  </body>
                </html>
                                
                """;

    }
}
