    import java.util.Scanner;
    import java.util.List;
    import java.util.ArrayList;
    
    public class Main {
    	public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the minimum height");
            double minHeight = sc.nextDouble();
            sc.nextLine();
            System.out.println("Enter the maximum weight");
            double maxWeight = sc.nextDouble();
            
            PlayerSelectionSystem pss = new PlayerSelectionSystem();
            ArrayList<String>arr = pss.playersBasedOnHeightWeight(minHeight,maxWeight);
            
            if(arr.isEmpty())
                System.out.println("No players are with minimum height of "+minHeight+ " and maximum weight of "+maxWeight);
            else 
            {
                for(String str : arr)
                    System.out.println(str);
            }
    		// fill your code here
    
    		
    	}
    }
