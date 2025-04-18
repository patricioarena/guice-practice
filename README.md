Resumen de patrones de diseño aplicados en el código hasta el momento:

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