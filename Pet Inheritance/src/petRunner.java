import java.util.ArrayList;

public class petRunner
	{
	public static void main(String[] args)
		{
//		Animal [] animal = new Animal [4];
//		animal[0] = new Bat();
//		animal[1] = new Cow();
//		animal[2] = new Penguin();
//		animal[3] = new Robin();
		
		ArrayList <pet> critters = new ArrayList <pet>();
		critters.add(new hamster("John", "seeds", "squeek", "scitter and runs on the wheel", "sleeps in the day, stays up all night"  ));
		critters.add(new hedgehog("Spikes", "bugs and worms", "rolles into a spike ball", "sleepin all day and night" ));
		critters.add(new tortoise());
		critters.add(new gecko());

		for (pet p : critters)
			{	
		
			System.out.println();
			}
		}
	hamster steve = new hamster();
	}