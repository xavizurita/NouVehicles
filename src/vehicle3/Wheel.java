package vehicle3;

public class Wheel {
	private String brandWheel;
	private double diameterDavant, diameterDavantDreta, diameterDavantEsquerra;
	private double diameterDarrera, diameterDarreraDreta, diameterDarreraEsquerra;
	

	
	public Wheel(String brandWheel, double diameterDavantDreta, double diameterDavantEsquerra, double diameterDarreraDreta, double diameterDarreraEsquerra) {
		super();
		this.brandWheel = brandWheel;
		this.diameterDavantDreta = diameterDavantDreta;
		this.diameterDavantEsquerra = diameterDavantEsquerra;
		this.diameterDarreraDreta = diameterDarreraDreta;
		this.diameterDarreraEsquerra = diameterDarreraEsquerra;	
	}
	
	public Wheel(String brandWheel, double diameterDavant, double diameterDarrera) {	// metode sobreescrit per les rodes de la bici
		super();
		this.brandWheel = brandWheel;
		this.diameterDavant = diameterDavant;
		this.diameterDarrera = diameterDarrera;	

	}

	
	public double getDiameterDavant() {
		return diameterDavant;
	}

	public void setDiameterDavant(double diameterDavant) {
		this.diameterDavant = diameterDavant;
	}

	public double getDiameterDarrera() {
		return diameterDarrera;
	}

	public void setDiameterDarrera(double diameterDarrera) {
		this.diameterDarrera = diameterDarrera;
	}

	public String getBrandWheel() {
		return brandWheel;
	}

	public void setBrandWheel(String brandWheel) {
		this.brandWheel = brandWheel;
	}

	public double getDiameterDavantDreta() {
		return diameterDavantDreta;
	}

	public void setDiameterDavantDreta(double diameterDavantDreta) {
		this.diameterDavantDreta = diameterDavantDreta;
	}


	public double getdiameterDavantEsquerra() {
		return diameterDavantEsquerra;
	}

	public void setdiameterDavantEsquerra(double diameterDavantEsquerra) {
		this.diameterDavantEsquerra = diameterDavantEsquerra;
	}
	
	public double getDiameterDarreraDreta() {
		return diameterDarreraDreta;
	}

	public void setDiameterDarreraDreta(double diameterDarreraDreta) {
		this.diameterDarreraDreta = diameterDarreraDreta;
	}

	public double getDiameterDarreraEsquerra() {
		return diameterDarreraEsquerra;
	}

	public void setDiameterDarreraEsquerra(double diameterDarreraEsquerra) {
		this.diameterDarreraEsquerra = diameterDarreraEsquerra;
	}

	@Override
	public String toString() {
		return "Marca ==> " + brandWheel + " - D Davant dreta ==> " + diameterDavantDreta + " - - D Davant esquerra ==> " + diameterDavantEsquerra + " - - D Darrera Dreta ==> " + diameterDarreraDreta + " - - D Darrera Esquerra ==> " + diameterDarreraEsquerra + " ";
	}

	public String toStringBike() {
		return "Marca ==> " + brandWheel + " - D Davant ==> " + diameterDavant +  " - - D Darrera  ==> " + diameterDarrera;
	}

	

}

