# Rainbow Six Siege Lite

## Introducción
Rainbow Six Siege Lite es una versión simplificada del popular juego de disparos táctico Rainbow Six Siege. Este proyecto tiene como objetivo proporcionar una implementación básica de elementos clave del juego, como jugadores, operadores, armas, mapas y modos de juego, utilizando el lenguaje de programación Java. Mientras que la versión completa de Rainbow Six Siege presenta mecánicas de juego complejas y una amplia variedad de contenido, Rainbow Six Siege Lite se centra en proporcionar una experiencia simplificada con características esenciales.

## Clases
1. **Jugador**
   - Representa a un jugador en el juego.
   - Atributos: nombre, salud, armadura, operador actual, mapa actual.
   - Funcionalidad: Seleccionar operador, seleccionar mapa, realizar acción.
   - Constructores: Múltiples constructores que permiten flexibilidad en la inicialización de los atributos del jugador.
   - Métodos: Getters y setters para atributos, métodos de selección y toString para representación del objeto.

2. **Operador**
   - Representa a un operador en el juego.
   - Atributos: nombre, habilidad especial.
   - Funcionalidad: Utilizar habilidad especial.
   - Constructores: Múltiples constructores para inicializar los atributos del operador.
   - Métodos: Getters y setters para atributos, método para utilizar habilidad especial y toString para representación del objeto.

3. **Arma**
   - Clase abstracta que representa un arma en el juego.
   - Métodos abstractos: shoot(), reload().
   - Funcionalidad: Proporciona una interfaz común para diferentes tipos de armas.
   - Métodos: Método performAction() de la interfaz Playable.
   - Subclases: AssaultRifles, Pistols - Implementan tipos específicos de armas con comportamiento personalizado.

4. **Mapa**
   - Representa un mapa en el juego.
   - Atributos: nombre.
   - Funcionalidad: Mostrar información del mapa.
   - Constructores: Inicializar el nombre del mapa.
   - Métodos: Getters y setters para el nombre, y toString para representación del objeto.

5. **Interfaz Playable**
   - Define un contrato para objetos jugables en el juego.
   - Método: performAction() - Especifica una acción que los objetos jugables pueden realizar.

6. **Enum GameMode**
   - Enumera los diferentes modos de juego disponibles en el juego.
   - Constantes: BOMB, HOSTAGE, SECURE_AREA - Representan diferentes modos.

## Flujo del Juego
1. **Inicialización**
   - Inicializar jugadores, operadores, armas, mapas y modo de juego.
   - Mostrar introducción y recopilar información del jugador.

2. **Selección del Mapa**
   - Mostrar mapas disponibles.
   - Seleccionar aleatoriamente un mapa para el juego.

3. **Selección del Operador**
   - Mostrar operadores disponibles.
   - El jugador selecciona un operador.
   - El jugador elige si usar la habilidad del operador.

4. **Jugabilidad**
   - Si el jugador elige usar la habilidad del operador, ejecutar la habilidad.
   - De lo contrario, continuar con la jugabilidad regular.
   - Realizar acciones como disparar y recargar con las armas seleccionadas.
   - Determinar el resultado del juego en función de las acciones del jugador.

## Diseño del Proyecto
- **Diseño Orientado a Objetos:** El proyecto sigue principios de programación orientada a objetos para modelar entidades del juego como objetos con atributos y comportamientos.
- **Encapsulamiento:** Se utiliza encapsulamiento de datos para encapsular datos dentro de objetos y controlar el acceso a través de métodos getter y setter, mejorando la integridad y seguridad de los datos.
- **Herencia:** La herencia se utiliza para establecer una jerarquía entre los tipos de armas, con la clase Weapon como clase base para subclases específicas de armas como AssaultRifles y Pistols.
- **Polimorfismo:** El polimorfismo se logra mediante la anulación de métodos e implementación de interfaces, permitiendo flexibilidad en el comportamiento y permitiendo que objetos de diferentes tipos se traten de manera uniforme.

## Conclusión
El proyecto Rainbow Six Siege Lite proporciona una implementación simplificada pero funcional de elementos clave del juego encontrados en Rainbow Six Siege. Sirve como una demostración de conceptos de programación orientada a objetos y proporciona una base para una expansión y refinamiento adicionales para crear experiencias de juego más complejas. A través de su diseño modular y extensible, el proyecto ofrece oportunidades de mejora y personalización para adaptarse a requisitos y preferencias específicas.
