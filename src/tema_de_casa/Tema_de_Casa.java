//this is the code after decompiling; I deleted the original code by mistake of course

package tema_de_casa;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Tema_de_Casa {
    Scanner s;

    public Tema_de_Casa() {
        this.s = new Scanner(System.in);
    }

    public void proba() {
        System.out.print("dati nr de problema 1-12: ");
        Scanner s = new Scanner(System.in);
        String q = s.nextLine();
        System.out.println();
        byte var4 = -1;
        switch (q.hashCode()) {
            case 49:
                if (q.equals("1")) {
                    var4 = 0;
                }
                break;
            case 50:
                if (q.equals("2")) {
                    var4 = 1;
                }
                break;
            case 51:
                if (q.equals("3")) {
                    var4 = 2;
                }
                break;
            case 52:
                if (q.equals("4")) {
                    var4 = 3;
                }
                break;
            case 53:
                if (q.equals("5")) {
                    var4 = 4;
                }
                break;
            case 54:
                if (q.equals("6")) {
                    var4 = 5;
                }
                break;
            case 55:
                if (q.equals("7")) {
                    var4 = 6;
                }
                break;
            case 56:
                if (q.equals("8")) {
                    var4 = 7;
                }
                break;
            case 57:
                if (q.equals("9")) {
                    var4 = 8;
                }
                break;
            case 1567:
                if (q.equals("10")) {
                    var4 = 9;
                }
                break;
            case 1568:
                if (q.equals("11")) {
                    var4 = 10;
                }
                break;
            case 1569:
                if (q.equals("12")) {
                    var4 = 11;
                }
        }

        switch (var4) {
            case 0:
                this.p1();
            case 1:
                this.p2();
            case 2:
                this.p3();
            case 3:
                this.p4();
            case 4:
                this.p5();
            case 5:
                this.p6();
            case 6:
                this.p7();
            case 7:
                this.p8();
            case 8:
                this.p9();
            case 9:
                this.p10();
            case 10:
                this.p11();
            case 11:
                this.p12();
            default:
                System.out.println("dati un nr de problema 1-12");
                this.proba();
        }
    }

    public static void main(String[] args) {
        Tema_de_Casa tc = new Tema_de_Casa();
        tc.proba();
    }

    public void p1() {
        System.out.println("scrieti un array care sa contina 10 int-uri si apoi printati suma lor");
        int[] a = new int[10];

        int S;
        for (S = 0; S < a.length; ++S) {
            a[S] = (int) (Math.random() * 10.0D);
        }

        int[] var7 = a;
        int i = a.length;

        for (int var4 = 0; var4 < i; ++var4) {
            int z = var7[var4];
            System.out.print(z + " ");
        }

        System.out.println();
        S = 0;

        for (i = 0; i < a.length; ++i) {
            S += a[i];
        }

        System.out.println(S);
        System.out.println();
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var6 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var6 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var6 = 0;
                }
        }

        switch (var6) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p2() {
        System.out.println("scrieti un array care sa contina 5 int-uri si apoi printati minimul din array");
        int[] b = new int[5];

        int i;
        try {
            Scanner scn = new Scanner(System.in);

            for (i = 0; i < b.length; ++i) {
                System.out.print("b[" + i + "]=");
                b[i] = scn.nextInt();
            }
        } catch (InputMismatchException var7) {
            System.out.println("dati int-uri !!!");
            this.p2();
        }

        int[] var8 = b;
        i = b.length;

        for (int var4 = 0; var4 < i; ++var4) {
            int z = var8[var4];
            System.out.print(z + " ");
        }

        System.out.println();
        int min = b[0];

        for (i = 1; i < b.length; ++i) {
            if (min >= b[i]) {
                min = b[i];
            }
        }

        System.out.println(min);
        System.out.println();
        System.out.println("mai vreti sa dati optiuni: da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q2 = s.nextLine();
        byte var6 = -1;
        switch (q2.hashCode()) {
            case 100:
                if (q2.equals("d")) {
                    var6 = 1;
                }
                break;
            case 3197:
                if (q2.equals("da")) {
                    var6 = 0;
                }
        }

        switch (var6) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p3() {
        System.out.println("scrieti un array care sa contina 5 int-uri si apoi printati maximul din array");
        int[] c = new int[5];

        int i;
        try {
            Scanner s = new Scanner(System.in);

            for (i = 0; i < c.length; ++i) {
                System.out.print("c[" + i + "]=");
                c[i] = s.nextInt();
            }
        } catch (InputMismatchException var7) {
            System.out.println("dati int-uri !!!");
            this.p3();
        }

        int[] var8 = c;
        i = c.length;

        for (int var4 = 0; var4 < i; ++var4) {
            int z = var8[var4];
            System.out.print(z + " ");
        }

        System.out.println();
        int max = c[0];

        for (i = 1; i < c.length; ++i) {
            if (max <= c[i]) {
                max = c[i];
            }
        }

        System.out.println(max);
        System.out.println();
        System.out.println("mai vreti sa dati optiuni: da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q2 = s.nextLine();
        byte var6 = -1;
        switch (q2.hashCode()) {
            case 100:
                if (q2.equals("d")) {
                    var6 = 1;
                }
                break;
            case 3197:
                if (q2.equals("da")) {
                    var6 = 0;
                }
        }

        switch (var6) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p4() {
        System.out.println("scrieti un array cu 10 int-uri apoi printati elementele care sunt pare");
        int[] a = new int[10];

        int i;
        for (i = 0; i < a.length; ++i) {
            a[i] = (int) (Math.random() * 10.0D);
        }

        int[] var6 = a;
        int var3 = a.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int z = var6[var4];
            System.out.print(z + " ");
        }

        System.out.println();

        for (i = 0; i < a.length; ++i) {
            if (a[i] % 2 == 0) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var9 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var9 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var9 = 0;
                }
        }

        switch (var9) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p5() {
        System.out.println("scrieti un array cu 10 int-uri apoi printati elementele care sunt impare");
        int[] a = new int[10];

        int i;
        for (i = 0; i < a.length; ++i) {
            a[i] = (int) (Math.random() * 10.0D);
        }

        int[] var6 = a;
        int var3 = a.length;

        for (int var4 = 0; var4 < var3; ++var4) {
            int z = var6[var4];
            System.out.print(z + " ");
        }

        System.out.println();

        for (i = 0; i < a.length; ++i) {
            if (a[i] % 2 != 0) {
                System.out.print(a[i] + " ");
            }
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var9 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var9 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var9 = 0;
                }
        }

        switch (var9) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    void p6() {
        System.out.println("scrieti un array cu 5 string-uri apoi printati string-urile cu o lungime mai mare de 3 caractere");
        String[] str = new String[5];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = sc.nextLine();
        }

        String[] var8 = str;
        int i = str.length;

        for (int var5 = 0; var5 < i; ++var5) {
            String z = var8[var5];
            System.out.print(z + " ");
        }

        System.out.println();
        boolean ok = false;

        for (i = 0; i < str.length; ++i) {
            if (str[i].length() > 3) {
                System.out.print(str[i] + " ");
                ok = true;
            }
        }

        if (!ok) {
            System.out.print("nu exista string-uri ");
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var7 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var7 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var7 = 0;
                }
        }

        switch (var7) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    void p7() {
        System.out.println("scrieti un array cu 5 string-uri apoi printati string-urile cu o lungime mai mica de 5 caractere.");
        String[] str = new String[5];
        Scanner scn = new Scanner(System.in);

        for (int i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = scn.nextLine();
        }

        String[] var8 = str;
        int i = str.length;

        for (int var5 = 0; var5 < i; ++var5) {
            String z = var8[var5];
            System.out.print(z + " ");
        }

        System.out.println();
        boolean ok = false;

        for (i = 0; i < str.length; ++i) {
            if (str[i].length() < 5) {
                System.out.print(str[i] + " ");
                ok = true;
            }
        }

        if (!ok) {
            System.out.print("nu exista string-uri ");
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var7 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var7 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var7 = 0;
                }
        }

        switch (var7) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p8() {
        System.out.println("scrieti un array cu 5 string-uri apoi printati string-urile care incep cu o litera aleasa de voi");
        String[] str = new String[5];
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int i;
        for (i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = sc1.nextLine();
        }

        for (i = 0; i < str.length; ++i) {
            System.out.print(str[i] + " ");
        }

        System.out.println();
        System.out.print("dati litera: ");
        String lit = sc2.nextLine();
        boolean ok = false;

        for (i = 0; i < str.length; ++i) {
            if (str[i].startsWith(lit)) {
                System.out.print(str[i] + " ");
                ok = true;
            }
        }

        if (!ok) {
            System.out.print("nu exista string-uri ");
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var9 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var9 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var9 = 0;
                }
        }

        switch (var9) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p9() {
        System.out.println("scrieti un array cu 5 string-uri apoi printati string-urile care incep cu o litera aleasa de voi ");
        System.out.println("sau cu alta litera aleasa de voi ");
        String[] str = new String[5];
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int i;
        for (i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = sc1.nextLine();
        }

        for (i = 0; i < str.length; ++i) {
            System.out.print(str[i] + " ");
        }

        System.out.println();
        System.out.print("dati prima litera: ");
        String lit = sc2.nextLine();
        System.out.print("dati a doua litera: ");
        String lit2 = sc2.nextLine();
        boolean ok = false;

        for (i = 0; i < str.length; ++i) {
            if (str[i].startsWith(lit) || str[i].startsWith(lit2)) {
                System.out.print(str[i] + " ");
                ok = true;
            }
        }

        if (!ok) {
            System.out.print("nu exista string-uri ");
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var10 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var10 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var10 = 0;
                }
        }

        switch (var10) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    public void p10() {
        System.out.println("scrieti un array cu 5 string-uri apoi printati string-urile care incep cu o litera aleasa de voi ");
        System.out.println("si se termina cu alta litera aleasa de voi ");
        String[] str = new String[5];
        Scanner sc1 = new Scanner(System.in);
        Scanner sc2 = new Scanner(System.in);

        int i;
        for (i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = sc1.nextLine();
        }

        for (i = 0; i < str.length; ++i) {
            System.out.print(str[i] + " ");
        }

        System.out.println();
        System.out.print("dati litera de inceput: ");
        String lit = sc2.nextLine();
        System.out.print("dati litera de sfarsit: ");
        String lit2 = sc2.nextLine();
        boolean ok = false;

        for (i = 0; i < str.length; ++i) {
            if (str[i].startsWith(lit) && str[i].endsWith(lit2)) {
                System.out.print(str[i] + " ");
                ok = true;
            }
        }

        if (!ok) {
            System.out.print("nu exista string-uri ");
        }

        System.out.println("\n");
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var10 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var10 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var10 = 0;
                }
        }

        switch (var10) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    void p11() {
        System.out.println("scrieti un array cu 4 string-uri. schimbati prima valoare cu ultima valoare. a 2a valoare cu penultima valoare ");
        System.out.println("eg. [1,2,3,4] va printa dupa schimb [4,3,2,1]");
        String[] str = new String[4];
        Scanner sc1 = new Scanner(System.in);

        int i;
        for (i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = sc1.nextLine();
        }

        for (i = 0; i < str.length; ++i) {
            System.out.print(str[i] + " ");
        }

        System.out.println();

        String q1;
        for (i = 0; i < str.length / 2; ++i) {
            q1 = str[i];
            str[i] = str[str.length - 1 - i];
            str[str.length - 1 - i] = q1;
        }

        String[] var8 = str;
        int var7 = str.length;

        for (int var5 = 0; var5 < var7; ++var5) {
            String z = var8[var5];
            System.out.print(z + " ");
        }

        System.out.println();
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        q1 = s.nextLine();
        byte var10 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var10 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var10 = 0;
                }
        }

        switch (var10) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }

    void p12() {
        System.out.println("scrieti un array cu 4 string-uri. afisati ESTE IN REGULA daca primul element al array-ului este egal cu ultimul");
        System.out.println("iar al 2lea este egal cu penultimul. ex [1,2,2,1] va printa ESTE IN REGULA iar [1,2,3,4] va printa NU ESTE IN REGULA");
        String[] str = new String[4];
        Scanner sc1 = new Scanner(System.in);

        int i;
        for (i = 0; i < str.length; ++i) {
            System.out.print("str[" + i + "]=");
            str[i] = sc1.nextLine();
        }

        for (i = 0; i < str.length; ++i) {
            System.out.print(str[i] + " ");
        }

        System.out.println();
        String q = str[str.length - 1];
        String q10 = str[str.length - 2];
        if (str[0].equals(q) && str[1].equals(q10)) {
            System.out.println("ESTE IN REGULA");
        } else {
            System.out.println("NU ESTE IN REGULA");
        }

        System.out.println();
        System.out.println("mai vreti sa dati optiuni da(d) sau nu(n) ? ");
        Scanner s = new Scanner(System.in);
        String q1 = s.nextLine();
        byte var8 = -1;
        switch (q1.hashCode()) {
            case 100:
                if (q1.equals("d")) {
                    var8 = 1;
                }
                break;
            case 3197:
                if (q1.equals("da")) {
                    var8 = 0;
                }
        }

        switch (var8) {
            case 0:
            case 1:
                this.proba();
            default:
                System.out.print("dati un feedback va rog 1-10: ");
                s.nextLine();
                System.out.println("O zi excelenta!!!");
                System.exit(0);
        }
    }
}
