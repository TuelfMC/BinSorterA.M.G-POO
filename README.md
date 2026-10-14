# BinSorter A.M.G.

Herramienta de campus sostenibles para instituciones de educación superior (ODS 4 y 11).
Proyecto de Programación Orientada a Objetos desarrollado en Java con interfaz JavaFX.

## Requisitos (una sola vez)

1. **JDK 21 o superior** (el JDK completo, no solo el JRE). Compruébalo con:
```
   javac -version
```
2. **Maven**:
   - Descarga el *Binary zip archive* desde https://maven.apache.org/download.cgi
   - Descomprímelo en una ruta corta, por ejemplo `C:\maven`
   - Agrega la carpeta `bin` de Maven al **PATH** de Windows
   - Cierra y abre VS Code, y comprueba con:
```
   mvn -version
```

## Obtener el proyecto

- **Primera vez**: `git clone https://github.com/TuelfMC/BinSorterA.M.G-POO.git` y abrir la carpeta en VS Code (File → Open Folder).
- **Cada día, antes de trabajar**: `git pull`

Los comandos de Git y Maven se ejecutan en la terminal de VS Code (`Ctrl + ñ` o `` Ctrl + ` ``), con la carpeta del proyecto abierta.

## Ejecutar la aplicación

```
mvn javafx:run
```

La primera vez descarga JavaFX y puede tardar un poco.

## Estructura del proyecto

- `src/main/java/binsorter/modelo`: clases de datos y lógica (`Usuario`, `Residuo`, ...)
- `src/main/java/binsorter/vista`: pantallas de la interfaz
- `src/main/java/binsorter/controlador`: conecta las pantallas con el modelo
- `src/main/resources`: archivos `.fxml`, `.css` e imágenes
- `docs`: diagrama y documentación

## Reglas del equipo

1. `git pull` **antes** de empezar a trabajar.
2. Antes de cada `git push`, ejecutar `mvn compile`. Si no dice **BUILD SUCCESS**, no se sube.
3. Las clases se nombran con mayúscula inicial (`Usuario`, no `usuario`).
4. Cada quien edita sus propios archivos; si necesitas tocar el de otra persona, avísale antes.