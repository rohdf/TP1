/* @Auteur: Rohdri FRIMAT */
/* Date: 01/09/2016 */

package nsis.metier;

public class Point {
 private int x = 0;
 private int y = 0;


public Point(int x, int y) {
       
       this.x = x;
       this.y = y;
}


public Point() {
       
       this.x = 0;
       this.y = 0;
}

 public int getX() {
  return x;
 }

 public void setX(int x) {
  this.x = x;
 }

 public int getY() {
  return y;
 }

 public void setY(int y) {
  this.y = y;
 }

 public String toString(){
 	return "x="+x+", y="+y;
 }
}