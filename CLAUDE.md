# CLAUDE.md

This file provides guidance to Claude Code (claude.ai/code) when working with code in this repository.

## Build & Run

Compile from the source root:
```bash
cd src/main/java
javac org/example/*.java
java org.example.Main
```

## Code Style

Use comments sparingly. Only comment complex code.

## Architecture

Minimal Java project with no build tool. All source files live in `src/main/java/org/example/` under the `org.example` package. `Main.java` is the entry point.