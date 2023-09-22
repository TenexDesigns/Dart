In Dart, higher-order functions are functions that can accept other functions as arguments or return functions as results. They are a fundamental concept in functional programming and can be used to write clean and expressive code. Lambda expressions (anonymous functions) are often used in conjunction with higher-order functions. Here are some examples of higher-order functions and lambda expressions in Dart:

### Example 1: `forEach` Higher-Order Function

The `forEach` function is used to iterate over a list and perform an action for each element. You can pass a lambda expression as an argument to `forEach` to define the action to be performed.

```dart
void main() {
  List<int> numbers = [1, 2, 3, 4, 5];

  // Using forEach with a lambda expression
  numbers.forEach((number) {
    print(number * 2); // Output: 2 4 6 8 10
  });
}
```

### Example 2: `map` Higher-Order Function

The `map` function is used to transform each element of a list and return a new list with the transformed values. You can pass a lambda expression to `map` to specify how each element should be transformed.

```dart
void main() {
  List<int> numbers = [1, 2, 3, 4, 5];

  // Using map with a lambda expression to double each number
  var doubledNumbers = numbers.map((number) => number * 2);
  print(doubledNumbers); // Output: (2, 4, 6, 8, 10)
}
```

### Example 3: `where` Higher-Order Function

The `where` function is used to filter elements in a list based on a condition defined by a lambda expression.

```dart
void main() {
  List<int> numbers = [1, 2, 3, 4, 5];

  // Using where with a lambda expression to filter even numbers
  var evenNumbers = numbers.where((number) => number % 2 == 0);
  print(evenNumbers); // Output: (2, 4)
}
```

### Example 4: Custom Higher-Order Function

You can define your own higher-order functions that accept other functions as arguments. Here's an example of a custom higher-order function called `executeFunction`:

```dart
void executeFunction(int times, Function action) {
  for (int i = 0; i < times; i++) {
    action();
  }
}

void main() {
  // Using a custom higher-order function with a lambda expression
  executeFunction(3, () {
    print("Hello, World!"); // Output: Hello, World! (printed 3 times)
  });
}
```

In this example, the `executeFunction` takes an integer and a function as arguments, and it calls the provided function a specified number of times.

Higher-order functions and lambda expressions in Dart enable you to write more expressive and modular code. They are particularly useful when working with collections, asynchronous operations, and functional programming paradigms.
