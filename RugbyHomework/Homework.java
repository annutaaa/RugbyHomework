import java.util.Random;

public class Homework {
    public static void main(String[] args) {
        int[] firstTeam = new int[25];
        Random randomyears = new Random();
        int[] secondTeam = new int[25];
        for (int index = 0; index < firstTeam.length; index++) {
            firstTeam[index] = randomyears.nextInt(22) + 18;
            secondTeam[index] = randomyears.nextInt(22) + 18;
        }
        for (int i = 0; i < firstTeam.length; i++) {
            System.out.print(firstTeam[i] + " ");
        }
        System.out.print("\n");
        for (int y = 0; y < secondTeam.length; y++) {
            System.out.print(secondTeam[y] + " ");
        }
        int avg1 = 0;
        int avg2 = 0;
        for (int i= 0; i<firstTeam.length; i++) {
            avg1 += firstTeam[i];
            avg2 += secondTeam[i];

        }
        System.out.println(" \n");
        System.out.println( "среднее арифметическое 1 команды: " + avg1/25 );
        System.out.println("среднее арифметическое 2 команды: " + avg2/25 );

    }
}

