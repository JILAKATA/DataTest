import java.util.*;
import java.io.*;

public class TestData {
    public static void main(String[] args) throws IOException{
        System.out.println("Este programa creara un archivo, donde escribira un matrix de numeros al azar del 1 a 90");

        System.out.println("Esoge un numero, para la dimencion del matriz");

        //Creates a Scanner object named input
        Scanner input = new Scanner(System.in);

        //It will store your number on the variable named maxValue, remember it has to be an integer!!!
        int maxValue = input.nextInt();

        //Create a integer variable named val, so it can store the random numbers and printing as matrix form
        int val;

        //Create a file named testData.dat
        String file = "testData.dat";

        //Creating a Random object named rand
        Random rand  = new Random();

        //Creates a FileWriter object named newFile
        FileWriter newfile = new FileWriter(file);

        //Creataes a BufferedWriter object named newbufer
        BufferedWriter newbufer = new BufferedWriter(newfile);

        //Creates a PrintWriter objectmaned printfile
        PrintWriter printfile = new PrintWriter(newbufer);

        /*This for loop will create a matrix n*n, or in other words maxValue * maxValue */

        //Creating the column
        for(int i = 1; i <= maxValue; i++){
            //Creating the raw
            for(int j = 1; j <= maxValue; j++){

                //Generating numbers from 10 until 90 and stored it on val
                val = rand.nextInt (90) + 10;

                //Printing the numbers val on the file named testData.dat
                printfile.print(val + "  ");
            }

            //Printing the numbers line by line, in matrix form
            printfile.println();
        }

        //Closing the file
        printfile.close();

        System.out.println("El archivo  fue creao pecao degraciao...:p " + file);
    }
}
