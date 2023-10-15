public class Combine {
    static int methodCalls = 0;

    // Using recursion for combination calculation
    static int comb(int n, int r, int depth) {
        methodCalls++;
        String indentation = "  ".repeat(depth);

        // Base case: combination(n, 0) and combination(n, n) are both 1
        if (r == 0 || n == r) {
            System.out.printf("%s# %d: c(%d, %d) = 1\n", indentation, methodCalls, n, r);
            return 1;
        } else {
            // Recursive case: combination(n, r) = combination(n-1, r) + combination(n-1, r-1)
            System.out.printf("%s# %d: c(%d, %d) = c(%d, %d) + c(%d, %d)\n",
                    indentation, methodCalls, n, r, n - 1, r, n - 1, r - 1);

            // Recursive calls for subproblems
            int result = comb(n - 1, r, depth + 1) + comb(n - 1, r - 1, depth + 1);

            // Print the result of the subproblem
            System.out.printf("%s= %d\n", indentation, result);

            // Return the result of the current subproblem
            return result;
        }
    }

    public static void main(String[] args) {
        int n = 8, r = 2;

        // Call the comb function to calculate the combination
        System.out.println("Final Result: " + comb(n, r, 0));
    }
}
