package AccessModifiers;

// Filename: Client2.java

class TLClassA { // (1) Top-level Class

    private String msg = "TLClassA object ";

    public TLClassA(String objNo) {
        msg = msg + objNo;
    }

    public void printMessage() {
        System.out.println(msg);

    }

    class InnerB { // (2) Non-static Inner Class

        private String msg = "InnerB object ";

        public InnerB(String objNo) {
            msg = msg + objNo;
        }

        public void printMessage() {
            System.out.println(msg);
        }

        class InnerC { // (3) Non-static Inner Class

            private String msg = "InnerC object ";

            public InnerC(String objNo) {
                msg = msg + objNo;
            }

            public void printMessage() {

                System.out.println(msg); // (4)

                System.out.println(this.msg); // (5)

                System.out.println(InnerC.this.msg); // (6)

                System.out.println(InnerB.this.msg); // (7)

                InnerB.this.printMessage(); // (8)

                System.out.println(TLClassA.this.msg); // (9)

                TLClassA.this.printMessage(); // (10)

            }

        }

    }

}


public class Client2 { // (11)

    public static void main(String args[]) { // (12)

        TLClassA a = new TLClassA("1"); // (13)
        TLClassA.InnerB b = a.new InnerB("1"); // (14)

        TLClassA.InnerB.InnerC c = b.new InnerC("1"); // (15)

        c.printMessage(); // (16)

        TLClassA.InnerB bb = new TLClassA("2").new InnerB("2");// (17)

        TLClassA.InnerB.InnerC cc = bb.new InnerC("2"); // (18)

        cc.printMessage(); // (19)

        TLClassA.InnerB.InnerC ccc =
                new TLClassA("3").new InnerB("3").new InnerC("3"); // (20)
    }
}
