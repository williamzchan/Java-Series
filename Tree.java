import java.awt.Color;
import java.util.*;

public class Tree {
	//attributes
	//non-static attributes because a tree must be created to access these attributes
	private double heightFt;
	private double trunkDiameterInches;
	private TreeType treeType;
	//static
	//static String TRUNK_COLOR =  "BROWN";
	protected static Color TRUNK_COLOR = new Color(102, 51,0 );
	//constructor
	public Tree(double heightFt, double trunkDiamterInches, TreeType treeType){
		
		this.heightFt = heightFt;
		this.trunkDiameterInches = trunkDiamterInches;
		this.treeType = treeType;
		
	}
	//behavior
	public void grow() {
		this.heightFt = this.heightFt + 10;
		this.trunkDiameterInches = this.trunkDiameterInches + 1;
	}
	//non-static method because it uses an instances treeType and height
	//instance members are the same as non-static member
	public void announceTallTree() {
		if(this.heightFt > 100) {
			System.out.println("That's a tall tree " + this.treeType + " tree!");
		}else {
			System.out.println("short tree");
		}
	}
	//is static because note how there is no instance methods or attributes in its implementation
	static void announceTree() {
		System.out.println("Look out for that tree!");
		
	}
	
	public double getHeightFt() {
		
		return this.heightFt;
	}
	
	public TreeType getTreeType() {
		
		return this.treeType;
	}
	
	public double getTrunkDiamterInches() {
		return this.trunkDiameterInches;
		
	}
	
	public void setTrunkDiameterInches(double trunkDiameterInches) {
		this.trunkDiameterInches = trunkDiameterInches;
	}
	
}
