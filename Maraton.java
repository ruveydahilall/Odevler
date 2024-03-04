public class Maraton {
    private final String [] runnerName;
    private final int [] degrees;
    public Maraton(String [] runnerName, int[] degrees) {
        this.runnerName = runnerName;
        this.degrees = degrees;
    }

    public String [] getRunnerName() {
        return runnerName;
    }

    public void displayMessage() {
        System.out.println();
        System.out.println("İsim" + "\t" + "Derece(Dakika)");
    }

    public void processDegrees() {
        outputDegrees(); //Koşucular ve süreleri

        System.out.println();

        System.out.println("Birinci: " + " " + getFirst());
        System.out.println("İkinci: " + " " + getSecond());
        System.out.println("Üçüncü: " + " " + getThird());

        System.out.println();

        outputGrouping();
    }

    public void outputDegrees() {
        for (int runner = 0; runner < degrees.length; runner++) {
            System.out.println(runnerName[runner] + " : " + degrees[runner]);
        }
    }

    public int getFirst() {
        int firstDegree = degrees[0];

        for (int degree : degrees)
            if (degree < firstDegree)
                firstDegree = degree;
        return firstDegree;
    }

    public int getSecond() {
        int secondDegree = degrees[0];
        for (int degree : degrees)
            if (getFirst()<degree && degree<secondDegree)
                secondDegree = degree;
        return secondDegree;
    }

    public int getThird() {
        int thirdDegree = degrees[0];
        for (int degree : degrees)
            if (getSecond()<degree && degree<thirdDegree)
                thirdDegree = degree;
        return thirdDegree;
    }

    public void outputGrouping() {
        int A = 0;
        int B = 0;
        int C = 0;

        for (int degree : degrees) {
            if (200 <= degree && degree < 300) {
                A = A + 1;
            }
            else if (300 <= degree && degree < 400){
                B = B + 1;
            } else if (400<= degree) {
                C = C + 1;
            }
        }
        System.out.println("A-> " +A);
        System.out.println("B-> " +B);
        System.out.println("C-> " +C);
    }

}