package Interface.Problems_3_and_5;

public interface StaticFinal {
    int i = 1;

    public static void main(String args[]) {
        // Interface fields are static
        System.out.println("Got " + StaticFinal.i + " statically from the StaticFinal interface.");

        // Interface fields are final - we can't get this to compile:
        // StaticFinal.i = 1;
        // Error:(12, 20) java: cannot assign a value to final variable i
    }
}


