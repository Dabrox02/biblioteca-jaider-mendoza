# BIBLIOTECA 

Se dieron los parametros para un sistema de Gestion para Bibliotecas, en este se debian utilizar los principios de diseño **SOLID**.

De modo que, se utilizo el principio de **SEGREGACION DE DEPENDENCIAS** para la manipulacion de recursos de la biblioteca usando las interfaces **GestorEscrituraRecursos** y **GestorLecturaRecursos** que implementaban los siguiente metodos:

- **GestorEscrituraRecursos**
  - agregarRecurso
  - prestarRecurso

- **GestorLecturaRecursos**
  - listarRecurso
  - buscarRecursoPorTitulo
  - idRecursoValido

La clase **Biblioteca** implemento las interfaces. 

Se utilizo Herencia para crear los recursos los cuales eran **Revista** y **Libro**.

Se puede observar en el siguiente diagrama UML.

![](BibliotecaJaiderMendozaUML.PNG)

## HERRAMIENTAS
- StarUML
- Visual Studio Code
