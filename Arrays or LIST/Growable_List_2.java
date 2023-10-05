In Dart, you can work with growable lists (arrays) using the `List` class. Here's how to declare, insert, update, delete, and iterate over a growable list in Dart:

1. **Declaration:**

   You can declare a growable list in Dart in multiple ways. Two common ways are:

   ```dart
   // 1. Declaration with an empty list
   List<int> numbers = List();

   // 2. Declaration with an initial list of values
   List<int> numbers = [1, 2, 3];
   ```

   Both of these declarations create a growable list of integers.

2. **Insertion:**

   You can add elements to the end of the list using the `add` method:

   ```dart
   numbers.add(45);
   ```

   After this, the `numbers` list will contain `[1, 2, 3, 45]`.

3. **Update:**

   To update an element at a specific index, you can simply assign a new value to that index:

   ```dart
   numbers[0] = 99;
   ```

   This will change the first element to `99`, resulting in `[99, 2, 3, 45]`.

4. **Deletion:**

   To delete an element, you can set its value to `null` or use the `remove` method to remove an element by its value:

   ```dart
   numbers[0] = null; // Set the first element to null
   // OR
   numbers.remove(2); // Remove the element with the value 2
   ```

   The first approach sets the element to `null`, and the second approach removes the element with the value `2`.

5. **Methods for Manipulation:**

   Some common methods available for manipulating growable lists include:
   
   - `add(element)`: Add an element to the end of the list.
   - `addAll(elements)`: Add all elements from an iterable to the list.
   - `remove(element)`: Remove the first occurrence of an element from the list.
   - `removeAt(index)`: Remove the element at a specific index.
   - `clear()`: Remove all elements from the list.

6. **Iteration:**

   You can iterate over a growable list in Dart using various methods. Here are two common ways:

   - **For-in Loop:**

     ```dart
     for (var number in numbers) {
       print(number);
     }
     ```

   - **forEach() Method:**

     ```dart
     numbers.forEach((number) {
       print(number);
     });
     ```

   Both of these methods allow you to iterate over the elements of the `numbers` list and perform operations on each element.

These are the basic operations for working with growable lists (arrays) in Dart. You can use them to manage and manipulate lists of data in your Dart programs.
