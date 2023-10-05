In Dart, a `Set` is a collection that represents an unordered collection of unique elements. The `HashSet` is one of the implementations of the `Set` interface. Here's how you can use `Set` and `HashSet` in Dart with code samples:

### Using `Set`:

1. **Declaration and Initialization:**

   You can create a `Set` in Dart by using the `Set` constructor or using a set literal. Here's an example of both:

   ```dart
   // Using Set constructor
   Set<String> fruits = Set<String>();

   // Using set literal
   Set<String> colors = {'red', 'green', 'blue'};
   ```

2. **Adding and Removing Elements:**

   You can add elements to a `Set` using the `add` method and remove elements using the `remove` method. Since `Set` contains unique elements, adding a duplicate element won't change the set.

   ```dart
   colors.add('yellow'); // Add an element
   colors.remove('green'); // Remove an element

   print(colors); // Output: {red, blue, yellow}
   ```

3. **Checking for Element Existence:**

   You can check if an element exists in the `Set` using the `contains` method.

   ```dart
   bool containsBlue = colors.contains('blue');
   print('Contains blue: $containsBlue'); // Output: Contains blue: true
   ```

### Using `HashSet`:

1. **Declaration and Initialization:**

   You can use `HashSet` in a similar way as `Set`. It's a class that implements the `Set` interface, so you can declare and initialize it like this:

   ```dart
   import 'dart:collection'; // Import the HashSet class

   // Using HashSet constructor
   HashSet<String> uniqueNames = HashSet<String>();

   // Using set literal
   HashSet<int> uniqueNumbers = HashSet<int>.from([1, 2, 2, 3, 4]);
   ```

2. **Adding and Removing Elements:**

   The methods for adding and removing elements are the same as in `Set`.

   ```dart
   uniqueNames.add('Alice');
   uniqueNames.add('Bob');
   uniqueNames.remove('Bob');

   print(uniqueNames); // Output: {Alice}
   ```

3. **Checking for Element Existence:**

   You can also check for element existence in a `HashSet` using the `contains` method, just like in `Set`.

   ```dart
   bool containsThree = uniqueNumbers.contains(3);
   print('Contains 3: $containsThree'); // Output: Contains 3: true
   ```

Both `Set` and `HashSet` are useful for managing collections of unique elements. You can choose the one that best suits your needs, but in most cases, using `Set` is sufficient. `HashSet` is imported from the `dart:collection` library.



