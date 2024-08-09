package com.icortex.common_problem;

import java.util.Scanner;

public class Main {
    static double[] sequence;
    static int N;
    static final double FP16_MAX = 65504.0; // Maximum representable value in fp16

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        N = scanner.nextInt();
        sequence = new double[N];
        for (int i = 0; i < N; i++) {
            sequence[i] = scanner.nextDouble();
        }

        scanner.close();

        // Call the encodeAlgorithm function to generate the encoded algorithm
        String encodedAlgorithm = encodeAlgorithm(0, N - 1, 'd');

        // Print the encoded algorithm
        System.out.println(encodedAlgorithm);
    }

    // Function to encode the summation algorithm according to the specified format
    static String encodeAlgorithm(int start, int end, char precision) {
        StringBuilder sb = new StringBuilder();
        sb.append("{").append(precision).append(":");

        // If there is only one value in the sequence
        if (start == end) {
            sb.append(start + 1);
        } else {
            // Check if the sum fits within fp16 precision
            if (precision == 'd' || sum(start, end) <= FP16_MAX) {
                // Use double precision
                sb.append(start + 1).append(",").append(end + 1);
            } else if (precision == 's' || sum(start, end) <= Float.MAX_VALUE) {
                // Use single precision
                sb.append("{s:");
                sb.append(encodeAlgorithm(start, (start + end) / 2, 's')).append(",");
                sb.append(encodeAlgorithm((start + end) / 2 + 1, end, 's')).append("}");
            } else {
                // Use half precision
                sb.append("{h:");
                sb.append(encodeAlgorithm(start, (start + end) / 2, 'h')).append(",");
                sb.append(encodeAlgorithm((start + end) / 2 + 1, end, 'h')).append("}");
            }
        }

        sb.append("}");
        return sb.toString();
    }

    // Function to calculate the sum of values in the sequence
    static double sum(int start, int end) {
        double sum = 0.0;
        for (int i = start; i <= end; i++) {
            sum += sequence[i];
        }
        return sum;
    }
}
