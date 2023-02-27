package Collections;

public class StudentMarks implements Comparable<StudentMarks> {

	private int maths;
	private int physics;
	@Override
	public String toString() {
		return "StudentMarks [maths=" + maths + ", physics=" + physics + "]";
	}
	
	public int getMaths() {
		return maths;
	}
	public int getPhysics() {
		return physics;
	}
	
	public StudentMarks(int maths, int physics) {
		this.maths = maths;
		this.physics = physics;
	}
	
	@Override
	public int compareTo(StudentMarks o) {
		System.out.println("comparable's to () is called");
		 return o.maths - this.maths;	
	}
	
	
	
}
