
import model.Engineer;
import model.Teacher;
import model.TruckDriver;
import model.ZooKeeper;

public class JobBoard {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Engineer sam = new Engineer();
		System.out.println(sam.speak());
		
		Teacher dawn = new Teacher();
		System.out.println(dawn.speak());
		
		TruckDriver samantha = new TruckDriver();
		System.out.println(samantha.speak());
		
		ZooKeeper michelle = new ZooKeeper();
		System.out.println(michelle.speak());
		
		Teacher uday = new Teacher();
		System.out.println(uday.speak());
		
	}

}
