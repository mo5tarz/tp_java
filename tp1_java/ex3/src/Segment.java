
public class Segment {
	Point eDr,eGa;
	void Deplacer_Abs(float a) {
		eDr.Deplacer(eDr.x+a, eDr.y);
		eGa.Deplacer(eGa.x+a, eGa.y);
		
	}
	void Deplacer_Ord(float b) {
		eDr.Deplacer(eDr.x, eDr.y+b);
		eGa.Deplacer(eGa.x, eGa.y+b);
		
	}
	float Longueur() {
		return (float) Math.sqrt(((eDr.x-eGa.x)*(eDr.x-eGa.x))+((eDr.y-eGa.y)*(eDr.y-eGa.y)));
	}
	

	public void Afficher() {
		System.out.println("Segment [extremiteDroite=(" + eDr.x +","+ eDr.y + "), extremiteGauche=(" + eGa.x + "," +eGa.y + ")]");
	}
	Segment(Point eDr,Point eGa){
		this.eDr=eDr;
		this.eGa=eGa;
	}
}
