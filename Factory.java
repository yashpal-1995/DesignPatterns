package practice.lld.machine.coding;

/**
 * Factory Design Pattern { Creational Design pattern }
 * here we create object without exposing the creation logic to the client
 * @author Yash
 *
 */
interface Shape{
	void draw();
}
class Square implements Shape{
	
	@Override
	public void draw(){
		System.out.println("draw Square");
	}
}
class Circle implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw Circle");
	}
	
}
class Rectange implements Shape{

	@Override
	public void draw() {
		// TODO Auto-generated method stub
		System.out.println("draw Rectangle");
	}
	
}
class ShapeFactory{
	
	// use getShape method to get object of type shape
	public Shape getShape(String shapeType){
		
		if(shapeType.equalsIgnoreCase("square")){
			return new Square();
		}else if(shapeType.equalsIgnoreCase("rectangle")){
			return new Rectange();
		}else if(shapeType.equalsIgnoreCase("circle")){
			return new Circle();
		}
		return null;
	}
}
public class Factory {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         
		ShapeFactory shapeFactory = new ShapeFactory();
		
		Shape shape1 = shapeFactory.getShape("square");
		shape1.draw();
		
		Shape shape2 = shapeFactory.getShape("rectangle");
		shape2.draw();
		
		Shape shape3 = shapeFactory.getShape("circle");
		shape3.draw();
		
	}

}
