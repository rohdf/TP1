/* @Auteur: Rohdri FRIMAT */
/* Date: 01/09/2016 */

package nsis.metier;

public class Espace{
	private Point[] points;

	public Espace(){
		this.points=new Point[100];
	}

	public void addPoint(int i, Point point){
		if(i<points.length)
			points[i] = point;
		else
			System.out.println("ERREUR: Le Espace ne peut prendre plus de point");
	}

	public void display(){
		System.out.println("Affichage des points de l'espace");
		for(int i=0; i<points.length; i++){
			System.out.println("p"+i+"= ("+points[i]+")");
		}
	}

	public Point[] getPoints(){
		return this.points;
	}

	public void setPoints(Point[] points){
		this.points=points;
	}

}