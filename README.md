# Java Tech Challenge
## 2024/03/14


implementare un metodo
```
public Map<String, Object> sumObjects(List<Object> list);
```
che ha come unico parametro una lista di `Object`. Gli elementi della lista ammissibili sono:  
  - numeri interi (`int` o `Integer`)  
  - numberi decimale (`double` o `Double`)  
  - stringhe (`String`) contenenti solo numeri, quindi convertibili in `Integer`  
  - liste di oggetti (`List<Object`), i cui elementi soddisfano gli stessi requisiti degli elementi dell'input (sono interi, decimali, stringhe o liste di oggetti). tali liste possono anche essere vuote.  
  - puoi supporre che non vi siano elementi nulli o di altri tipi, oppure puoi ignorare tali oggetti se l'input ne contiene. Tale comportamento non verrà testato.  

l'output è una mappa con possibili chiavi le stringhe "Integer", "Double", "String", e con le seguenti associazioni:  
  - "Integer" -> un `Integer` contenente la somma di tutti gli interi contenuti nella struttura di input  
  - "Double" -> un `Double` contenente la somma di tutti i numeri decimali contenuti nella struttura di input
  - "String" -> una stringa (`String`) contenente la somma di tutti i valori interi rappresentati dalle stringhe contenute nella struttura di input
  - se nell'input non sono presenti valori di qualcuno dei tre tipi, l'associazione per le rispettive chiavi possono essere assenti dall'output, oppure il valore 0 può essere associato d'ufficio
  - le somme si intendono estese agli elementi facenti parte delle eventuali liste innestate, le sottoliste, le sotto-sottoliste e così via, almeno (ma non necessariamente solo) fino al quarto livello di innestamento.  

esempio:
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

private static final Map<String, Object> output =
  Map.of(
    "Double", 15.,
    "Integer", 18,
    "String", "12"
  );
```

Dai un occhio alla classe di test `org.example.JavaChallengeTest`, predisposta per te.  
Dovrai solo implementare la bozza di metodo che trovi in fondo.
