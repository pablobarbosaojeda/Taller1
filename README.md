# TALLER 4 Pablo Barbosa Ojeda

## Link al Repositorio
[https://github.com/pablobarbosaojeda/Taller1.git](https://github.com/pablobarbosaojeda/Taller1.git)

---

## Descripción

Esta aplicación Android es un ejercicio avanzado que combina varias funcionalidades clave para aprender a desarrollar aplicaciones utilizando Android Studio. Se han añadido nuevas características que incluyen el uso de sensores, widgets y fragmentos.

---

## Pantallas y Funcionalidades de la Aplicación

### **1. Pantalla de Inicio (`MainActivity`)**

- **Función**: Muestra un saludo personalizado que cambia según la hora del día (por ejemplo, "Buenos días", "Buenas tardes" o "Buenas noches").
- **Interacción**:
  - Un botón permite navegar a la Pantalla Principal.

---

### **2. Pantalla Principal (`PrincipalActivity`)**

- **Función**: Es el núcleo de la aplicación donde se concentran varias interacciones y funcionalidades avanzadas.
- **Interacción**:
  - **Campo de texto y botones**:
    - Campo de texto para ingresar un nombre.
    - Botón para guardar el nombre en las preferencias del usuario (`SharedPreferences`).
    - Botones para guardar, cargar y limpiar nombres en la base de datos SQLite.
    - Botón para simular una tarea en segundo plano mostrando el progreso con una barra de progreso.
    - Botón para navegar a la pantalla de configuración.
    - Botón para redirigir a la actividad de fragmentos.
  - **Uso del acelerómetro**:
    - Detecta movimientos del dispositivo y cambia el color de fondo dinámicamente.

---

### **3. Pantalla de Configuración (`ConfigActivity`)**

- **Función**: Permite al usuario cambiar el color de fondo de la aplicación.
- **Interacción**:
  - Botones para cambiar el color de fondo (rojo o azul).
  - Botón para regresar a la pantalla de inicio.

---

### **4. Pantalla de Fragmentos (`FragmentsActivity`)**

- **Función**: Demuestra el uso de fragmentos para dividir la interfaz en componentes reutilizables.
- **Fragmentos Implementados**:
  - **`FragmentLista`**:
    - Muestra una lista de nombres almacenados en la base de datos.
    - Permite seleccionar un nombre.
  - **`FragmentDetalles`**:
    - Muestra los detalles del nombre seleccionado en formato de lista.
    - Actualiza dinámicamente el contenido al seleccionar un nombre desde el fragmento de lista.

---

### **5. Widget de Aplicación**

- **Función**: Widget que muestra los nombres almacenados en la base de datos.
- **Interacción**:
  - Muestra un resumen de los nombres guardados en la base de datos.
  - Botón de "Actualizar" que permite recargar los datos del widget manualmente.

---

### **6. Clase de Gestión de la Base de Datos (`DatabaseHelper`)**

- **Función**: Maneja las operaciones de la base de datos, como la creación de tablas, inserción, consulta y eliminación de datos.
- **Detalles**:
  - Extiende `SQLiteOpenHelper`.
  - Implementa los métodos `onCreate` y `onUpgrade`.

---

## Cómo Usar la Aplicación

1. **Inicia la Aplicación**: Al abrir la aplicación, serás dirigido a la Pantalla de Inicio, que muestra un saludo según la hora del día.
2. **Navega a la Pantalla Principal**: Haz clic en el botón para ir a la Pantalla Principal.
3. **Ingresa y Guarda el Nombre**:
  - En la Pantalla Principal, ingresa tu nombre en el campo de texto.
  - Guarda el nombre usando los botones correspondientes para almacenarlo en las preferencias o la base de datos.
4. **Accede a los Fragmentos**:
  - Usa el botón "Ir a Fragmentos" para ver y seleccionar nombres desde una lista y mostrar sus detalles.
5. **Cambia el Fondo con el Acelerómetro**:
  - Mueve el dispositivo para cambiar dinámicamente el color de fondo.
6. **Accede a la Configuración**:
  - Usa el botón de configuración para cambiar el color de fondo.
7. **Usa el Widget**:
  - Agrega el widget a la pantalla de inicio.
  - Visualiza los nombres almacenados en la base de datos y actualízalos con el botón.

---

## Tecnologías Utilizadas

- **Android Studio**: Herramienta de desarrollo para crear aplicaciones Android.
- **SQLite**: Base de datos local para almacenar los nombres ingresados.
- **ConstraintLayout**: Layout utilizado para organizar los elementos en la pantalla.
- **SharedPreferences**: Almacenamiento de preferencias del usuario.
- **Acelerómetro**: Sensor para detectar el movimiento del dispositivo.
- **Widgets**: Componente interactivo en la pantalla de inicio.
- **Fragmentos**: Componentes reutilizables para dividir la interfaz en secciones.

---

### Autor
Pablo Barbosa Ojeda
