public class Main {
    public static void main(String[] args) {
        String [] nameArray = new String [16];
        nameArray[0] = "Kadir";
        nameArray[1] = "Gökhan";
        nameArray[2] = "Hakan";
        nameArray[3] = "Suzan";
        nameArray[4] = "Pınar";
        nameArray[5] = "Mehmet";
        nameArray[6] = "Ali";
        nameArray[7] = "Emel";
        nameArray[8] = "Fırat";
        nameArray[9] = "James";
        nameArray[10] = "Jale";
        nameArray[11] = "Ersin";
        nameArray[12] = "Deniz";
        nameArray[13] = "Gözde";
        nameArray[14] = "Anıl";
        nameArray[15] = "Burak";

        int [] degreeArray = {341, 273, 278, 329, 445, 402, 388, 270, 243, 334, 412, 393, 299, 343, 317, 265};

        Maraton myMaraton = new Maraton(nameArray, degreeArray);
        myMaraton.displayMessage();
        myMaraton.processDegrees();

    }
}