# Biorritmo

Calcula y grafica tu biorritmo —los ciclos físico (23 días), emocional (28) e intelectual (33)— a partir de tu fecha de nacimiento.

## Características

- Entrada de la fecha mediante cuadros de diálogo, con validación.
- Gráfica de líneas (JFreeChart) con los últimos 30 días.
- Cálculo con funciones senoidales.

## Requisitos

- JDK 21 y Maven 3.9 o superior.

## Compilar y ejecutar

```bash
mvn compile exec:java
```

## Notas

- El biorritmo es una pseudociencia sin respaldo científico; el proyecto es un ejercicio de programación y gráficos.

## JAR ejecutable (fat jar)

```bash
mvn clean package
java -jar target/mvn-biorhythm-1.0.0-SNAPSHOT-launcher.jar
```

El archivo `-launcher.jar` incluye todas las dependencias.

## Licencia

Código de ejemplo de uso libre con fines educativos.
