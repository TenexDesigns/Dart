In Dart, a lambda expression (also known as an anonymous function or a lambda function) is a concise way to define small, anonymous functions without a name. Lambda expressions are commonly used for short, one-off functions or as arguments to higher-order functions. Here's how to use lambda expressions in Dart with code samples:

### Lambda Expression Syntax:

A lambda expression in Dart has the following syntax:

```dart
(parameters) => expression
```

- `parameters` are the input parameters (if any) enclosed in parentheses.
- `expression` is the single expression or block of code that represents the function's body.

### Lambda Expression Examples:

1. **Lambda Expression with No Parameters:**

```dart
void main() {
  // Lambda expression with no parameters
  var greet = () => 'Hello, World!';
  print(greet()); // Output: Hello, World!
}
```

In this example, we define a lambda expression `() => 'Hello, World!'` that takes no parameters and returns the string 'Hello, World!'.

2. **Lambda Expression with Parameters:**

```dart
void main() {
  // Lambda expression with parameters
  var add = (int a, int b) => a + b;
  print(add(3, 4)); // Output: 7
}
```

Here, we define a lambda expression `(int a, int b) => a + b` that takes two integer parameters and returns their sum.

3. **Lambda Expression as a Higher-Order Function Argument:**

Lambda expressions are often used as arguments to higher-order functions like `forEach`, `map`, or `where` on lists:

```dart
void main() {
  List<int> numbers = [1, 2, 3, 4, 5];

  // Using lambda expression with forEach
  numbers.forEach((number) {
    print(number * 2); // Output: 2 4 6 8 10
  });

  // Using lambda expression with map
  var doubledNumbers = numbers.map((number) => number * 2);
  print(doubledNumbers); // Output: (2, 4, 6, 8, 10)

  // Using lambda expression with where
  var evenNumbers = numbers.where((number) => number % 2 == 0);
  print(evenNumbers); // Output: (2, 4)
}
```

In these examples, we use lambda expressions as arguments to higher-order functions to perform various operations on a list of numbers.

Lambda expressions provide a concise and expressive way to define functions on the fly, making Dart code more readable and maintainable, especially when working with collections and functional programming concepts.











  
