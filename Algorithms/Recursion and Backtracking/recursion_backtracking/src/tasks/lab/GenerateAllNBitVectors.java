package tasks.lab;

import java.util.Stack;

public class GenerateAllNBitVectors {

    public static void generateVector(String prefix, int remainingBits) {

        if (remainingBits == 0) {
            System.out.println(prefix);
        }
        else {
            generateVector(prefix + "0", remainingBits - 1);
            System.out.println("x");
            generateVector(prefix + "1", remainingBits - 1);
        }
    }

    public static void generateVectorS(Stack<Integer> stack, int bits) {

        if (bits == 0) {
            stack.forEach(System.out::print);
            System.out.println();
        }
        else {
            stack.push(0);
            generateVectorS(stack, bits - 1);

            for (int i = 0; i < bits; i++) {
                stack.pop();
            }

            stack.push(1);
            generateVectorS(stack, bits - 1);
        }
    }

    public static void main(String[] args) {
        //generateVector("", 3);
        generateVectorS(new Stack<>(), 3);
    }
}
