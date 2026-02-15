# Parte Teórica

### 1. ¿Qué es un repositorio en Git y cómo se diferencia de un proyecto “normal”?

Un repositorio Git es una carpeta de proyecto rastreada por el sistema de control de versiones Git, que almacena todos los archivos junto con su historial completo de cambios, confirmaciones (commits) y ramas. A diferencia de una carpeta "normal", un repositorio Git incluye una carpeta oculta .git que gestiona las versiones y facilita la colaboración.

### 2. ¿Cuáles son las tres áreas principales de Git (working directory, staging area/index y repository) y qué papel cumple cada una?

Working Directory (Directorio de trabajo)
Donde editas los archivos.

Staging Area (Index)
Área intermedia donde preparas los cambios con git add.

Repository (Repositorio)
Donde se guardan los commits de forma permanente.

### 3. ¿Cómo representa Git los cambios internamente? (objetos blob, tree, commit y tag).

Git guarda todo como objetos:
Blob → Contenido de un archivo

Tree → Estructura de directorios

Commit → Foto del proyecto en un momento dado

Tag → Marca específica sobre un commit

### 4. ¿Cómo se crea un commit y qué información almacena un objeto commit?

Se crea con:

git add archivo.java
git commit -m "Mensaje descriptivo"

Un commit almacena:
Autor
Fecha
Mensaje
Referencia al commit anterior
Snapshot del proyecto

### 5. ¿Cuál es la diferencia entre git pull y git fetch?

git fetch → Descarga cambios del remoto pero no los integra.

git pull → Descarga y además hace merge automáticamente.

### 6. ¿Qué es un branch (rama) en Git y cómo Git gestiona los punteros a commits?

Una rama (branch) es un puntero a un commit.

Git maneja ramas como referencias móviles que apuntan al último commit de esa línea de trabajo.

### 7. ¿Cómo se realiza un merge y qué conflictos pueden surgir? ¿Cómo se resuelven?

Se hace:
git merge nombre-rama

Conflictos ocurren cuando:
Dos ramas modifican la misma línea de un archivo.

Se resuelven:
Editando manualmente el archivo
Eliminando los marcadores de conflicto
Haciendo un nuevo commit

### 8. ¿Cómo funciona el área de staging (git add) y qué pasa si omito este paso?

git add pasa cambios al staging area.

Si lo omites:
El archivo no se incluirá en el commit.

### 9. ¿Qué es el archivo .gitignore y cómo influye en el seguimiento de archivos?

Archivo que indica qué archivos no deben ser rastreados.

Ejemplo:
*.class
node_modules/
.env

### 10. ¿Cuál es la diferencia entre un “commit amend” (--amend) y un nuevo commit?

git commit --amend → Modifica el último commit.

Nuevo commit → Crea uno adicional en el historial.

--amend reescribe historial.

### 11. ¿Cómo se utiliza git stash y en qué escenarios es útil?

Guarda cambios temporales sin hacer commit.

Uso típico:
Necesitas cambiar de rama pero tienes cambios sin guardar.

Comandos:
git stash
git stash pop

### 12. ¿Qué mecanismos ofrece Git para deshacer cambios (por ejemplo, git reset, git revert, git checkout)?

git reset → Mueve el puntero HEAD.
git revert → Crea un commit que deshace otro.
git checkout → Cambia de rama o restaura archivos.

### 13. ¿Cómo funciona la configuración de remotos (origin, upstream) y qué comandos uso para gestión de forks?

origin → Tu repositorio remoto principal.

upstream → Repositorio original (en forks).

Comandos útiles:
git remote add upstream URL
git fetch upstream
git merge upstream/main

Muy común en forks hechos en GitHub.

### 14. ¿Cómo puedo inspeccionar el historial de commits (por ejemplo, git log, git diff, git show)?

git log → Historial de commits

git diff → Diferencias entre versiones

git show → Detalles de un commit

git log --oneline --graph → Historial visual resumido