public class Test02 {
    public static void main(String[] args) {
        //冒泡排序
        int [] arrys={1,34,56,67,78,90,3,2};
        for(int i=0;i<arrys.length-1;i++){
            int max=arrys[0];
            for (int j=1;j<arrys.length-1-i;j++){
                if(arrys[j]>arrys[j+1]){
                    max=arrys[j+1];
                    arrys[j+1]=arrys[j];
                    arrys[j]=max;
                }
            }
        }
        for (int i=0;i<arrys.length;i++){
            System.out.println("\t"+arrys[i]);
        }
    }
}
