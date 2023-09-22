In Dart, the `static` keyword is used to declare class-level members (variables and methods) that are associated with the class itself rather than with instances of the class. Here's how to use `static` variables and methods in Dart with code samples:

### Static Variables:

Static variables belong to the class itself and are shared among all instances of the class. They are declared using the `static` keyword.

```dart
class MyClass {
  static int staticVar = 0; // Static variable

  void printStaticVar() {
    print('StaticVar: $staticVar');
  }
}

void main() {
  MyClass obj1 = MyClass();
  MyClass obj2 = MyClass();

  obj1.printStaticVar(); // Output: StaticVar: 0
  obj2.printStaticVar(); // Output: StaticVar: 0

  // Updating the static variable
  MyClass.staticVar = 42;

  obj1.printStaticVar(); // Output: StaticVar: 42
  obj2.printStaticVar(); // Output: StaticVar: 42
}
```

In the example above, `staticVar` is a static variable shared between all instances of the `MyClass` class.

### Static Methods:

Static methods, like static variables, belong to the class itself and are not associated with any instance of the class. They are declared using the `static` keyword.

```dart
class MathUtils {
  static int add(int a, int b) {
    return a + b;
  }

  static double square(double x) {
    return x * x;
  }
}

void main() {
  int sum = MathUtils.add(3, 4); // Calling a static method
  print('Sum: $sum'); // Output: Sum: 7

  double result = MathUtils.square(5.0); // Calling another static method
  print('Square: $result'); // Output: Square: 25.0
}
```

In this example, `add` and `square` are static methods of the `MathUtils` class, and you can call them without creating an instance of the class.

Static variables and methods are useful when you have data or functionality that should be associated with the class itself rather than with individual instances. They are often used for utility classes or for storing constants that are common to all instances of the class.
