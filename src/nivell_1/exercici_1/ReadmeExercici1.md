# nivell_1.exercici_1: Bloc static i bloc d'inicialització

## Enunciat
- **Exercici 1**

  En un grup de música hi ha diferents tipus d’instruments musicals. Hi ha instruments de vent, de corda i de percussió.

  Tots els instruments tenen com a atributs el seu nom, i el seu preu. A més, tenen un mètode anomenat `tocar()`. Aquest és abstracte a la classe `Instrument` i, per tant, s’ha d’implementar a les classes filles.

  - Si s’està tocant un instrument de **vent**: mostrarà _"Està sonant un instrument de vent"_
  - Si és de **corda**: _"Està sonant un instrument de corda"_
  - Si és de **percussió**: _"Està sonant un instrument de percussió"_

  El procés de càrrega d'una classe només té lloc una vegada. Demostra que la càrrega pot ser provocada per:
  - la creació de la primera instància
  - o per l'accés a un membre estàtic

  **Cerca informació sobre blocs d'inicialització i blocs estàtics en Java.**

## Exercici per mostrar que:
- ### Bloc static:
  S'executa només una vegada al carregar la classe a la JVM.
- ### Bloc d'inicialització:
  S'executa cada vegada que es crea una instància de la classe.


## Sortida per consola:
- Això és un bloc static, de la classe Corda, que s'executa un cop al carregar la classe a la JVM
- Això és un bloc d'inicialització, de la classe Corda, que s'executa cada cop que es crea una instància.
- Està sonant un instrument de Corda, en aquest cas, un Stradivarius.
- Això és un bloc d'inicialització, de la classe Corda, que s'executa cada cop que es crea una instància.
- Està sonant un instrument de Corda, en aquest cas, un Fender.
- Això és un bloc d'inicialització, de la classe Corda, que s'executa cada cop que es crea una instància.
- Això és un bloc static, de la classe Percussió, que s'executa un cop al carregar la classe a la jvm
- Això és un bloc d'inicialització, de la classe Percussió, que s'executa cada cop que es crea una instància.

## Valoració del resultat.
* En aquest exemple es pot comprovar que en crear una instància de la classe Corda es carrega la classe
i mostra el missatge del bloc static una sola vegada. Posteriorment, no es torna a mostrar en crear més instàncies
de la classe corda.

* Per altra banda, es pot comprovar que per cada instància que es crea de la classe corda, s'executa
el bloc d'inicialització. Indiferentment de si l'objecte creat s'utilitza o no.

* Finalment, un altre exemple de bloc static. En aquest cas, només en crear una instància de Percussió
s'executa el bloc static

