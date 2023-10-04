String Interpolation:
String interpolation is a convenient way to embed expressions and variables within a string. To interpolate a value into a string, you can use the ${expression} syntax.

dart
Copy code
String name = 'Alice';
int age = 30;

String message = 'My name is $name and I am $age years old.';
In this example, the values of name and age are inserted into the message string using string interpolation.






--------------------------------------------------------------------------


In Dart, strings are used to represent textual data, and there are various ways to work with strings, including string literals and string interpolation. Let's explore each of these concepts with code samples:

1. String Literals:
   Dart supports both single-quoted (`'`) and double-quoted (`"`) string literals. You can use either to create a string.

   ```dart
   String singleQuotedString = 'Hello, Dart!';
   String doubleQuotedString = "Hello, Dart!";
   ```

   Both `singleQuotedString` and `doubleQuotedString` will store the same string value.

2. String Interpolation:
   String interpolation is a convenient way to embed expressions and variables within a string. To interpolate a value into a string, you can use the `${expression}` syntax.

   ```dart
   String name = 'Alice';
   int age = 30;

   String message = 'My name is $name and I am $age years old.';
   ```

   In this example, the values of `name` and `age` are inserted into the `message` string using string interpolation.

3. Raw String Literals:
   Dart also supports raw string literals, which are prefixed with the `r` character. Raw string literals treat backslashes (`\`) as regular characters and are often used for regular expressions or file paths.

   ```dart
   String rawString = r'Raw \n String';
   ```

   In this case, `rawString` will contain the literal characters '\' and 'n', not a newline character.

4. Multiline Strings:
   Dart allows you to create multiline strings using triple quotes (`'''` or `"""`). This is useful when dealing with long blocks of text.

   ```dart
   String multilineString = '''
   This is a
   multiline
   string in Dart.
   ''';
   ```

   `multilineString` will contain line breaks as specified in the triple-quoted string.

5. String Concatenation:
   You can concatenate strings using the `+` operator or by using the `+=` assignment operator.

   ```dart
   String firstName = 'John';
   String lastName = 'Doe';

   String fullName = firstName + ' ' + lastName; // Using +
   fullName += ', Jr.'; // Using +=
   ```

   `fullName` will contain 'John Doe, Jr.' after concatenation.

These are the fundamental concepts of working with strings, literals, and string interpolation in Dart. You can use these techniques to manipulate and format strings as needed in your Dart applications.









