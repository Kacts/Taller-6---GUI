# Taller 6 - GUI con Swing y Java2D

## Descripción
Aplicación para manejar un diario de restaurantes visitados y por visitar. Permite crear nuevos restaurantes, visualizar su información detallada (nombre, calificación con estrellas, estado de visita), y ver la ubicación de todos los restaurantes en un mapa.

## Características
- **Ventana Principal**: Muestra una lista de restaurantes y los detalles del restaurante seleccionado
- **Agregar Restaurante**: Ventana para crear nuevos restaurantes con nombre, calificación, ubicación en el mapa e indicador de visita
- **Visualización de Mapa**: Muestra todos los restaurantes en un mapa con opción para filtrar por visitados
- **Interfaz Gráfica**: Implementada con Swing y Java2D

## Estructura del Proyecto

```
src/
├── uniandes/dpoo/swing/
│   ├── mundo/
│   │   ├── Restaurante.java
│   │   └── Diario.java
│   └── interfaz/
│       ├── principal/
│       │   ├── VentanaPrincipal.java
│       │   ├── PanelBotones.java
│       │   ├── PanelLista.java
│       │   └── PanelDetallesRestaurante.java
│       ├── agregar/
│       │   ├── VentanaAgregarRestaurante.java
│       │   ├── PanelEditarRestaurante.java
│       │   ├── PanelBotonesAgregar.java
│       │   └── PanelMapaAgregar.java
│       └── mapa/
│           ├── VentanaMapa.java
│           └── PanelMapaVisualizar.java
imagenes/
└── mapa.png
```

El proyecto también incluye `ClassDiagram.png` y `ClassDiagram.pdf` con el diagrama de clases de la aplicación.

## Requisitos
- Java 8 o superior
- El archivo de imagen `imagenes/mapa.png` debe estar en la carpeta raíz del proyecto

## Compilación y Ejecución

### Opción 1: Compilar y ejecutar desde línea de comandos

1. Navega a la carpeta raíz del proyecto:
```bash
cd "Taller Swing Restaurantes Esqueleto"
```

2. Compila los archivos Java:
```bash
javac -d bin src/uniandes/dpoo/swing/mundo/*.java src/uniandes/dpoo/swing/interfaz/*.java src/uniandes/dpoo/swing/interfaz/principal/*.java src/uniandes/dpoo/swing/interfaz/agregar/*.java src/uniandes/dpoo/swing/interfaz/mapa/*.java
```

3. Ejecuta la aplicación:
```bash
java -cp bin uniandes.dpoo.swing.interfaz.principal.VentanaPrincipal
```

### Opción 2: Usar un IDE (Eclipse, IntelliJ, NetBeans)

1. Importa el proyecto como un proyecto Java
2. Asegúrate de que la carpeta `imagenes/` esté en la raíz del proyecto
3. Ejecuta la clase `VentanaPrincipal.main()`

## Uso de la Aplicación

### Ventana Principal
- **Lista de Restaurantes**: Muestra todos los restaurantes registrados
- **Panel de Detalles**: Muestra nombre, calificación (en estrellas) y estado de visita del restaurante seleccionado
- **Botón "Nuevo"**: Abre la ventana para agregar un nuevo restaurante
- **Botón "Ver Todos"**: Abre la ventana del mapa mostrando todos los restaurantes

### Ventana Agregar Restaurante
- **Nombre**: Ingresa el nombre del restaurante
- **Calificación**: Selecciona una calificación de 1 a 5 estrellas
- **Visitado**: Indica si ya visitaste el restaurante
- **Mapa**: Haz clic en el mapa para marcar la ubicación del restaurante (punto rojo)
- **Botón "Crear"**: Agrega el restaurante y cierra la ventana
- **Botón "Cerrar"**: Cierra la ventana sin crear un restaurante

### Ventana Mapa
- **Mapa Interactivo**: Muestra todos los restaurantes con su nombre y ubicación
- **Radio Buttons**:
  - **Todos**: Muestra todos los restaurantes registrados
  - **Visitados**: Muestra solo los restaurantes ya visitados

## Datos de Ejemplo
La aplicación se inicia con 5 restaurantes de ejemplo:
- **Pita Pan** (Calificación: 4, Visitado)
- **Lord of the Wings** (Calificación: 5, Visitado)
- **Nacho Business** (Calificación: 2, No visitado)
- **Thai Tanic** (Calificación: 1, No visitado)
- **Planet of the Creppes** (Calificación: 3, Visitado)

## Notas Técnicas

### Tecnologías Utilizadas
- **Swing**: Framework para construcción de interfaces gráficas
- **Java2D**: API para dibujo gráfico
- **BorderLayout, GridLayout, FlowLayout**: Administradores de diseño
- **Listeners**: Manejo de eventos (ActionListener, ListSelectionListener, MouseListener)

### Patrones de Diseño
- **MVC (Model-View-Controller)**: Separación entre la lógica (Restaurante, Diario) y la interfaz gráfica
- **Observer Pattern**: Implementado a través de los listeners de eventos

## Autor
Completado como parte del Taller 6 de Programación Orientada a Objetos - DPOO
