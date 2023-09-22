A callable class in Dart is a class that can be called like a function. To make a class callable, you need to implement the `call()` method. The `call()` method is a special method that is called when the class is called like a function.

For example, the following code shows a simple callable class:

```dart
class Adder {
  int call(int a, int b) {
    return a + b;
  }
}
```

The `Adder` class has a single method, `call()`, which takes two integers as parameters and returns their sum.

To use the `Adder` class, you can simply call it like a function. For example, the following code shows how to add two numbers using the `Adder` class:

```dart
Adder adder = new Adder();

int sum = adder(10, 20);

print(sum); // Prints 30
```

You can also pass callable classes to other functions. For example, the following code shows how to pass a callable class to the `sort()` method:

```dart
List<int> numbers = [5, 3, 2, 1, 4];

numbers.sort((a, b) => a - b);

print(numbers); // Prints [1, 2, 3, 4, 5]
```

In this example, we are passing the `Adder` class to the `sort()` method. The `sort()` method will sort the list of numbers in ascending order using the `call()` method of the `Adder` class.

Callable classes are a powerful feature of Dart that can make your code more concise and readable. By understanding how to use callable classes, you can write more elegant and efficient code.

Here are some other examples of callable classes in Dart:

* `Comparable`: This class allows you to compare objects to each other.
* `Iterable`: This class allows you to iterate over objects.
* `Stream`: This class allows you to listen for events and data streams.

Callable classes are a fundamental concept in object-oriented programming. By understanding how to use callable classes in Dart, you can write more robust and reliable code.
