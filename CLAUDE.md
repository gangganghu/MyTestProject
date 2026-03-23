# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run

Compile and run from the project root:
```bash
javac -d out src/main/java/org/example/*.java
java -cp out org.example.Main
```

## Code Style

Use comments sparingly. Only comment complex code.

## Architecture

Minimal Java project with no build tool. All source files live in `src/main/java/org/example/` under the `org.example` package. `Main.java` is the entry point.