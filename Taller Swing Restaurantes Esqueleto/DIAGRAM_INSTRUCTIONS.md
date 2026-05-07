# Diagrama de Clases - Instrucciones de Generación

## Descripción
El archivo `ClassDiagram.puml` contiene el diagrama de clases de la aplicación Taller 6 en formato PlantUML.

## Opciones para Generar la Imagen

### Opción 1: Usar PlantUML Online (Recomendado - Sin instalación)
1. Abre: https://www.plantuml.com/plantuml/uml/
2. Copia el contenido del archivo `ClassDiagram.puml`
3. Pégalo en el editor online
4. Descarga la imagen usando el botón PNG/SVG

### Opción 2: Usar VS Code con Extensión
1. Instala la extensión "PlantUML" en VS Code
2. Abre el archivo `ClassDiagram.puml`
3. Haz clic derecho → "Open Preview to the side" o usa Ctrl+Shift+P → "PlantUML: Export Current Diagram"
4. Exporta como PNG

### Opción 3: Usar línea de comandos (Requiere instalación)

#### En Windows:
```bash
# Primero instala PlantUML:
# Opción A: Usando Chocolatey
choco install plantuml

# Opción B: Descarga desde https://plantuml.com/download

# Luego genera la imagen:
plantuml ClassDiagram.puml -o .

# Esto generará ClassDiagram.png
```

#### En macOS (con Homebrew):
```bash
brew install plantuml

plantuml ClassDiagram.puml -o .
```

#### En Linux:
```bash
sudo apt-get install plantuml

plantuml ClassDiagram.puml -o .
```

### Opción 4: Usar Docker (Si tienes Docker instalado)
```bash
docker run --rm -v $PWD:/workspace plantuml/plantuml -o /workspace ClassDiagram.puml
```

## Interpretación del Diagrama

### Símbolos utilizados:
- **Flecha → continuă**: Asociación (relación entre clases)
- **Flecha vacía ▽**: Herencia (extends)
- **Implementación**: Interface implementation
- **Paquetes**: Carpetas de código agrupadas por funcionalidad

### Estructura del Diagrama:

1. **Paquete "mundo"**: Clases de modelo de datos
   - `Restaurante`: Entidad que representa un restaurante
   - `Diario`: Colección de restaurantes

2. **Paquete "interfaz.principal"**: Ventana principal y paneles asociados
   - `VentanaPrincipal`: Ventana principal (JFrame)
   - `PanelBotones`: Panel con botones de acciones
   - `PanelLista`: Panel con lista de restaurantes
   - `PanelDetallesRestaurante`: Panel mostrando detalles del restaurante seleccionado

3. **Paquete "interfaz.agregar"**: Interfaz para agregar nuevos restaurantes
   - `VentanaAgregarRestaurante`: Ventana secundaria (JFrame)
   - `PanelEditarRestaurante`: Campos para editar datos del restaurante
   - `PanelBotonesAgregar`: Botones para crear o cancelar
   - `PanelMapaAgregar`: Mapa interactivo para seleccionar ubicación

4. **Paquete "interfaz.mapa"**: Interfaz para visualizar restaurantes en mapa
   - `VentanaMapa`: Ventana secundaria (JFrame)
   - `PanelMapaVisualizar`: Panel que dibuja los restaurantes en el mapa

## Información Adicional

### Convenciones UML usadas:
- **Métodos públicos (+)**: Accesibles desde cualquier clase
- **Atributos privados (-)**: Solo accesibles dentro de la clase
- **Herencia (extends)**: Las clases heredan de JFrame o JPanel
- **Interfaces implementadas**: Listeners para manejo de eventos

### Relaciones principales:
- VentanaPrincipal es el controlador central que coordina todos los paneles y ventanas
- Las clases del modelo (Restaurante, Diario) son independientes de la interfaz gráfica
- Cada ventana secundaria (VentanaAgregarRestaurante, VentanaMapa) tiene referencia a VentanaPrincipal
- Los listeners permiten la comunicación entre componentes de la interfaz

## Archivo GeneradoUna vez generes la imagen, guárdala con el nombre:
```
ClassDiagram.png
```

y colócala en la carpeta raíz del proyecto junto con el README.md
