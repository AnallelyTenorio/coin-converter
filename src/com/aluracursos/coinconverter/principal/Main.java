package com.aluracursos.coinconverter.principal;

import com.aluracursos.coinconverter.principal.modelos.Convertidor;
import com.aluracursos.coinconverter.principal.modelos.ConvertidorApi;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.Scanner;
import java.util.InputMismatchException;


public class Main {
    public static void main(String[] args) {

        Scanner lectura = new Scanner(System.in);

        Gson gson = new GsonBuilder()
                .setFieldNamingPolicy(FieldNamingPolicy.LOWER_CASE_WITH_UNDERSCORES)
                .setPrettyPrinting()
                .create();
        principal:
        while (true) {

            var monedaAConvertir = "";
            var monedaDeConversion = "";
            var cantidadAConvertir = 0.0;
            System.out.println("***********************************");
            System.out.println("Eliga la moneda base a convertir: \n");
            System.out.println("1: Mexican Peso");
            System.out.println("2: United States Dollar");
            System.out.println("3: Euro");
            System.out.println("4: Colombian Peso");
            System.out.println("5: Brazilian Real");
            System.out.println("6: Salir");
            var opcionMenu = 0;
            try {
                opcionMenu = lectura.nextInt();
            } catch (InputMismatchException e) {
                // Limpiar el búfer del scanner para evitar bucles infinitos
                lectura.nextLine();
                System.out.println("Opcion no valida");
                continue;
            }
            switch (opcionMenu) {
                case 1:
                    monedaAConvertir = "MXN";
                    break;
                case 2:
                    monedaAConvertir = "USD";
                    break;
                case 3:
                    monedaAConvertir = "EUR";
                    break;
                case 4:
                    monedaAConvertir = "COP";
                    break;
                case 5:
                    monedaAConvertir = "BRL";
                    break;
                case 6:
                    break principal;
                default:
                    System.out.println("Opcion no valida");
                    continue;

            }

            System.out.println("***********************************");
            System.out.println("Eliga la moneda a la que desea convertir: \n");
            System.out.println("1: Mexican Peso");
            System.out.println("2: United States Dollar");
            System.out.println("3: Euro");
            System.out.println("4: Colombian Peso");
            System.out.println("5: Brazilian Real");
            System.out.println("6: Salir");

            var opcionAConvertir = 0;
            try {
                opcionAConvertir = lectura.nextInt();
            } catch (InputMismatchException e) {
                // Limpiar el búfer del scanner para evitar bucles infinitos
                lectura.nextLine();
                System.out.println("Opcion no valida");
                continue;
            }
            switch (opcionAConvertir) {
                case 1:
                    monedaDeConversion = "MXN";
                    break;
                case 2:
                    monedaDeConversion = "USD";
                    break;
                case 3:
                    monedaDeConversion = "EUR";
                    break;
                case 4:
                    monedaDeConversion = "COP";
                    break;
                case 5:
                    monedaDeConversion = "BRL";
                    break;
                case 6:
                    break principal;
                default:
                    System.out.println("Opcion no valida");
                    continue;

            }
            try {
                System.out.println("***********************************");
                System.out.println("Cantidad a convertir: \n");
                lectura.nextLine();

                try {
                    cantidadAConvertir = lectura.nextFloat();
                } catch (InputMismatchException e) {
                    // Limpiar el búfer del scanner para evitar bucles infinitos
                    lectura.nextLine();
                    continue;
                }

                String direcction = "https://v6.exchangerate-api.com/v6/931f44c397722c9e0fd01b00/pair/" +
                        monedaAConvertir +
                        "/" + monedaDeConversion +
                        "/" + cantidadAConvertir;

                // Crear un cliente HTTP
                HttpClient client = HttpClient.newHttpClient();

                // Crear una solicitud GET a la API
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(direcction))
                        .build();

                // Enviar la solicitud y obtener la respuesta

                HttpResponse<String> response = client.send(request, HttpResponse.BodyHandlers.ofString());
                // Verificar el código de estado de la respuesta
                int statusCode = response.statusCode();

                // Imprimir el cuerpo de la respuesta
                String responseBody = response.body();

                ConvertidorApi miConvertidorApi = gson.fromJson(responseBody, ConvertidorApi.class);

                Convertidor miConvertidor = new Convertidor(miConvertidorApi);

                System.out.println();
                System.out.println("***********************************");
                System.out.println(cantidadAConvertir + " " + monedaAConvertir + " Equivale a: " + miConvertidorApi.conversion_result() + " " + monedaDeConversion);
                System.out.println("***********************************");
                System.out.println("StatusCode: " + statusCode);
                System.out.println("Presione enter para continuar");
                lectura.nextLine();
                lectura.nextLine();
            } catch (Exception e) {
                System.out.println("Hubo un error al convertir. Por favor ingresa los datos nuevamente.");
                System.out.println("Recuerda que la cantidad a convertir debe ser un numero entero o decimal");
                continue;
            }
        }
    }
}