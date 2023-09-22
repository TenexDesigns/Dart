In Dart, getters and setters are used to control access to the properties (instance variables) of a class. They allow you to define custom logic for reading and writing the values of these properties. Getters are used to retrieve the values of properties, and setters are used to assign values to properties.

Here's how you can define getters and setters in Dart:

1. **Getters:**
   - Getters are methods that are used to retrieve the value of a property.
   - They are defined using the `get` keyword followed by a method name.
   - Getters do not take any parameters.
   - They are accessed like properties, without using parentheses.

   ```dart
   class Circle {
     double radius;

     // Getter for calculating the area of the circle
     double get area => 3.14 * radius * radius;
   }

   void main() {
     var myCircle = Circle();
     myCircle.radius = 5.0; // Setting the radius
     print(myCircle.area); // Accessing the area getter
   }
   ```

2. **Setters:**
   - Setters are methods used to assign a value to a property.
   - They are defined using the `set` keyword followed by a method name.
   - Setters take one parameter, which represents the new value to be assigned to the property.
   - Setters are also accessed like properties, using the assignment operator (`=`).

   ```dart
   class Circle {
     double _radius; // Private variable

     // Getter for the radius
     double get radius => _radius;

     // Setter for the radius
     set radius(double value) {
       if (value >= 0) {
         _radius = value;
       } else {
         throw ArgumentError('Radius cannot be negative');
       }
     }
   }

   void main() {
     var myCircle = Circle();
     myCircle.radius = 5.0; // Setting the radius using the setter
     print(myCircle.radius); // Accessing the radius getter
   }
   ```

In the example above, we used a private variable `_radius` to store the value of the radius and provided a custom setter to validate that the radius cannot be negative. The getter allows us to access the radius value.

By using getters and setters, you can encapsulate the internal state of a class and control how it's accessed and modified. This helps you ensure that the data remains consistent and follows specific rules or validations.
