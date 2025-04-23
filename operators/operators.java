public class operators {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;

        // Bitwise AND
        System.out.println("Bitwise AND: " + (x & y)); // 2

        // Bitwise OR
        System.out.println("Bitwise OR: " + (x | y)); // 7

        // Bitwise XOR
        System.out.println("Bitwise XOR: " + (x ^ y)); // 5

        // Bitwise NOT
        System.out.println("Bitwise NOT: " + (~x)); // -7

        // Left shift
        System.out.println("Left shift: " + (x << 1)); // 12

        // Right shift
        System.out.println("Right shift: " + (x >> 1)); // 3
        
    }

    private static void boolLogic() {
        boolean a = true;
        boolean b = false;


        // Logical AND
        System.out.println("Logical &&: " + (a && b)); // false

        // Logical OR
        System.out.println("Logical ||: " + (a || b)); // true

        // Logical NOT
        System.out.println("Logical !: " + (!a)); // false

        // Bitwise AND
        System.out.println("Bitwise &: " + (a & b)); // false

        // Bitwise OR
        System.out.println("Bitwise |: " + (a | b)); // true

        // Bitwise XOR
        System.out.println("Bitwise ^: " + (a ^ b)); // true

        // Equality
        System.out.println("Equality ==: " + (a == b)); // false

        // Inequality
        System.out.println("Inequality !=: " + (a != b)); // true

        // XOR
        System.out.println("XOR ^: " + (a ^ b)); // true

        // OR Assignment
        



    }
}

