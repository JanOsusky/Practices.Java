# Practices.Java
Practices in Erasmus semester at UMA. Readme of the second displayed one, most of the practices were lost.
# Libreria

This repository contains Java code for a simple library management system. The code includes classes such as `Libreria`, `LibreriaOferta`, `Libro`, and `LibroOferta`, which provide functionality for managing books in a library.

## Libreria

The `Libreria` class represents a library and provides methods for adding and removing books, as well as calculating the final price of a book. It uses an `ArrayList` to store the books. The `addLibro` method adds a new book to the library, while the `remLibro` method removes a book based on the author and title. The `getPrecioFinal` method calculates the final price of a book based on its author and title.

## LibreriaOferta

The `LibreriaOferta` class extends the `Libreria` class and adds additional functionality for managing books on sale. It includes a discount percentage and an array of authors on sale. The `addLibro` method in this class allows adding books with specific authors to the library.

## Libro

The `Libro` class represents a book and stores information such as the author, title, and base price. It also includes a static field `porcIVA` to store the percentage of the sales tax. The `getPrecioFinal` method calculates the final price of the book, taking into account the base price and the sales tax.

## LibroOferta

The `LibroOferta` class extends the `Libro` class and adds additional functionality for managing discounted books. It includes a discount percentage and overrides the `getBaseImponible` method to calculate the base price with the discount applied.

## PruebaLibreria

The `PruebaLibreria` class is a test class that demonstrates the usage of the library management system. It creates a `Libreria` object, adds several books to it, removes some books, and calculates the final prices of certain books.

## How to Run

To run the code, compile the Java files and run the `PruebaLibreria` class.

```bash
javac libreria/*.java
java libreria.PruebaLibreria
