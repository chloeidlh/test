/**
 * Created by sata on 19/05/2016.
 */
public class Triangle {


    public static boolean estQuelconque(int a, int b, int c) {
        boolean resultat = false;
        resultat = !estIsocele(a, b, c);
        return resultat;
    }

    public static boolean estEquilateral(int a, int b, int c) {
        boolean resultat = false;
        resultat = (a == b) && (b == c);
        return resultat;
    }

    public static boolean estIsocele(int a, int b, int c) {
        boolean resultat = false;
        resultat = (a == b) || (a == c) || (b == c);

        return resultat;
    }

    public static void main(String args[]) {
        System.out.println(" le triangle 2 2 3 est isocele ? " +
                estIsocele(2, 2, 3));
        System.out.println(" le triangle 1 2 3 est isocele ? " +
                estIsocele(1, 2, 3));
        System.out.println(" le triangle 2 2 3 est equilateral ? " +
                estEquilateral(2, 2, 3));
        System.out.println(" le triangle 2 2 2 est equilateral ? " +
                estEquilateral(2, 2, 2));
        System.out.println(" le triangle 2 2 3 est Quelconque? " +
                estQuelconque(2, 2, 3));
        System.out.println(" le triangle 1 2 3 est quelconque ? " +
                estQuelconque(1, 2, 3));

    }


}
