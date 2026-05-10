public class Q15_RandomMatrix{
    public static void main(String[] args){

        int[][] a = new int[4][4];

        for(int i=0; i<4; i++){
            for (int j=0; j<4; j++){

                a[i][j]=(int)(Math.random()*2);

                System.out.print(a[i][j]+ " ");
            }
            System.out.println();
        }
        int rowIndex=0;
        int maxRow=0;

        for(int i=0; i<4; i++){
            int count=0;
            for(int j=0; j<4; j++){
                count+=a[i][j];
            }
            if(count>maxRow){
                maxRow=count;
                rowIndex=i;
            }
        }
        int colIndex=0;
        int maxCol=0;

        for(int j=0; j<4; j++){
            int count=0;
            for(int i=0; i<4; i++){
                count+=a[i][j];
            }
            if(count>maxCol){
                maxCol=count;
                colIndex=j;
            }
        }

        System.out.println("Largest row index: " + rowIndex);
        System.out.println("Largest column index: " + colIndex);
    }
}