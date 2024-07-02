// Get bit
// Set bit 
// Clear bit
// Update bit

import java.util.Scanner;

public class BitManipulation {
    public static void main(String[] args) {
        // 1. GET BIT
        // get the 3rd position(2) bit of a number n = 0101
        // BIT MASK : 1<<i
        // Operation : AND

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the bit: ");

        int bit = sc.nextInt();

        System.out.println("Enter the position which you want to fitch:  ");
        int pos = sc.nextInt();

        int bitMask = 1 << pos;

        if ((bitMask & bit) == 0) {
            System.out.println("bit was " + '0');
        } else {
            System.out.println("bit was " + '1');
        }

    }
}