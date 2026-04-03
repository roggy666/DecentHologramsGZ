# DecentHologramsGZ

Fork of [DecentHolograms](https://github.com/DecentSoftware-eu/DecentHolograms) with added support for Minecraft 26.1 on Paper.

## Changes from upstream

- Added Paper NMS adapter for MC 26.1 (`nms-paper_v26_1`)
- Registered `paper_v26_1` version in `Version.java` for `Platform.PAPER`
- Added `mavenLocal()` and Paper Maven repository to build configuration
- Added Paper plugin repository to `pluginManagement`

## Building

Requires JDK 25 and a locally built [Paper 26.1](https://github.com/PaperMC/Paper) server jar at `../Paper/paper-server/build/libs/`.

1. Clone and build Paper 26.1 first:
   ```
   cd ../Paper
   ./gradlew applyPatches
   ./gradlew createPaperclipJar
   ```
2. Build DecentHolograms:
   ```
   ./gradlew shadowJar
   ```
3. Jar will be at `plugin/build/libs/DecentHolograms-2.9.10.jar`

## Original project

- [SpigotMC](https://www.spigotmc.org/resources/96927/)
- [Discord](https://discord.decentsoftware.eu/)
- [Wiki](https://wiki.decentholograms.eu/)
