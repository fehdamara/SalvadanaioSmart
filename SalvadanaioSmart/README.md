# SalvadanaioSmart

**SalvadanaioSmart** è un'applicazione Java SE per la gestione di un salvadanaio digitale, pensata per monitorare le tue entrate, uscite e budget in modo sicuro, manutenibile e ben architettato.

---

## Funzionalità principali

- Aggiunta e visualizzazione di movimenti (entrate/uscite)
- Categorie di spesa (Composite Pattern)
- Budget configurabile con notifica in caso di superamento
- Persistenza dei dati su file
- Interfaccia utente via console

---

## Design Patterns implementati

| Pattern                   | Descrizione                                               |
| ------------------------- | --------------------------------------------------------- |
| **Factory**               | Crea oggetti `Entrata` e `Uscita` da parametri testuali   |
| **Composite**             | Gestione di categorie annidate con movimenti multipli     |
| **Iterator**              | Iterazione sui movimenti e categorie                      |
| **Exception Shielding**   | Gestione sicura delle eccezioni senza mostrare stacktrace |
| **Observer** _(avanzato)_ | Notifica automatica quando il budget viene superato       |

---

## Tecnologie usate

| Tecnologia                      | Utilizzo                            |
| ------------------------------- | ----------------------------------- |
| **Java Collections & Generics** | Liste, filtri, gestione movimenti   |
| **Java I/O**                    | Lettura/scrittura dei file          |
| **Logging (java.util.logging)** | Registrazione eventi, errori, debug |
| **JUnit 5**                     | Test unitari su logica di business  |
| **Stream API** _(avanzato)_     | Filtri e aggregazioni dei movimenti |

---

## Sicurezza

- Input sanitizzato (tipi, conversioni, limiti)
- Eccezioni gestite senza leak
- Nessuna credenziale hardcoded
- Logging controllato
- Nessun crash su input invalido

---

## Esecuzione

### Requisiti

- Java 17 o superiore
- Gradle (oppure usare `./gradlew`)

### Compilazione ed esecuzione

```bash
./gradlew build
java -jar build/libs/SalvadanaioSmart.jar
```
