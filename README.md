# Tasca S1.01. Herència i Polimorfisme

## Nivell 1

### Exercici 1

En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat `tocar()`. Aquest, és abstracte a la classe `Instrument` i, per tant, s’ha d’implementar a les classes filles. Si s’està tocant un instrument de vent, el mètode ha de mostrar per consola: "Està sonant un instrument de vent", si s’està tocant un instrument de corda: “Està sonant un instrument de corda” i si s’està tocant un instrument de percussió: “Està sonant un instrument de percussió”.

El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per la creació de la primera instància d'aquesta classe o per l'accés a un membre estàtic d'aquesta. 

Cerca informació sobre els blocs d'inicialització i blocs estàtics en Java.

### Exercici 2

Crea una classe "Cotxe" amb els atributs: marca, model i potència. La marca ha de ser estàtic final, el model estàtic i la potència final. Demostra la diferència entre els tres. N’hi ha algun que es pugui inicialitzar al constructor de la classe?

Afegeix dos mètodes a la classe "Cotxe". Un mètode estàtic anomenat `frenar()` i un altre no estàtic anomenat `accelerar()`. El mètode `accelerar` ha de mostrar per consola: “El vehicle està accelerant” i el mètode `frenar()` ha de mostrar: “El vehicle està frenant”.

Demostra com invocar el mètode estàtic i el no estàtic des del `main()` de la classe principal.

## Nivell 2

### Exercici 1

Crea una classe anomenada "Telèfon" amb els atributs marca i model, i el mètode `trucar()`. Aquest mètode ha de rebre un String amb un número de telèfon. El mètode ha de mostrar per consola un missatge dient que s’està trucant al número rebut per paràmetre.

Crea una interfície anomenada "Camera" amb el mètode `fotografiar()`, i una altra interfície anomenada "Rellotge" amb el mètode `alarma()`.

Crea una classe anomenada "Smartphone" que sigui subclasse de "Telèfon" i que a la vegada implementi les interfícies "Camera" i "Rellotge".

El mètode `fotografiar()` ha de mostrar per consola: “S’està fent una foto” i el mètode `alarma()` ha de mostrar: “Està sonant l’alarma”.

Des del `main()` de l’aplicació, crea un objecte Smartphone i crida als mètodes anteriors.

## Nivell 3

### Exercici 1

En una redacció de notícies esportives tenen les notícies classificades per esports: futbol, bàsquet, tenis, F1 i motociclisme.

La redacció pot tenir més d’un redactor, i de cadascun d’ells volem saber el seu nom, el DNI i el sou. Un cop assignat un DNI, aquest no podrà canviar mai. Tots els redactors tenen el mateix sou, i si en un futur l’empresa pot incrementar-lo, ho farà a tothom per igual. De moment el sou ac
