The `if-else` statement is a conditional statement that allows you to execute different code blocks based on the value of a boolean expression.

The syntax for the `if-else` statement is as follows:

```dart
if (boolean_expression) {
  // code to be executed if the boolean_expression is true
} else {
  // code to be executed if the boolean_expression is false
}
```

For example, the following code will print "Hello, world!" to the console if the variable `isNight` is `false`:

```dart
bool isNight = false;

if (!isNight) {
  print("Hello, world!");
}
```

You can also use the `else if` statement to execute different code blocks based on multiple boolean expressions. The syntax for the `else if` statement is as follows:

```dart
if (boolean_expression1) {
  // code to be executed if the boolean_expression1 is true
} else if (boolean_expression2) {
  // code to be executed if the boolean_expression2 is true
} else {
  // code to be executed if all boolean expressions are false
}
```

For example, the following code will print a different message to the console depending on the value of the variable `age`:

```dart
int age = 18;

if (age < 18) {
  print("You are not old enough to vote.");
} else if (age >= 18 && age < 65) {
  print("You are eligible to vote.");
} else {
  print("You are too old to vote.");
}
```

**Nested if-else statements**

You can also nest `if-else` statements to create more complex conditional statements. For example, the following code will print a different message to the console depending on the value of the variables `age` and `isNight`:

```dart
int age = 18;
bool isNight = false;

if (age < 18) {
  print("You are not old enough to vote.");
} else if (age >= 18 && age < 65) {
  if (!isNight) {
    print("You are eligible to vote.");
  } else {
    print("You are eligible to vote, but the polls are closed.");
  }
} else {
  print("You are too old to vote.");
}
```

**Conclusion**

The `if-else` statement is a powerful tool for creating conditional statements in Dart. By understanding how to use the `if-else` statement, you can write Dart code that is more flexible and expressive.
