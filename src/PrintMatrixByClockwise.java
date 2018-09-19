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
        while (colunms>=start *2 && rows>= start*2){
            printCircle(list,start,matrix,colunms-1-start,rows-1-start);
            start++;
        }
        return list;
    }
    public void printCircle(ArrayList<Integer> list ,int start,int [][] matrix,int colunmend,int rowend) {
        for(int i=start;i<=colunmend;i++){
            list.add(matrix[start][i]);
        }
        if(rowend>start){
            for (int i=start+1;i<=rowend;i++){
                list.add(matrix[colunmend][i]);
            }
            for (int i=colunmend-1;i>=start;i--){
                list.add(matrix[i][rowend]);
            }
            for(int i=rowend-1;i>start;i--){
                list.add(matrix[start][i]);
            }
        }


    }
}
