In Dart, an abstract class is a class that cannot be instantiated directly but serves as a blueprint for other classes. Abstract classes are used to define a common interface or set of methods that must be implemented by concrete (non-abstract) subclasses. Abstract methods, on the other hand, are methods declared in an abstract class but have no implementation in the abstract class itself. Subclasses are required to provide implementations for these abstract methods.

Here's an example of an abstract class and abstract methods in Dart:

```dart
abstract class Shape {
  // Abstract method with no implementation
  double calculateArea();
  
  // Regular (non-abstract) method with implementation
  void printDescription() {
    print('This is a shape.');
  }
}

class Circle extends Shape {
  double radius;
  
  Circle(this.radius);
  
  // Implementation of the abstract method
  @override
  double calculateArea() {
    return 3.14159265359 * radius * radius;
  }
}

class Rectangle extends Shape {
  double width;
  double height;
  
  Rectangle(this.width, this.height);
  
  // Implementation of the abstract method
  @override
  double calculateArea() {
    return width * height;
  }
}

void main() {
  final circle = Circle(5.0);
  final rectangle = Rectangle(4.0, 6.0);
  
  circle.printDescription();
  print('Area of Circle: ${circle.calculateArea()}');
  
  rectangle.printDescription();
  print('Area of Rectangle: ${rectangle.calculateArea()}');
}
```

In this example:

1. We define an abstract class `Shape` with an abstract method `calculateArea()` and a regular method `printDescription()`. The `calculateArea()` method is declared without an implementation (no curly braces).

2. We create two concrete subclasses, `Circle` and `Rectangle`, that extend the `Shape` class.

3. In both subclasses, we provide implementations for the abstract method `calculateArea()` by using the `@override` annotation.

4. In the `main` function, we create instances of `Circle` and `Rectangle` and demonstrate calling both abstract and regular methods.

5. The `Shape` class cannot be instantiated on its own because it's abstract. However, it defines a common interface for all shapes through the `calculateArea()` method, which must be implemented by any concrete subclass.

Abstract classes and abstract methods allow you to define a structure for classes while enforcing certain behaviors. Subclasses are required to provide implementations for abstract methods, ensuring that specific functionality is present in each subclass while adhering to a common interface.
