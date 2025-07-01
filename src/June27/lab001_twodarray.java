package June27;

public class lab001_twodarray {
    public static void main(String[] args) {
        //int [][] array_2_d={
               // {1,2,3},
               // {4,5,6},
               // {7,8,9}

       // };
    //int [][]array;
   // array=new int[][]{
          // {1,2,3},
           // {4,5,6}
    //};
    int[][] array_2={{1,2,3},{3,4,5},{5,6,7}};

//array_2[0][0]=1;
//array_2[0][1]=2;
//array_2[1][0]=3;
//array_2[1][1]=4;
//array_2[2][0]=5;
//array_2[2][1]=6;
        System.out.println(array_2.length);
for (int i=0;i<array_2.length;i++){
    for(int j=0 ;j<array_2[i].length;j++) {
        System.out.print(array_2[i][j]+" | ");
    }
    System.out.println("");
}

    }

}
