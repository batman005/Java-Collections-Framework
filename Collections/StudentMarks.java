package Collections;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(maths, physics);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		StudentMarks other = (StudentMarks) obj;
		return maths == other.maths && physics == other.physics;
	}
}
