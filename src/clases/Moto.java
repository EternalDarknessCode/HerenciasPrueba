package clases;

public class Moto extends Vehiculo {
	

	private boolean tieneSidecar;
	
	//Constructor
	public Moto(String matricula, int caballos, boolean tieneSidecar) {
		super(matricula, caballos);
		// TODO Auto-generated constructor stub
		this.tieneSidecar = tieneSidecar;
	}

	public boolean isTieneSidecar() {
		return tieneSidecar;
	}

	public void setTieneSidecar(boolean tieneSidecar) {
		this.tieneSidecar = tieneSidecar;
	}
	
	//setDatos
		public void setDatos() {
			super.setDatos();
			System.out.println("Tiene sidecar: ");
			tieneSidecar = sc.next().equalsIgnoreCase("si");
		}

		@Override
		public String toString() {
			return "Es una Moto, con matricula " + super.getMatricula() + " y los caballos " + super.getCaballos() +  "[tieneSidecar=" + tieneSidecar + "]";
		}
	
}

