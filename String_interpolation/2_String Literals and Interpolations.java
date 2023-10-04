In Dart, strings are a sequence of UTF-16 code units. They are used to represent some text in a program. Each character may be represented by multiple code points, and each code point can have one or two code units. Strings are immutable in Dart, meaning they cannot be changed once created. However, methods such as `toLowerCase` or `split` return a modified string, but the original string remains intact [Source 7](https://zetcode.com/dart/string/).

## String Literals

Strings can be represented in Dart in multiple ways:

1. **Single Line Strings**: These are created using single quotes (`'`) or double quotes (`"`). For example:

```dart
var singleQuotes = 'This is a single line string';
var doubleQuotes = "This is also a single line string";
```

2. **Multiline Strings**: These are created using triple single quotes (`'''`) or triple double quotes (`"""`). For example:

```dart
var multilineString = '''
This is a
multiline string
''';
```
[Source 7](https://zetcode.com/dart/string/).

## String Interpolation

String interpolation is the process of evaluating a string containing variables or expressions. In Dart, the `$` symbol is used to interpolate variables and `${}` is used for expressions [Source 9](https://medium.com/run-dart/dart-dartlang-introduction-string-interpolation-8ed99174119a).

Here's an example of string interpolation:

```dart
void main() {
  var name = "John Doe";
  var occupation = "gardener";
  print("$name is a $occupation"); // John Doe is a gardener
  
  var x = 12;
  var y = 14;
  print("${x} * ${y} = ${x * y}"); // 12 * 14 = 168
}
```
[Source 13](https://www.tutorialspoint.com/string-interpolation-in-dart-programming).

## String Methods

Dart provides various methods to manipulate strings:

1. **length**: Returns the length of the string.

```dart
var text = "There are six falcons";
print(text.length); // 21
```

2. **isEmpty / isNotEmpty**: Checks whether a string is empty or not.

```dart
var word1 = '';
var word2 = "falcon";
if (word1.isEmpty) {
  print('word1 is empty'); // word1 is empty
}
if (word2.isNotEmpty) {
  print('word2 is not empty'); // word2 is not empty
}
```

3. **trim / trimLeft / trimRight**: Removes whitespace from the string.

```dart
var word = "  falcon\t";
print("|" + word.trim() + "|"); // |falcon|
```

4. **split**: Splits the string at matches of the pattern and returns a list of substrings.

```dart
var text = "a red fox";
var parts = text.split(' ');
print(parts); // [a, red, fox]
```
[Source 7](https://zetcode.com/dart/string/).

## Dynamic String Interpolation

While Dart's string interpolation works with hardcoded strings, you can build your own solution or use one of the existing template packages for dynamic string interpolation [Source 12](https://stackoverflow.com/questions/29784832/dart-string-interpolation-reading-a-file). Here's an example of dynamic string interpolation using a function:

```dart
Function MyTemplate() {
   return (context) {
     return "Name is ${context['name']} and ID is ${context['id']}";
   }
}
var templateHere = MyTemplate();
var output = templateHere({'name': 'John', 'id': 123});
print(output); // Name is John and ID is 123
```
[Source 10](https://stackoverflow.com/questions/11886796/can-i-apply-darts-string-interpolation-dynamically).
