public class QuantityMeasurementApp {

    // ----------- Feet Class -----------
    static class Feet {
        private final double value;

        public Feet(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null) return false;

            if (getClass() != obj.getClass()) return false;

            Feet other = (Feet) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ----------- Inches Class -----------
    static class Inches {
        private final double value;

        public Inches(double value) {
            this.value = value;
        }

        @Override
        public boolean equals(Object obj) {

            if (this == obj) return true;

            if (obj == null) return false;

            if (getClass() != obj.getClass()) return false;

            Inches other = (Inches) obj;

            return Double.compare(this.value, other.value) == 0;
        }
    }

    // ----------- Utility Methods -----------

    static boolean compareFeet(double v1, double v2) {
        Feet f1 = new Feet(v1);
        Feet f2 = new Feet(v2);
        return f1.equals(f2);
    }

    static boolean compareInches(double v1, double v2) {
        Inches i1 = new Inches(v1);
        Inches i2 = new Inches(v2);
        return i1.equals(i2);
    }

    // ---------- TEST METHODS ----------

    static void testEquality_SameValue() {
        System.out.println("Feet Same Value: " + compareFeet(1.0, 1.0)); // true
        System.out.println("Inches Same Value: " + compareInches(1.0, 1.0)); // true
    }

    static void testEquality_DifferentValue() {
        System.out.println("Feet Different: " + compareFeet(1.0, 2.0)); // false
        System.out.println("Inches Different: " + compareInches(1.0, 2.0)); // false
    }

    static void testEquality_NullComparison() {
        Feet f = new Feet(1.0);
        Inches i = new Inches(1.0);

        System.out.println("Feet Null: " + f.equals(null)); // false
        System.out.println("Inches Null: " + i.equals(null)); // false
    }

    static void testEquality_NonNumericInput() {
        Feet f = new Feet(1.0);
        Inches i = new Inches(1.0);

        System.out.println("Feet Non-Numeric: " + f.equals("test")); // false
        System.out.println("Inches Non-Numeric: " + i.equals("test")); // false
    }

    static void testEquality_SameReference() {
        Feet f = new Feet(1.0);
        Inches i = new Inches(1.0);

        System.out.println("Feet Same Ref: " + f.equals(f)); // true
        System.out.println("Inches Same Ref: " + i.equals(i)); // true
    }

    // ---------- MAIN METHOD ----------
    public static void main(String[] args) {

        System.out.println("Input: 1.0 inch and 1.0 inch");
        System.out.println("Output: Equal (" + compareInches(1.0, 1.0) + ")");

        System.out.println("Input: 1.0 ft and 1.0 ft");
        System.out.println("Output: Equal (" + compareFeet(1.0, 1.0) + ")");

        System.out.println("\n--- Running Test Cases ---");

        testEquality_SameValue();
        testEquality_DifferentValue();
        testEquality_NullComparison();
        testEquality_NonNumericInput();
        testEquality_SameReference();
    }
}