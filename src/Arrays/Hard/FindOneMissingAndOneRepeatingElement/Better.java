package Arrays.Hard.FindOneMissingAndOneRepeatingElement;

public class Better {
    public static void main(String[] args) {
        int[] arr={3,1,2,5,4,6,7,5};
        int missing=-1;
        int repeating=-1;
        int[] temp=new int[arr.length+1];
        for(int a:arr){
            temp[a]++;
        }
        for(int i=1;i< temp.length;i++){
            if(temp[i] == 0) missing=i;
            else if (temp[i] == 2) {
                repeating=i;
            }
            if(missing != -1 && repeating != -1) break;
        }
        System.out.println("["+repeating+","+missing+"]");
    }
}
