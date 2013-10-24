package subclass;

public class Shape
{
	public String draw()
	{
		return "draw Shape";
	}

	public String drawShape(Shape shape)
	{
		if ( shape instanceof Circle)
		{
			Circle c = (Circle)shape;
			return "Circle :" + c.draw();
		}
		return shape.draw();
	}
}
