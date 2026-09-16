# 🟣 Enderrite

**Enderrite** ist eine Minecraft Java Edition Mod für **NeoForge**, die das End um neue Inhalte erweitert.

Die Mod fügt ein **neues Erz**, mehrere **neue End-Biome** und verschiedene **neue Strukturen** hinzu. Das Ziel ist, das End abwechslungsreicher zu gestalten und ihm mehr Erkundungsmöglichkeiten zu geben.

> 🚧 **Enderrite befindet sich derzeit in Entwicklung.**

---

## ✨ Features

### 💎 Enderrite-Erz

Enderrite fügt ein neues Erz hinzu, das im End gefunden werden kann.

Geplant bzw. enthalten:

* 💎 Enderrite-Erz
* 🔹 Rohes Enderrite
* 🪙 Enderrite-Barren
* 🛠️ Weitere Verwendungsmöglichkeiten für Enderrite

---

### 🌌 Neue End-Biome

Das End bekommt mehrere neue Biome mit eigenen Landschaften und Besonderheiten.

Geplant sind unter anderem:

* 🌑 Neue Landschaften
* 🌿 Neue End-Pflanzen
* 🪨 Neue Blöcke
* ✨ Neue Umgebungen
* 🌌 Eigene Atmosphären

---

### 🏛️ Neue Strukturen

In den neuen End-Gebieten können verschiedene Strukturen gefunden werden.

Dazu gehören beispielsweise:

* 🏛️ Neue Ruinen
* 🏰 Neue Gebäude
* 🗿 Mysteriöse End-Strukturen
* 💎 Strukturen mit besonderen Ressourcen
* 🌌 Weitere einzigartige Orte

---

## ⚙️ Anforderungen

| Voraussetzung          | Version     |
| ---------------------- | ----------- |
| Minecraft Java Edition | **26.2**    |
| NeoForge               | **26.2.0.25-beta**  |
| Java                   | **Java 25** |

> Die benötigten Versionen können sich während der Entwicklung ändern.

---

## 📦 Installation

1. Installiere **Minecraft Java Edition 26.2**.
2. Installiere die passende **NeoForge-Version**.
3. Lade die aktuelle Enderrite-`.jar` herunter.
4. Öffne deinen Minecraft-Ordner.
5. Öffne den Ordner `mods`.
6. Verschiebe die Enderrite-`.jar` in den `mods`-Ordner.
7. Starte Minecraft über dein NeoForge-Profil.

---

## 🛠️ Entwicklung

Enderrite wird mit **Java**, **Gradle** und **NeoForge** entwickelt.

### Projekt bauen

```bash
gradlew build
```

Die fertige Mod befindet sich anschließend normalerweise unter:

```text
build/libs/
```

### Abhängigkeiten aktualisieren

Falls Probleme mit fehlenden Bibliotheken auftreten:

```bash
gradlew --refresh-dependencies
```

### Projekt bereinigen

```bash
gradlew clean
```

---

## 📁 Projektstruktur

```text
Enderrite/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── code/erikdev/enderrite/
│   │   │       ├── block/
│   │   │       ├── item/
│   │   │       ├── tags/
│   │   │       ├── datagen/
│   │   │       ├── creativemodetab/
│   │   │       ├── worldgen/
│   │   │       └── EnderriteMod.java
│   │   │
│   │   └── resources/
│   │       ├── assets/
│   │       ├── data/
│   │       └── META-INF/
│   │
│   └── generated/
│       └── resources/
│
├── build.gradle
├── gradle.properties
├── gradlew
└── README.md
```

---

## 🗺️ Entwicklungsstatus

| Feature               | Status |
| --------------------- | ------ |
| Mod-Grundstruktur     | ✅      |
| Enderrite-Erz         | ✅      |
| Enderrite-Materialien | ✅      |
| Neue End-Biome        | 🟡      |
| Neue Strukturen       | 🟡      |
| Weltgeneration        | ✅      |
| Eigene Texturen       | ✅      |
| Weitere End-Inhalte   | 🔴      |

**Legende:**

* ✅ Fertig
* 🟡 In Entwicklung
* 🔴 Geplant

---

## 🎯 Ziel der Mod

Das End soll sich nicht mehr nur wie ein einzelner großer Bereich anfühlen.

Mit **Enderrite** soll das End mehr Abwechslung, Erkundung und interessante Orte bekommen.

Neue Biome, Strukturen und Ressourcen sollen das Erkunden des Endes spannender machen, ohne das ursprüngliche Minecraft-Gefühl komplett zu verändern.

---

## 👨‍💻 Entwickler

**Enderrite**
Created by **ErikDev**

Minecraft-Mod für **Minecraft Java Edition + NeoForge**.

---

## ⚠️ Hinweis

Enderrite ist ein **inoffizielles Fan-Projekt** und steht nicht in Verbindung mit Mojang Studios oder Microsoft.

Minecraft ist eine Marke von Mojang Studios/Microsoft.
