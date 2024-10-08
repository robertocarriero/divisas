# CONVERSOR DE MONEDAS

## Descripoción
**Este es un conversor de monedas que utiliza la API de ExchangeRate para obtener las tasas de conversión entre varias divisas. El programa está desarrollado en Java y permite convertir el valor de una moneda base a otra moneda final mediante la cotización de la misma.**

## USO

*1- Ejecutar la clase Principal para iniciar el programa.*

*2- Se desplegará un menú con varias opciones para convertir entre diferentes divisas.*

*3- Elegir una opción del menú ingresando el número correspondiente.*

*4- Introducir el monto que deseas convertir.*

*5- El programa mostrará el valor convertido junto con la tasa de conversión actualizada.*

## Ejemplo de ejecución ##

********************************************************
### Conversor de Moneda ###

1- Dólar a Peso Argentino

2- Peso Argentino a Dólar

3- Dólar a Real Brasileño

4- Real Brasileño a Dólar

5- Dólar a Peso Colombiano

6- Peso Colombiano a Dólar

7- Dólar a Peso Chileno

8- Peso Chileno a Dólar

9- Dólar a Peso Mexicano

10- Peso Mexicano a Dólar

11- Salir

Elija una opción:
*******************************************************
Elija una opción: 

1

Indique un monto:

10000

Registro de la conversión realizada el: 2024-10-07 22:19:34

El monto ingresado de:  10000.0 USD  ==> Equivalente a: ==>  9755000.0 ARS

## Estructura del Proyecto ##

El proyecto está compuesto por tres clases principales:

*Principal.java: Es el punto de entrada del programa. Se encarga de mostrar el menú, recibir las entradas del usuario, y realizar las conversiones mediante la consulta a la API.*

*Datos.java: Es un record que representa los datos obtenidos de la API. Contiene la tasa de conversión, el resultado de la conversión, y las monedas origen y destino.*

*DatosPrincipales.java: Esta clase encapsula los datos principales del resultado de la conversión. Contiene métodos para formatear y mostrar el resultado de manera clara.*

*El programa utiliza las bibliotecas java.time.LocalDateTime y java.time.format.DateTimeFormatter para registrar el momento exacto en que se realiza cada conversión.*

### Ejecución del Programa ###

1- Clona el repositorio en tu máquina local.

2- Compila y ejecuta el archivo Principal.java

3- Selecciona la conversión deseada en el menú e ingresa el monto a convertir.

4- El programa te mostrará el resultado de la conversión y registrará la transacción con la fecha y hora actuales.

5- Para salir del programa, selecciona la opción "Salir" en el menú. Opción 11

### Requerimientos ###

*Java 17 o superior*

*Conexión a internet (para acceder a la API de ExchangeRate)*

**Instalación**

*Asegúrate de tener Java instalado en tu sistema.*

*Clona este repositorio.*

*Ejecuta Principal.java desde tu IDE o línea de comandos.*

### Api Utilizada ###

*Este proyecto utiliza la ExchangeRate-API para obtener las tasas de conversión actualizadas. La API es consultada en tiempo real cada vez que el usuario selecciona una opción del menú.*

*URL base de la API: https://v6.exchangerate-api.com/
Para más información, podés visitar: ExchangeRate-API*

## Diagrama básico del flujo de clases: ##

Principal

|
---> Llama a la API para obtener los datos

|
---> Usa Datos.java para almacenar la respuesta

|
---> Usa DatosPrincipales.java para mostrar los resultados








