# LongIntegers-Abstract-Data-Type-
 Implementing the Long Integer ADT using two data structures: singly linked list and array and performing Arithmetic operations on Long Integer that can have an arbitrary number of digits (i.e., tens of thousands of digits, or millions of digits, or more…).
 
Many applications, such as cryptography, require very large integers (much larger than would fit into 32- bit or 64-
bit integer types). The standard library of many languages includes a “Big Integer” data type. In this project i have
implemented such a Long Integer Abstract Data Type, where there is no predefined limit on the maximum value that
can be stored. 

The following abstract operations are defined for the Long Integer ADT: ADD,SUBSTRACT, MULTIPLY, POWER, and various comparison operations (e.g., LESS THAN). The Long Integer ADT also has two properties associated with it: sign and number of digits. There are many possible implementations of a Long Integer ADT. 

When representing a Long Integer, each position of the SimpleList ADT will store at most 4 digits of the overall
number. Every node will store a positive value, as the sign will be represented as a property of the Long Integer.
When adding two such 4-digit integers the result can be a 5 digit integer. This 5 digit integer must be separated
into a 4 digit integer containing the 4 rightmost (least significant) digits and one overflow digit (the most significant
digit) that will be added to the next node to the left. To perform addition of two Long Integers of c digits each you
will need to perform c/4 additions of 4 digit integers and potentially handle c/4 overflow digits. Similarly,
multiplication of two 4 digit numbers may result in an 8 digit number, which is not allowed to be stored in a
SimpleList position.
