public class Exercicio4 {
    public static void main(String[] args) {
        int popA = 80000;
        int popB = 200000;
        int anos = 0;

        while (popA <= popB) {
            popA *= 1.03;
            popB *= 1.015;
            anos++;
        }

        System.out.println("Serão necessários " + anos + " anos para a população de A ultrapassar ou igualar a de B.");
    }
}