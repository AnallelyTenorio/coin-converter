<h1 align="center"> CURRENCY CONVERSION </h1>

El Conversor de Moneda es una aplicación que permite a los usuarios convertir entre diferentes monedas utilizando datos actualizados proporcionados por la API de ExchangeRate. Este proyecto ha sido desarrollado como parte de mi formación en el programa Oracle One Next Education, y es el primer proyecto que pone a prueba los conocimientos adquiridos en mi curso de Java.

## Características

- Conversión entre 5 diferentes monedas.
- Datos de tasas de cambio actualizados en tiempo real mediante la API de ExchangeRate.
- Interfaz de usuario sencilla y fácil de usar.

## Tecnología

- Java openjdk 22
- API de exchangeRate-api.com

## Instalación

Para ejecutar este proyecto localmente, sigue estos pasos:

1. Clona este repositorio:

    ```bash
    git clone https://github.com/AnallelyTenorio/currency-conversion
    ```

2. Navega al directorio del proyecto:

    ```bash
    cd currency-conversion
    ```

3. Compila las dependencias del proyecto:

    ```bash
    javac -cp lib/gson-2.10.1.jar -d out $(find src -name "*.java")
    ```

4. Ejecuta la aplicación:

    ```bash
    java -cp lib/gson-2.10.1.jar:out com.aluracursos.coinconverter.principal.Main
    ```

## Uso

1. Selecciona la moneda de origen y la moneda de destino. Al ingresar una opción no valida, el programa indicara que no es valida y le pedira ingresar nuevamente el dato.
2. Ingresa la cantidad a convertir (Se permite el uso de numeros decimales).
3. Presiona enter para convertir y obtener el resultado.
4. Para salir se utiliza la opción 6.



