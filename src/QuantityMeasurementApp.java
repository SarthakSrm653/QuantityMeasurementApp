public class QuantityMeasurementApp {

    // Inner Class
    static class Feet {
        private final double value;

        // Constructor
        public Feet(double value) {
            this.value = value;
        }

        // Override equals()
        @Override
        public boolean equals(Object obj) {

            // Same reference
            if (this == obj) return true;

            // Null check
            if (obj == null) return false;

            // Type check
            if (getClass() != obj.getClass()) return false;

            // Cast
            Feet other = (Feet) obj;

            // Compare using Double.compare()
            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ---------- TEST METHODS ----------

    static void testEquality_SameValue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        System.out.println("Same Value Test: " + f1.equals(f2)); // true
    }

    static void testEquality_DifferentValue() {
        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(2.0);

        System.out.println("Different Value Test: " + f1.equals(f2)); // false
    }

    static void testEquality_NullComparison() {
        Feet f1 = new Feet(1.0);

        System.out.println("Null Comparison Test: " + f1.equals(null)); // false
    }

    static void testEquality_NonNumericInput() {
        Feet f1 = new Feet(1.0);
        String nonNumeric = "test";

        System.out.println("Non-Numeric Test: " + f1.equals(nonNumeric)); // false
    }

    static void testEquality_SameReference() {
        Feet f1 = new Feet(1.0);

        System.out.println("Same Reference Test: " + f1.equals(f1)); // true
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) {

        Feet f1 = new Feet(1.0);
        Feet f2 = new Feet(1.0);

        boolean result = f1.equals(f2);

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + result + ")");

        System.out.println("\n--- Running Test Cases ---");

        testEquality_SameValue();
        testEquality_DifferentValue();
        testEquality_NullComparison();
        testEquality_NonNumericInput();
        testEquality_SameReference();
    }
}