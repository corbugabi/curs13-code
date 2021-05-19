package ro.fasttrackit.curs13.exceptions;

public class UnchackedExceptions {
    public static void main(String[] args) {
        printNames();
        anotherMethod();
        System.out.println("STOP");
    }

    private static void printNames() {
        if (System.currentTimeMillis() % 2 == 0) {
            String s = null;
            int length = s.length();
        } else if((System.currentTimeMillis() & 3) == 0){
                throw new ArrayIndexOutOfBoundsException("This  is a custom AIOBE");
        }else{
            throw new MyUncheckedException("This is mine");
        }
    }

    private static void anotherMethod() {
        try {
            printNames();
        } catch (NullPointerException ex) {
            System.out.println("NBE happened" + ex.getMessage());
        }
    }

}
