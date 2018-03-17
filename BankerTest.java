/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OSLab;

import java.util.Scanner;

/**
 *
 * @author Fahad
 */
class BankerTest {

    public static void main(String args[]) {
        Scanner src = new Scanner(System.in);
        System.out.println("ENTER THE NO. OF PROCESS");
        int p = src.nextInt();
        System.out.println("ENTER THE NO. OF RESOURCES");
        int r = src.nextInt();
        Bankers obj = new Bankers(p, r);
        obj.calNeed();
        obj.checkNeed();
        obj.compareNeed();
    }
}
