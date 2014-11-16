package PrototypeDesignpatternPackages;

public class PrototypePatternDemo {
	public static void main (String[] args){
		ShapeCache.loadCache();
		
		Shape clonedShape = (Shape)ShapeCache.getShape("1");
		System.out.println("Shape : " + clonedShape.getType());
		
		Shape cloShape2 = (Shape)ShapeCache.getShape("2");
		System.out.println("Shape : " + cloShape2.getType());
		
		Shape clonedShape3 = (Shape)ShapeCache.getShape("3");
		System.out.println("Shape : " + clonedShape3.getType());
	}

}
