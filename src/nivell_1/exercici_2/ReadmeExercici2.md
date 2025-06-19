# nivell_1.exercici_2: `static final`, `static`, `final`

## Enunciat

Crea una classe `Cotxe` amb els atributs: `marca`, `model` i `potència`.

- La **marca** ha de ser `static final`
- El **model** ha de ser `static`
- La **potència** ha de ser `final`

Demostra la diferència entre els tres.  
**N’hi ha algun que es pugui inicialitzar al constructor de la classe?**

Afegeix dos mètodes a la classe `Cotxe`:
- Un mètode **estàtic** anomenat `frenar()` → mostra: _"El vehicle està frenant"_
- Un mètode **no estàtic** anomenat `accelerar()` → mostra: _"El vehicle està accelerant"_

Demostra com invocar el mètode estàtic i el no estàtic des del `main()` de la classe principal.

---

## Resposta

Sí, n'hi ha dos:

- **`private static String model`**  
  És un atribut compartit per totes les instàncies de la classe.  
  Es pot inicialitzar dins del constructor, però el seu valor serà compartit:  
  sempre tindrà el valor assignat a **l’última instància creada**.

- **`private final double potencia`**  
  És un atribut constant per a cada instància.  
  Pot ser inicialitzat al constructor, però **només una vegada**.  
  Un cop assignat, **ja no es pot modificar**.