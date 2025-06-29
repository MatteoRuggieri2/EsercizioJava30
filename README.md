# OutputStream

## FileOutputStreamByte

L'obiettivo di questo esercizio è l'utilizzo della classe **OutputStream**.

Creare la classe `FileOutputStreamByte` con all'interno il metodo `main()` dove istanzieremo la classe e lanceremo i metodi `run()` con le operazioni di scrittura.
Questo esercizio non richiede test JUnit.

> **Nota:** Definire una stringa con il testo da scrivere sul file e trasformarla in un array di bytes `byte[]`.

```java
class FileOutputStreamByte {

    public static void main(String[] args) {}

    private void run1() {}

    private void run2() {}
}
```

### Output

**File byte per byte**
Scrivere la stringa, un byte alla volta, all'interno del file `datawrite1.txt` utilizzando il metodo `run1()`.

**File in una singola soluzione**
Scrivere la stringa tutta in una volta, all'interno del file `datawrite2.txt` utilizzando il metodo `run2()`.


### Consigli

**Istanzia così il _FileOutputStream_**
`OutputStream os1 = new FileOutputStream("datawrite1.txt");`

**Scrittura con un byte alla volta**
Esegui questo metodo una volta per ogni byte dell'array per stampare l'intera stringa.
`os1.write(byte b);`

**Scrittura in una singola soluzione**
Esegui questo metodo una sola volta con tutto l'array per stampare l'intera stringa.
`os1.write(byte[] arr);`

## Files

**datawrite1.txt**
**datawrite2.txt**
