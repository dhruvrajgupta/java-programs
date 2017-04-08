package Hackerrank.PracticeAlgorithms.Implementation;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

/**
 * Created by dhruv on 08/04/17.
 */
public class ElectronicsShop {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int s = in.nextInt();
        int n = in.nextInt();
        int m = in.nextInt();
        int[] keyboards = new int[n];
        for(int keyboards_i=0; keyboards_i < n; keyboards_i++){
            keyboards[keyboards_i] = in.nextInt();
        }
        int[] pendrives = new int[m];
        for(int pendrives_i=0; pendrives_i < m; pendrives_i++){
            pendrives[pendrives_i] = in.nextInt();
        }

        int min = Arrays.stream(keyboards).min().getAsInt()+Arrays.stream(pendrives).min().getAsInt();
        if(min>s)
            System.out.println("-1");
        else {
            Arrays.sort(keyboards);
        }
    }
}
