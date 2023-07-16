
import java.awt.Color;
import java.util.*;
public class Main{
	

	//main is always static because it doesn't rely on any instance member
	public static void main(String[] args) {
		
		Tree myFavoriteOakTree = new Tree(25, 5, TreeType.OAK);
        Tree myFavoriteMapleTree = new Tree(90,30, TreeType.MAPLE);
        
        
        // creation of this announceTallTree method  created this behavior for the Tree class 
        //where we know don't need the code below making this all much cleaner
        myFavoriteOakTree.announceTallTree();
   		System.out.println(myFavoriteMapleTree.getTreeType());
    	System.out.println(myFavoriteMapleTree.getHeightFt());
    	System.out.println(myFavoriteMapleTree.getTrunkDiamterInches());
    	myFavoriteMapleTree.grow();
    
		
 		Employee Jimmy = new Employee(10, "jimmy", 5000, Locations.Boston);
        
        System.out.println(Jimmy);

        
        System.out.println(Jimmy.salary);
        
        Jimmy.raiseSalary(2000);
        System.out.println(Jimmy.salary);
	}
}

 








































































