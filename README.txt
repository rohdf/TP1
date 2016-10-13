         _|\_-= READ ME =-_/|_

			/////////////\\\\\\\\\\\\\\
			// Auteur: Rohdri FRIMAT \\
			//   Date: 02/09/2016    \\
			/////////////\\\\\\\\\\\\\\

Après réception du fichier compressé, ouvrez un terminal et appliquez les commandes pour:

1/décompresser TP1.tar:

	tar -xvf TP1.tar
	
2/Aller dans le dossier:
  cd TP1/
  
3/Compiler les sources:
  javac -d target/ src/nsis/metier/* src/nsis/app/PointApp.java
 
3/Lancer l'application:
	java -classpath target/ nsis.app.PointApp
