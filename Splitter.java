
import net.sourceforge.interval.ia_math.IAException;
import net.sourceforge.interval.ia_math.RealInterval;


public abstract class Splitter {
	public abstract Box[] splitIt(Box box);
	
	protected Box[] splitSide(Box box, int sideNum, double proportion) {
		// TODO split in proportion!
		if (proportion != 0.5)
			throw new IAException("NOT IMPLEMENTED!");
		
		Box result[] = new Box[2];
		Box one = box.clone();
		Box two = box.clone();
		
		RealInterval side = box.getInterval(sideNum);
		double cutPoint = ( side.hi() - side.lo() ) / 2 + side.lo(); //
		RealInterval left  = new RealInterval( side.lo(),  cutPoint);
		RealInterval right = new RealInterval( cutPoint, side.hi() );
		
		one.setInterval(sideNum, left);
		two.setInterval(sideNum, right); //
		
		result[0] = one;
		result[1] = two;
		
		return result;		
	}
	protected Box[] splitSide(Box box, int sideNum) {
		return splitSide(box, sideNum, 0.5);
	}
}