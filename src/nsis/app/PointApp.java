/* @Auteur: Rohdri FRIMAT */
/* Date: 01/09/2016 */

/*
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
Travail dirigé à réaliser
	1-Créer un simple programme Java (PointApp) qui affiche sur la console les coordonnées de trois instances de la classe Point.
	2-Ensuite créer la classe Espace
		Cette classe possède :
			un tableau de 100 points en attribut de classe,
			une méthode publique permettant d'ajouter un nouveau point au tableau de l'espace,
			une méthode permettant d'afficher tous les points du tableau de l'espace.
		Ajouter le package nsis.metier aux classes Point et Espace.
		Ajouter le package nsis.app à la classe exécutable PointApp.
	3-Réécrire la classe PoinApp afin d'utiliser une instance de la classe Espace pour ajouter et afficher trois points.
~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
*/

package nsis.app;

import nsis.metier.Point;
import nsis.metier.Espace;

public class PointApp{
	public static void main(String[] args){
		Point p1 = new Point(1,2);
		Point p2 = new Point(3,4);
		Point p3 = new Point(5,6);

		System.out.println("p1="+p1);
		System.out.println("p1="+p2);
		System.out.println("p1="+p3);


		Espace espace = new Espace();
		espace.addPoint(0,p1);
		espace.addPoint(1,p2);
		espace.addPoint(2,p3);
		for(int i=3; i<espace.getPoints().length; i++)
			espace.addPoint(i,new Point(i+1,i-1));

		espace.display();
	}
}