# Practica01

- Autor: Galicia Rosas Emanuel Tonahuayoltzin
- Introduccion a ciencias de la computacion
- Profesor: Salvador López Mendoza
- Ayudante: Yanahı́ Demerio Torres
- Ayudante de Laboratorio: Rosa Victoria Villa Padilla

Fecha de entrega: 9 de octubre de 2026

Se elaboraron dos programas en java con la finalidad de familiarizarnos con los conceptos viston en clase, como la creacion de objetos y el uso de metodos.

## Estructura del Proyecto
``` shell
.
├── EGalicia
│   └── practica01
│       └── src
│           └── icc
│               ├── Psicologo.java
│               ├── RFC.class
│               └── RFC.java
└── README.md
```

## Primer programa: Psicólogo.java
Programa que simula la interaccion de un paciente durante una sesión con un psicólogo.

### Caracteristicas:
1. El programa al ser ejecutado da la bienvenida y solicita el nombre del paciente.
2. Obtiene y guarda el nombre del paciente.
3. Saluda al paciente por su nombre y pregunta su problema.
4. Obtiene su respuesta en la siguiente linea y pregunta la razon de su problema.
5. Vuelve a obtener una respuesta, hace un comentario y termina la sesión.
### Compilar y ejecutar el programa:
- Compilar: `javac Psicologo.java`
- Ejecutar: `java Psicologo`

## Demo:
```shell
elTonal@think:~/CS/ICC/Practica1/EGalicia/practica01/src/icc$ javac Psicologo.java 
elTonal@think:~/CS/ICC/Practica1/EGalicia/practica01/src/icc$ java Psicologo
Bienvenido, cual es su nombre?
Emanuel
Buenas tardes Emanuel
Digame, cuál es su problema en la vida?
voy a reprobar algebra
MMM... ya veo
Y digame...
Por qué dice "voy a reprobar algebra"
no entiendo las clases
Muy interesante!! Hablaremos de ello con más detalle en la siguiente sesión.
```

## Segundo programa: RFC.java
Programa que simula generar una clave al estilo del RFC de una persona.
### Caracteristicas:
1. El programa solicita al usuario su nombre completo en una nueva linea.
2. El programa solicita al usuario su fecha de nacimiento en el formato dd/mm/aa.
3. Guarda los datos nombre y fecha de nacimineto.
4. Mediante subStrings extrae la inicial del nombre.
5. Extrae las dos primeras letras del apellido parterno.
6. Extrae la inicial del apellido materno.
7. Manipula la fecha de nacimiento para extraer, año, mes y dia.
8. Agrega todos estos datos al rfc.

### Compilar y ejecutar:
- Compilar: `javac RFC.java`
- Ejecutar: `java RFC`
### Demo

``` shell
elTonal@think:~/CS/ICC/Practica1/EGalicia/practica01/src/icc$ javac RFC.java 
elTonal@think:~/CS/ICC/Practica1/EGalicia/practica01/src/icc$ java RFC
Dame el nombre completo (Empezando con nombre, apellido paterno y materno)
Emanuel Galicia Rosas
Ingresa la fecha de nacimiento en formato dd/mm/aa
11/09/08
El RFC de Andrea Lopez es: GARE080911
```
