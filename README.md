# TALLER 1 Pablo Barbosa Ojeda

# Link al Repositorio: https://github.com/pablobarbosaojeda/Taller1.git

## Descripción

Esta aplicación Android es un ejercicio básico para aprender a crear aplicaciones utilizando Android Studio. La aplicación tiene tres pantallas principales que permiten al usuario interactuar y navegar entre ellas.

## Pantallas de la Aplicación


### 1. Pantalla de Inicio (MainActivity)

- **Función**: Muestra un saludo personalizado que cambia según la hora del día (por ejemplo, "Buenos días", "Buenas tardes" o "Buenas noches").
- **Interacción**: 
  - Un botón permite navegar a la Pantalla Principal.
  
### 2. Pantalla Principal (PrincipalActivity)

- **Función**: Permite al usuario ingresar su nombre, guardarlo y simular una operación de red en segundo plano.
- **Interacción**:
  - Campo de texto para ingresar el nombre.
  - Botón para guardar y mostrar el nombre ingresado.
  - Botón para iniciar una tarea en segundo plano que simula una operación de red, mostrando el progreso a través de una barra de progreso.
  - Botón para navegar a la Pantalla de Configuración.
  - Botón para regresar al menú principal.

### 3. Pantalla de Configuración (ConfigActivity)

- **Función**: Permite al usuario cambiar el color de fondo de la aplicación.
- **Interacción**:
  - Botones para cambiar el color de fondo a rojo o azul.
  - Botón para regresar a la Pantalla de Inicio.
  
### 4. Clase de Gestión de la Base de Datos (DatabaseHelper)

- **Función**: Maneja las operaciones de la base de datos, como la creación de tablas, inserción, actualización y eliminación de datos.
- **Interacción**:
  - La clase `DatabaseHelper` extiende `SQLiteOpenHelper` y se encarga de la creación y actualización de la base de datos.
  - Define constantes para el nombre de la base de datos, la versión, el nombre de la tabla y las columnas.
  - Implementa los métodos `onCreate` y `onUpgrade` para gestionar la creación y actualización de la base de datos.

## Cómo Usar la Aplicación

1. **Inicia la Aplicación**: Al abrir la aplicación, serás dirigido a la Pantalla de Inicio, que muestra un saludo según la hora del día.
2. **Navega a la Pantalla Principal**: Haz clic en el botón para ir a la Pantalla Principal.
3. **Ingresa y Guarda el Nombre**: En la Pantalla Principal, ingresa tu nombre en el campo de texto y guarda el nombre con el botón proporcionado. El nombre ingresado se mostrará en la pantalla.
4. **Accede a la Configuración**: Usa el botón en la Pantalla Principal para ir a la Pantalla de Configuración.
5. **Cambia el Color de Fondo**: En la Pantalla de Configuración, puedes cambiar el color de fondo a rojo o azul. Utiliza el botón para volver a la Pantalla de Inicio.

## Tecnologías Utilizadas

- **Android Studio**: Herramienta de desarrollo para crear aplicaciones Android.
- **ConstraintLayout**: Layout utilizado para organizar los elementos en la pantalla.
- **Button, TextView, EditText**: Componentes básicos de la interfaz de usuario.


