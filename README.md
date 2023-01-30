# Java Code Practice

Just a playground for fundamental computing tasks written in Java. All source code is under the `src` directory.

### StringPermutation.java
**Detect if a string is a permutation of another.**

An empty array of integers is created along with three `for` loops. The first loop cast the chars in the array to ints 
to obtain the ordinal values of the characters. The ordinal value is used to increment
the value stored at the related index.


```java
    for (int i = 0; i < string1.length(); i++) {
        arr[(int) string1.charAt(i)] += 1;
    }
```


The second loop iterates through the characters in the second string. For every ordinal value that is found
decrement the value at the related index.
 
```java
    for (int i = 0; i < string2.length(); i++) {
        arr[(int) string2.charAt(i)]  -= 1;
    }
```

The third loop checks the array for non-zero values, if non-zero values exist the value was not decremented
due to a match in the opposing string so return `false`.

```java
    for (int i = 0; i < arr.length; i++) {
        if(arr[i] != 0) return false;
    }
```
<br>

### UniqueCharacters.java
**Verify if a string contains all unique characters**

A `String` is passed which is processed by two loops. The first loop grabs the initial
character in the string. The second loop takes the next character in the string (`i+1`)
and the body compares the two -- returning false if the two characters match. This process
repeats until all characters have been compared, if no characters match return `true`.

```java
    public static boolean testForUniqueCharacters(String string) {
        for (int i = 0; i < string.length(); i++) {
            for (int j = i+1; j < string.length(); j++) {
                if(string.charAt(i) == string.charAt(j)) {
                    return false;
                }
            }
        }
        return true;
    }
```
<br>

### RepeatingCharacters.java
- Return the number of repeated characters in a string.

### URLEncoding.java
- Encode spaces in a URL with "%20" instead of "+".

### StrBuilder.java
- Uses the StringBuilder class for string manipulation to avoid copies.

### RotateMatrix.java
- In place, clockwise rotation of a 3x3 matrix.

### BinarySearch.java
- Binary search algorithm.

### SetZeroes.java
- If a 0 exists in matrix make all related columns and rows 0.

### FrequencyOfArrayElements.java
- Return the number of elements stored in each array member.

### InitArray.java
- Consistently loop through a multi-dimensional array regardless of dimension or raggedness.

### RollDie.java
- Return the frequency of faces in a die roll.