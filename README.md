<h1 align="center"> CURRENCY CONVERSION </h1>

Este proyecto es un conversor de moneda que consume la API de ExchangeRate para obtener las tasas de cambio en tiempo real. El proyecto forma parte de mi formación como desarrollador backend en el programa Oracle One Next Education.

## Descripción

El Conversor de Moneda es una aplicación que permite a los usuarios convertir entre diferentes monedas utilizando datos actualizados proporcionados por la API de ExchangeRate. Este proyecto ha sido desarrollado como parte de mi formación en el programa Oracle One Next Education, y es el primer proyecto que pone a prueba los conocimientos adquiridos en mi curso de Java.

## Características

- Conversión entre 5 diferentes monedas.
- Datos de tasas de cambio actualizados en tiempo real mediante la API de ExchangeRate.
- Interfaz de usuario sencilla y fácil de usar.

## Tecnologías Utilizadas

- Java
- API de ExchangeRate

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

3. Configura las dependencias necesarias (por ejemplo, si usas Maven o Gradle):

    ```bash
    javac -cp lib/gson-2.10.1.jar -d out $(find src -name "*.java")
    ```

4. Ejecuta la aplicación:

    ```bash
    java -cp lib/gson-2.10.1.jar:out com.aluracursos.coinconverter.principal.Main
    ```

## Uso

1. Ingresa la cantidad de dinero que deseas convertir.
2. Selecciona la moneda de origen y la moneda de destino.
3. Haz clic en el botón de convertir para obtener el resultado.

## Contribución

Si deseas contribuir a este proyecto, por favor sigue estos pasos:

1. Haz un fork del repositorio.
2. Crea una nueva rama (`git checkout -b feature/nueva-funcionalidad`).
3. Realiza tus cambios y haz commit de los mismos (`git commit -m 'Añadir nueva funcionalidad'`).
4. Haz push a la rama (`git push origin feature/nueva-funcionalidad`).
5. Abre una Pull Request.

## Licencia

Este proyecto está licenciado bajo la Licencia MIT. Para más detalles, consulta el archivo [LICENSE](LICENSE).

## Contacto

Para cualquier pregunta o sugerencia, puedes contactarme a través de [tu-email@example.com].

