
//what will this code block return?
//ans: 9.0, mixed type arithmetic does not need to be casted explicitly, it is automatically converted to a double  
try {
    Float f1 = new Float("3.0");
    int a = f1.intValue();
    byte b = f1.byteValue();
    double c = f1.byteValue();
    System.out.println(a + b + c);
} catch (NumberFormatException e) {
    System.out.println("Bad number");
}

//what will the following code print out?
//ans: 8 7 because it's octal notation, just like hex or binary
//the leading 0 indicates that it's octal
int i = 010;
int j = 07;
System.out.println(i);
System.out.println(j);

//which of the following data structures can erase from its beginning or its end in O(1) time?
//a-vector b-deque c-stack d-segment tree
//answer: stack




