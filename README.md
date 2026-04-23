# Sorting-Algorithm-Visualizer

A Java Swing application that visualizes a collection of creative sorting algorithms.

## Requirements

* Java JDK 8 or higher

Check installation:

```bash
java -version
javac -version
```

---

## How to Run

1. Compile the program:

```bash
javac SortingVisualizer.java
```

2. Run the program:

```bash
java SortingVisualizer
```

---

## How It Works

* A window will open titled **"The Esoteric Sorter"**
* Select a sorting algorithm from the dropdown
* Click **Run Sort** to start the visualization
* Bars on screen represent values being sorted in real time

---

## Included Algorithms

* Sisyphus
* Capitalism
* Communism
* Assassin
* Introvert
* Midlife Crisis
* Bureaucracy
* Phil Collins

---

## Notes

* Each run generates a new random dataset
* Sorting runs on a background thread so the UI stays responsive
* Some algorithms are intentionally slow or unconventional for visual effect

---

## Optional: Create a JAR

```bash
jar cfe SortingVisualizer.jar SortingVisualizer *.class
```

Run it:

```bash
java -jar SortingVisualizer.jar
```

