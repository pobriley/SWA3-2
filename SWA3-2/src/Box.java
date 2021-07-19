
public class Box {
	
	double width, height, depth;
	  
    Box(Box ob)
    {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
  
    // constructor used when all dimensions
    // specified
    Box(double w, double h, double d)
    {
        width = w;
        height = h;
        depth = d;
    }
  
    // compute and return volume
    double volume()
    {
        return width * height * depth;
    }
}

