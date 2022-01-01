# kotlin-format
A drop-in replacement for Java String.format() in Kotlin (JVM, Native, JS)

There is currently no native Kotlin analog of String.format(). On JVM Kotlin standard library relies on Java implementation, therefore it is cannot be used while building for Native or JS targets.

The code is a pure Kotlin implementation adapted from [Apache Harmony project](http://harmony.apache.org/) by removing all Java dependencies. 

## Usage

``` implementation 'com.github.Simplx-dev:kotlin-format:1.2'```

```kotlin
val formatted = KotlinFormatter.format("Adding row %1$d to row %2$d", 2, 3)
```

## Limitations

Currnetly supports only a small subset of String.format() features.
