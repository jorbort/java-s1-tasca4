# java-s1-task4 lvl1
Task 4 of the first sprint of the Java bootcamp - Testing with JUnit

## Level 1: JUnit

### Exercise 1
Create a Java class that manages a collection of books in a library. The class should allow adding books, retrieving the list of books, getting a specific book by its position, adding a book at a specific position, and removing a book by title.

Implement the following functionalities:

- The class should allow adding books to the collection.
- It should be possible to retrieve the complete list of books.
- It should be possible to get the title of a book given a position.
- It should be possible to add a book at a specific position.
- It should be possible to remove a book by title.

Verify its correct functionality with JUnit:

- Verify that the list of books is not null after creating a new object.
- Confirm that the list has the expected size after inserting several books.
- Ensure that the list contains a specific book in its correct position.
- Verify that there are no duplicate book titles in the list.
- Check that it is possible to retrieve the title of a book given a specific position.
- Ensure that adding a book correctly modifies the list.
- Confirm that removing a book decreases the size of the list.
- Verify that the list remains alphabetically ordered after adding or removing a book.

### Exercise 2
Create a class called `DniCalculator` that calculates the letter of the DNI when receiving the number as a parameter.
Create a JUnit class that verifies its correct functionality, parameterizing it so that the test receives a wide range of data and validates if the calculation is correct for 10 predefined DNI numbers.

### Exercise 3
Create a class with a method that throws an `ArrayIndexOutOfBoundsException`.
Verify its correct functionality with a JUnit test.