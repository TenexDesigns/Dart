To throw a custom exception in Dart, you can use the `throw` keyword. To handle a custom exception, you can use the `try-catch` statement.

To throw a custom exception, you first need to create a class that extends the `Exception` class. This class should contain the properties and methods that you need to represent your custom exception.

For example, the following code shows how to create a custom exception called `InvalidInputException`:

```dart
class InvalidInputException extends Exception {
  final String message;

  InvalidInputException(this.message);

  @override
  String toString() => message;
}
```

Once you have created your custom exception class, you can throw it using the `throw` keyword. For example, the following code shows how to throw an `InvalidInputException` if the user enters an invalid input:

```dart
String getInput() {
  String input = readLine();

  if (input.isEmpty) {
    throw InvalidInputException("Input cannot be empty.");
  }

  return input;
}
```

To handle a custom exception, you can use the `try-catch` statement. The `try` block contains the code that may throw the exception. The `catch` block contains the code that handles the exception.

For example, the following code shows how to handle the `InvalidInputException` that we threw in the previous example:

```dart
void main() {
  try {
    String input = getInput();

    // Do something with the input
  } catch (e) {
    if (e is InvalidInputException) {
      print(e.message);
    } else {
      // Handle other types of exceptions
    }
  }
}
```

You can also use multiple `catch` blocks to handle different types of exceptions.

**Conclusion**

Throwing and handling custom exceptions is a powerful way to manage errors in Dart code. By understanding how to throw and handle custom exceptions, you can write Dart code that is more robust and reliable.






  
