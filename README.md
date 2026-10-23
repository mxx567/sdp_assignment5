# Text Processor — Strategy Pattern

A simple Java application that transforms text using interchangeable strategies: lowercase, uppercase, and removal of all whitespace. `TextProcessor` delegates processing to a `TextStrategy`, which can be changed at runtime.

## Project structure

All Java files are in `src/`:

- `Main.java` — demonstrates switching between strategies.
- `TextStrategy.java` — common interface with `format(String text)`.
- `TextProcessor.java` — stores and uses the selected strategy.
- `LowerCaseStrategy.java`, `UpperCaseStrategy.java`, `RemoveSpacesStrategy.java` — concrete strategies.

## Build and run

Install a Java JDK and run these commands from the project root:

```sh
mkdir out
javac -d out src/*.java
java -cp out Main
```

Expected output:

```text
hola mundo
HOLA MUNDO
HOLAMUNDO
```

## Add a new strategy

Create a class in `src/` that implements `TextStrategy`:

```java
public class ReverseStrategy implements TextStrategy {
    @Override
    public String format(String text) {
        return new StringBuilder(text).reverse().toString();
    }
}
```

Select it in `Main`, then rebuild and run:

```java
tp.setTextStrategy(new ReverseStrategy());
System.out.println(tp.ProcessString("Hello")); // olleH
```

No changes to `TextProcessor` are required.
