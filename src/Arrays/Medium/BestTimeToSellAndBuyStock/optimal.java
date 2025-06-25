package Arrays.Medium.BestTimeToSellAndBuyStock;

public class optimal {
// past ko sambal ka rakho aur means here low or min price because
// here i have to buy it ok
// ya par ham na min conserve kiya ha kyo ki hama vo hi btae ga how
// much profit we get .
//har din check kro kya ma aj bhecta to kya hota .
    public static void main(String[] args) {
        int[] arr={7,1,5,3,6,4};
        int min=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int a:arr){
            min=Math.min(min,a);
            maxprofit=Math.max(maxprofit,a - min);
        }
        System.out.println(maxprofit);
    }
}
