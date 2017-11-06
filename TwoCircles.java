
public class TwoCircles {

	
	public static String twocircles(String tokens){
		String points[] = tokens.split(" ");
		int X1 = Integer.parseInt(points[0]);
		int Y1 = Integer.parseInt(points[1]);
		int R1 = Integer.parseInt(points[2]);
		int X2 = Integer.parseInt(points[3]);
		int Y2 = Integer.parseInt(points[4]);
		int R2 = Integer.parseInt(points[5]);
 
		double distance = Math.pow((X1 - X2) * (X1 - X2) + (Y1 - Y2) * (Y1 - Y2), 0.5);
		System.out.println("distance "+distance);
	    if (R2 >= R1 && distance <= (R2 - R1)){
	        return "Touching";
	    }
	    else if (R1 >= R2 && distance <= (R1 - R2) ) {
	        return "Concentric";
	    }
	    else if (distance > (R1 + R2)){
	        return "Disjoint-Outside";
	    }
	    else {
	        return "Intersecting";
	    }
	}
	public static void main(String[] args) {
		 String status = twocircles("12 0 24 14 0 23");
		    System.out.println(status);
	}

}
