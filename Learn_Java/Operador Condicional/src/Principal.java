//Este programa calcula un decuento del 5% si el precio es <50 y del 10% si es>=100.
public class Principal {

	public static void main(String[] args) {
		float precio = 50.40F;
		//(condición) ? ExpresionSiVerdad : ExpresionSiFalso;
		float descuento = (precio<50F)?precio*0.05F:precio*0.10F;
		System.out.println("Precio: "+precio);
		System.out.println("Descuento: "+descuento);
		System.out.println("Total: "+(precio-descuento));
	}
}
