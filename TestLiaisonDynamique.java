package Heritage_Methode_virtuelle;

import java.awt.Point;

public class TestLiaisonDynamique {

	public static void main(String[] args) {
		FigureGeometrique fg;
		Cercle c=new Cercle(new Point(12,13),8);
		Rectangle r=new Rectangle(new Point(14,15),14,8);
		fg=c;
		System.out.println("Perimetre cercle:"+fg.Perimetre());
		fg=r;
		System.out.println("Perimetre rectangle:"+fg.Perimetre());


	}

}
