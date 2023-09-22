Inheritance in Dart is a mechanism that allows you to create new classes based on existing classes. This allows you to reuse code and create hierarchies of classes that represent different types of objects.

To create a new class that inherits from another class, you use the `extends` keyword. The `extends` keyword is followed by the name of the class that you want to inherit from. For example, the following code shows how to create a class called `Student` that inherits from the `Person` class:

```dart
class Person {
  String name;
  int age;

  Person(this.name, this.age);
}

class Student extends Person {
  // ...
}
```

The `Student` class inherits all of the properties and methods of the `Person` class. This means that you can use the `name` and `age` properties and the `greet()` method on `Student` objects in the same way that you can use them on `Person` objects.

In addition to inheriting the properties and methods of the parent class, you can also add new properties and methods to the child class. For example, the following code shows how to add a new `major` property to the `Student` class:

```dart
class Person {
  String name;
  int age;

  Person(this.name, this.age);
}

class Student extends Person {
  String major;

  Student(this.name, this.age, this.major);
}
```

You can also override the methods of the parent class in the child class. For example, the following code shows how to override the `greet()` method in the `Student` class:

```dart
class Person {
  String name;
  int age;

  Person(this.name, this.age);

  void greet() {
    print("Hello, my name is $name and I am $age years old.");
  }
}

class Student extends Person {
  String major;

  Student(this.name, this.age, this.major);

  @override
  void greet() {
    print("Hello, my name is $name and I am a $major student at $age years old.");
  }
}
```

When you call the `greet()` method on a `Student` object, the overridden `greet()` method in the `Student` class will be called.

Inheritance is a powerful tool that allows you to reuse code and create hierarchies of classes that represent different types of objects. By understanding how to use inheritance in Dart, you can write more efficient and maintainable code.

Here are some other examples of inheritance in Dart:

* A `Car` class could inherit from a `Vehicle` class.
* A `Dog` class could inherit from an `Animal` class.
* A `SavingsAccount` class could inherit from a `BankAccount` class.

Inheritance is a fundamental concept in object-oriented programming. By understanding how to use inheritance in Dart, you can write more robust and reliable code.
