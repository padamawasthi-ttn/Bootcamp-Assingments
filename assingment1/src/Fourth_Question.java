/*
Create a two dimensional array of integers and display:

1. sum of all elements of each column
2. sum of all elements of each row
 */

public class Fourth_Question {
    public static void main(String[] args) {

        int[][] arr = new int[2][2];

        arr[0][0]= 1;
        arr[0][1]=2  ;
        arr[1][0]= 3;
        arr[1][1]=4;

        System.out.println("The 2-D Array is = \n");
        for(int i=0; i<2; i++){
            for (int j=0;j<2;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }

        for (int i=0;i<2;i++){
            double rowSum =0;
            for(int j=0;j<2;j++){
                rowSum += arr[i][j];
            }
            System.out.println("Row Sum = "+ rowSum);
        }


        for (int i=0;i<2;i++){
            double colSum =0;
            for(int j=0;j<2;j++){
               colSum += arr[j][i];
            }
            System.out.println("Column sum =" +colSum );
            colSum=0;
        }


    }
}
