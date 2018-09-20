import java.util.ArrayList;
public class PrintMatrixByClockwise {
    public static void main(String args []){
        int [][] matrix ={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        PrintMatrixByClockwise printMatrixByClockwise = new PrintMatrixByClockwise();
        ArrayList<Integer> list = printMatrixByClockwise.printMatrix(matrix);
        System.out.println(list);
    }
    public ArrayList<Integer> printMatrix(int [][] matrix){
        ArrayList<Integer> list =new ArrayList<>();
        if(matrix==null){
            return list;
        }
        int start=0;
        int colunms=matrix.length;
        int rows=matrix[0].length;
        if(colunms<=0 | rows <=0){
            return list;
        }
        while (colunms> start *2 && rows> start*2){
            printCircle(list,start,matrix,colunms-1,rows-1);
            start++;
        }
        return list;
    }
    public void printCircle(ArrayList<Integer> list ,int start,int [][] matrix,int colunmend,int rowend) {
        int i =0;
        for(i=start;i<colunmend;i++){
            list.add(matrix[start][i]);
        }
        if(rowend>start && i==colunmend){
            for (i=start;i<rowend;i++){
                list.add(matrix[i][colunmend]);
            }
        }
        if(colunmend>start && i==rowend){
            for (i=colunmend;i>start;i--){
                list.add(matrix[rowend][i]);
            }
            for (i=rowend;i>start;i--){
                list.add(matrix[i][start]);
            }
        }



    }
}
