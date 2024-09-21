# Documentación del Proyecto: Evaluador de Palíndromos en Java

## **Índice**
1. [Introducción](#introducción)
2. [Descripción General](#descripción-general)
3. [Requisitos](#requisitos)
4. [Instalación](#instalación)
5. [Uso](#uso)
6. [Estructura del Código](#estructura-del-código)
   - [Importaciones](#importaciones)
   - [Clase Principal](#clase-principal)
   - [Inicialización de Recursos](#inicialización-de-recursos)
   - [Flujo del Programa](#flujo-del-programa)
   - [Manejo de Excepciones](#manejo-de-excepciones)
7. [Ejemplos de Ejecución](#ejemplos-de-ejecución)
8. [Manejo de Errores](#manejo-de-errores)

---

## **Introducción**

El **Evaluador de Palíndromos en Java** es una aplicación de consola diseñada para permitir a los usuarios ingresar palabras y determinar si dichas palabras son palíndromos. Un palíndromo es una palabra que se lee igual de izquierda a derecha que de derecha a izquierda, como "anilina" o "reconocer". Este proyecto sirve como una herramienta educativa para practicar conceptos fundamentales de programación en Java, tales como manejo de entradas/salidas, manipulación de cadenas y manejo de excepciones.

---

## **Descripción General**

Este proyecto consiste en una única clase Java que interactúa con el usuario a través de la consola. El programa solicita al usuario que ingrese palabras y evalúa si son palíndromos. Después de cada evaluación, el usuario puede optar por continuar evaluando más palabras o salir del programa.

---

## **Requisitos**

- **Lenguaje de Programación**: Java (JDK 8 o superior)
- **Entorno de Desarrollo**: Cualquier IDE compatible con Java (Eclipse, IntelliJ IDEA, NetBeans) o un editor de texto junto con la terminal.
- **Sistema Operativo**: Compatible con cualquier sistema operativo que soporte Java (Windows, macOS, Linux).

---

## **Instalación**

1. **Descargar e Instalar Java:**
   - Asegúrate de tener Java Development Kit (JDK) instalado. Puedes descargarlo desde [Oracle](https://www.oracle.com/java/technologies/javase-jdk11-downloads.html) o usar una distribución OpenJDK.

2. **Configurar el Entorno:**
   - Configura las variables de entorno (`JAVA_HOME` y `PATH`) según las instrucciones de tu sistema operativo.

3. **Obtener el Código Fuente:**
   - Clona el repositorio o descarga el archivo `Main.java` que contiene el código fuente del proyecto.

---

## **Uso**

1. **Compilar el Programa:**
   - Navega al directorio donde se encuentra el archivo `Main.java` y compílalo utilizando el siguiente comando:

     ```bash
     javac Main.java
     ```

2. **Ejecutar el Programa:**
   - Una vez compilado, ejecuta el programa con:

     ```bash
     java Main
     ```

3. **Interacción con el Usuario:**
   - El programa te solicitará si deseas continuar evaluando palabras.
   - Ingresa `y` para continuar o `n` para salir.
   - Si eliges continuar, se te pedirá que ingreses una palabra para evaluar si es un palíndromo.
   - El programa mostrará el resultado y volverá a preguntar si deseas evaluar otra palabra.

---

## **Estructura del Código**

### **Importaciones**

```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
```

- **`BufferedReader`**: Facilita la lectura eficiente de caracteres de la entrada estándar.
- **`IOException`**: Maneja excepciones que puedan ocurrir durante las operaciones de entrada/salida.
- **`InputStreamReader`**: Convierte una secuencia de bytes (entrada estándar) en una secuencia de caracteres.

### **Clase Principal**

```java
public class Main {
    public static void main(String[] args) {
        // Código principal
    }
}
```

- **`public class Main`**: Define la clase principal del programa.
- **`public static void main(String[] args)`**: Método de entrada del programa donde se ejecuta la lógica principal.

### **Inicialización de Recursos**

```java
BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
String opc = "";
```

- **`BufferedReader reader`**: Instancia para leer la entrada del usuario desde la consola.
- **`String opc`**: Variable para almacenar la opción del usuario (`"y"` para continuar, `"n"` para salir).

### **Flujo del Programa**

```java
try {
    while(!opc.equalsIgnoreCase("n")){
        System.out.println("Do you Want to continue y/n");
        opc = reader.readLine();

        if(opc.equalsIgnoreCase("n")){
            System.out.println("Exiting program");
            break;
        }

        System.out.println("Evaluate the word: ");
        String wordToEvaluate = reader.readLine();

        String lowerCaseWord = wordToEvaluate.toLowerCase();
        String reversedWord = new StringBuilder(lowerCaseWord).reverse().toString();

        if(reversedWord.equals(lowerCaseWord)){
            System.out.println("It's a palindrome \n");
        } else{
            System.out.println("It's not a palindrome \n");
        }
    }
} catch (IOException e) {
    System.out.println("An error occurred while reading input: " + e.getMessage());
}
```

1. **Bucle Principal (`while`):**
   - Continúa ejecutándose hasta que el usuario ingrese `"n"`.
   
2. **Solicitud de Continuación:**
   - Pide al usuario si desea continuar (`"y"`) o salir (`"n"`).
   - Lee la respuesta del usuario.

3. **Verificación de Salida:**
   - Si el usuario ingresa `"n"`, muestra un mensaje de salida y rompe el bucle.

4. **Evaluación de la Palabra:**
   - Solicita al usuario que ingrese una palabra para evaluar.
   - Convierte la palabra a minúsculas para una comparación uniforme.
   - Invierte la palabra utilizando `StringBuilder`.
   - Compara la palabra invertida con la original en minúsculas.
   - Informa al usuario si la palabra es un palíndromo o no.

### **Manejo de Excepciones**

```java
catch (IOException e) {
    System.out.println("An error occurred while reading input: " + e.getMessage());
}
```

- Captura cualquier excepción de tipo `IOException` que pueda ocurrir durante la lectura de la entrada del usuario.
- Muestra un mensaje de error detallando el problema.

---

## **Ejemplos de Ejecución**

### **Caso 1: Palíndromo**

```
Do you Want to continue y/n
y
Evaluate the word: 
Anilina
It's a palindrome 

Do you Want to continue y/n
n
Exiting program
```

### **Caso 2: No es Palíndromo**

```
Do you Want to continue y/n
y
Evaluate the word: 
Hola
It's not a palindrome 

Do you Want to continue y/n
n
Exiting program
```

---

## **Manejo de Errores**

El programa maneja posibles errores relacionados con la entrada/salida mediante un bloque `try-catch`. Si ocurre una excepción `IOException` durante la lectura de la entrada del usuario, el programa captura la excepción y muestra un mensaje de error con detalles específicos. Esto asegura que el programa no termine abruptamente y proporciona información útil al usuario sobre lo que salió mal.

---
