# Java Tech Challenge
## 2024/03/14


Implementare un metodo
```
public Map<String, Object> sumObjects(List<Object> input);
```
L'unico parametro è una lista di oggetti (di tipo `Object`). Gli elementi della lista ammissibili sono:  
  - numeri interi (`int` o `Integer`)  
  - numeri decimale (`double` o `Double`)  
  - stringhe (`String`) contenenti solo numeri, quindi convertibili in `Integer`  
  - liste di oggetti (`List<Object`), i cui elementi soddisfano gli stessi requisiti degli elementi dell'input (sono interi, decimali, stringhe o liste di oggetti). tali liste possono anche essere vuote.  
  - Si può supporre che non vi siano elementi nulli o di altri tipi, oppure si può ignorare tali oggetti se l'input ne contiene. Tale comportamento non verrà testato.  

L'output è una mappa con possibili chiavi le stringhe "Integer", "Double", "String", e con le seguenti associazioni:  
  - "Integer" -> un `Integer` contenente la somma di tutti gli interi contenuti nella struttura di input  
  - "Double" -> un `Double` contenente la somma di tutti i numeri decimali contenuti nella struttura di input
  - "String" -> una stringa (`String`) contenente la somma di tutti i valori interi rappresentati dalle stringhe contenute nella struttura di input
  - se nell'input non sono presenti valori di qualcuno dei tre tipi, l'associazione per le rispettive chiavi possono essere assenti dall'output, oppure il valore 0 può essere associato d'ufficio
  - le somme si intendono estese agli elementi facenti parte delle eventuali liste innestate, le sottoliste, le sotto-sottoliste e così via, almeno (ma non necessariamente solo) fino al quarto livello di innestamento.  

Esempio:
```
private static final List<Object> input =
  Arrays.asList(
    "1",
    2.,
    3,
    Arrays.asList(
      Arrays.asList(
        "4",
        5.,
        6,
        Arrays.asList()
      ),
      "7",
      Arrays.asList(
        8.,
        9
      )
    )
  );

private static final Map<String, Object> output = new HashMap<>();
static {
    output.put("Double", 15.);
    output.put("Integer", 18);
    output.put("String", "12");
}
```

C'è una classe di test (`org.example.JavaChallengeTest`) che è stata predisposta con uno unit test utile a testare la soluzione che si è implementata.
Bisogna solo implementare la bozza di metodo che si trova in fondo.
