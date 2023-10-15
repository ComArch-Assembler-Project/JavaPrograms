public class BinMultiply {
    public static void main(String[] args) {
        // Input values
        int mcand = 32766;
        int mplier = 10383;

        // Call the multiply function to perform computation
        int result = multiply(mcand, mplier);

        // Print the result
        printResult(mcand, mplier, result);
    }

    // Function to perform binary multiplication
    public static int multiply(int mcand, int mplier) {
        // Initialize registers
        int[] reg = new int[8]; // Registers reg[0] to reg[7]

        // Initialize register values
        reg[2] = mcand;
        reg[3] = mplier;
        reg[4] = 1;
        reg[5] = -1;
        reg[6] = 14; // Counter

        // Main loop for binary multiplication
        while (true) {
            // NAND operation
            reg[7] = -(reg[3] & reg[4]);
            reg[7] = -reg[7]; // Invert reg[7]

            // Accumulate mcand if reg[7] is not zero
            if (reg[7] != 0) {
                reg[1] = reg[1] + reg[2];
            }

            // Left shift mcand, pos1, and decrement exit counter
            reg[2] = reg[2] + reg[2];
            reg[4] = reg[4] + reg[4];
            reg[6] = reg[6] + reg[5];

            // Print register values
            printRegisters(reg);

            // Exit loop if counter is zero
            if (reg[6] == 0) {
                break;
            }
        }

        // Return the result
        return reg[1];
    }

    // Function to print register values
    public static void printRegisters(int[] reg) {
        System.out.print("Registers: ");
        for (int i = 0; i < reg.length; i++) {
            System.out.print("reg[" + i + "]=" + reg[i] + "   ");
        }
        System.out.println();
    }

    // Function to print the final result
    public static void printResult(int mcand, int mplier, int result) {
        System.out.println("Result of " + mcand + " * " + mplier + " = " + result);
    }
}
