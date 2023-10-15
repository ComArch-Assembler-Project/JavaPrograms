public class Arithmetic_Series {
        public static void main(String[] args) {
            int start = 1;
            int finalValue = 1000;
            int neg1 = -1;
            int reg2 = start;
            int reg3 = finalValue;
            int reg4 = neg1;
            int reg6 = 0;

            reg2 = reg2 + reg4;

            while (reg3 != reg2) {
                reg6 = reg6 + reg3;
                reg3 = reg3 + reg4;
            }

            // Print the result
            System.out.println(" Result: " + reg6);
        }
}
