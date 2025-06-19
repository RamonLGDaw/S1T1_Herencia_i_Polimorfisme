# nivell_3.exercici_1: Notícies esportives, herència i càlculs

## Enunciat

En una redacció de notícies esportives, les notícies estan classificades per esport:
- Futbol
- Bàsquet
- Tenis
- F1
- Motociclisme

### Informació dels redactors
- Cada redactor té: **nom**, **DNI** (no modificable) i **sou**
- El sou és comú per a tots els redactors: `1500 €`
- En el futur pot augmentar, però sempre serà igual per a tothom
- Un redactor pot tenir assignades múltiples notícies

### Informació de les notícies
- Tota notícia té: **titular**, **text** (buit al crear-se), **puntuació** i **preu**
- Cada tipus de notícia conté informació addicional:

#### Futbol
- competició (`String`)
- club (`String`)
- jugador (`String`)

#### Bàsquet
- competició (`String`)
- club (`String`)

#### Tenis
- competició (`String`)
- jugador (`String`)

#### F1
- escuderia (`String`)

#### Motociclisme
- equip (`String`)

---

## Càlcul del preu (`calcularPreuNoticia()`)

### Futbol
- Preu base: `300 €`
- + `100 €` si és Lliga de Campions
- + `100 €` si és del Barça o Madrid
- + `50 €` si menciona Ferran Torres o Benzema

**Exemple:** notícia sobre un gol de Ferran Torres del Barça a la Lliga de Campions = `550 €`

### Bàsquet
- Preu base: `250 €`
- + `75 €` si és Eurolliga
- + `75 €` si és del Barça o Madrid

### Tenis
- Preu base: `150 €`
- + `100 €` si és Federer, Nadal o Djokovic

### F1
- Preu base: `100 €`
- + `50 €` si és Ferrari o Mercedes

### Motociclisme
- Preu base: `100 €`
- + `50 €` si és Honda o Yamaha

---

## Càlcul de puntuació (`calcularPuntuacio()`)

### Futbol
- Base: `5 punts`
- + `3` si és Lliga de Campions
- + `2` si és Lliga
- + `1` si és del Barça o Madrid
- + `1` si menciona Ferran Torres o Benzema

**Exemple:** notícia sobre Ferran Torres del Barça a la Lliga de Campions = `10 punts`

### Bàsquet
- Base: `4 punts`
- + `3` si és Eurolliga
- + `2` si és ACB
- + `1` si és del Barça o Madrid

### Tenis
- Base: `4 punts`
- + `3` si és Federer, Nadal o Djokovic

### F1
- Base: `4 punts`
- + `2` si és Ferrari o Mercedes

### Motociclisme
- Base: `3 punts`
- + `3` si és Honda o Yamaha

---

## Menú de l’aplicació (`Main`)

1. Introduir redactor
2. Eliminar redactor
3. Introduir notícia a un redactor
4. Eliminar notícia (demana redactor i titular)
5. Mostrar totes les notícies d’un redactor
6. Calcular la **puntuació** d’una notícia
7. Calcular el **preu** d’una notícia
8. Finalitzar programa

---

## Objectius del projecte
- Fer servir **herència** i **polimorfisme**
- Implementar **constructors amb informació específica** segons l’esport
- Utilitzar **mètodes abstractes** per calcular preus i puntuacions
- Aplicar **encapsulació**, constants i col·leccions (`ArrayList`)
