
//what will this code block return?
//ans: 9.0, mixed type arithmetic does not need to be casted, it is automatically converted to a double 
try {
    Float f1 = new Float("3.0");
    int a = f1.intValue();
    byte b = f1.byteValue();
    double c = f1.byteValue();
    System.out.println(a + b + c);
} catch (NumberFormatException e) {
    System.out.println("Bad number");
}
