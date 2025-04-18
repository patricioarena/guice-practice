### Para correr el proyecto, se necesitan los siguientes requisitos:

1. **Java**:
   - Versión mínima recomendada: **Java 17.0.5** o superior.
   - Asegúrate de tener configurada la variable de entorno `JAVA_HOME` apuntando a la instalación de Java.

2. **Gradle**:
   - El proyecto utiliza Gradle como herramienta de construcción.
   - Versión mínima recomendada: **Gradle 7.3** (según el archivo `settings.gradle` generado).
   - Puedes instalar Gradle manualmente o usar el wrapper incluido (`./gradlew` en macOS/Linux o `gradlew.bat` en Windows).

3. **Dependencias**:
   - Las dependencias del proyecto se gestionan automáticamente por Gradle. Solo necesitas ejecutar los comandos de Gradle para descargarlas.

4. **Configuración del entorno**:
   - Asegúrate de tener acceso a internet para que Gradle pueda descargar las dependencias necesarias en la primera ejecución.

5. **Comandos básicos para ejecutar el proyecto**:
   - Para compilar el proyecto:
     ```bash
     ./gradlew build
     ```
   - Para ejecutar la aplicación:
     ```bash
     ./gradlew run
     ```

6. **IDE recomendado**:
   - Puedes usar IntelliJ IDEA para abrir y trabajar con el proyecto. Asegúrate de que el IDE esté configurado para usar la versión correcta de Java y Gradle.

Con estos pasos y configuraciones, deberías poder compilar y ejecutar el proyecto sin problemas.

---

### Resumen de patrones de diseño aplicados en el código hasta el momento:

1. **Inyección de Dependencias (Dependency Injection)**:
    - Se utiliza el framework Guice para gestionar las dependencias entre clases. Por ejemplo, en `General`, se configuran los bindings para que las interfaces como `VehicleAdapter` y `VehicleFactory` se asocien con sus implementaciones (`VehicleAdapterImpl`, `VehicleFactoryImpl`, etc.).
    - Esto permite desacoplar las dependencias y facilita la prueba y el mantenimiento del código.

2. **Fábrica (Factory)**:
    - El patrón Factory se aplica en `VehicleFactoryImpl`, que actúa como una fábrica general para crear vehículos. Utiliza un mapa (`factories`) para delegar la creación de vehículos a fábricas específicas (`CarFactoryImpl`, `LightSailboatFactoryImpl`).
    - Este patrón permite encapsular la lógica de creación de objetos y facilita la extensión para nuevos tipos de vehículos.

3. **Adaptador (Adapter)**:
    - `VehicleAdapter` y su implementación `VehicleAdapterImpl` actúan como un adaptador para simplificar la interacción con las fábricas de vehículos. Proveen métodos específicos (`createCar`, `createLightSailboat`) para crear vehículos de tipos concretos.
    - Este patrón se utiliza para traducir interfaces incompatibles o simplificar el uso de una API compleja.

4. **Singleton**:
    - `VehicleFactoryImpl` está anotada con `@Singleton`, lo que asegura que solo exista una instancia de esta clase en toda la aplicación. Esto es útil para compartir recursos o mantener un estado único.

5. **Builder**:
    - Las clases `Car`, `LightSailboat` y `State` utilizan el patrón Builder (a través de Lombok con `@Builder`) para construir instancias de manera fluida y legible. Este patrón es útil para crear objetos complejos con múltiples atributos opcionales.

6. **Enum como Estrategia**:
    - `TypeVehicle` y `StateVehicle` se utilizan como enumeraciones para representar tipos y estados de vehículos. Esto permite manejar valores constantes de manera segura y legible, además de asociar comportamientos o propiedades específicas a cada tipo.

7. **Mapeo de Tipos (Type Map)**:
    - En `VehicleFactoryImpl`, se utiliza un `EnumMap` para mapear tipos de vehículos (`TypeVehicle`) a sus respectivas fábricas. Este enfoque organiza las relaciones entre tipos y sus implementaciones de manera eficiente.

Estos patrones trabajan juntos para crear un sistema modular, extensible y fácil de mantener.