//interschimbarea primului element din array cu al doilea si apoi interschimbarea primului elem cu ultimul, al doilea cu penultimul si tot asa
// 2 metode de interschimbare, prima fara for si a doua cu for

package interschimbare;

class Teste11 {


    public static void proba() {
        String[] animale = new String[]{"c", "d", "lup", "leu", "pisica", "sobolan", "oposum"};


        for (String a : animale) {
            System.out.print(a + " ");
        }

        //interschimbare fara for; schimba pe primul cu al doilea
        String swap = animale[0];
        animale[0] = animale[1];
        animale[1] = swap;

        System.out.println();

        //interschimbare cu for; schimba pe primul cu ultimul, pe al doilea cu penultimul si tot asa
        for (int i = 0; i < animale.length / 2; i++) {

            String swap1 = animale[i];
            animale[i] = animale[animale.length - 1 - i];
            animale[animale.length - 1 - i] = swap1;
        }


        for (int i = 0; i < animale.length; ++i) {
            System.out.print(animale[i] + " ");
        }

    }

    public static void main(String[] args) {
        proba();
        System.out.println();
    }
}