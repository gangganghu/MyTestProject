# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run

This project uses Maven with Java 21.

```bash
mvn compile          # compile
mvn exec:java -Dexec.mainClass="org.example.Main"  # run
mvn package          # build JAR
```

## Code Style

Use comments sparingly. Only comment complex code.

## Architecture

Maven project (`org.example` package, Java 21). `Main.java` is the entry point; it delegates to static methods on other classes (e.g. `Cat`). All source files live in `src/main/java/org/example/`.