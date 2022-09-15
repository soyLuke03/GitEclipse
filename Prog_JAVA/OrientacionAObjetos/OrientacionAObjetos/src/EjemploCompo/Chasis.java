package EjemploCompo;

import java.util.Objects;

public class Chasis {

	private Integer codigoChasis;

	@Override
	public int hashCode() {
		return Objects.hash(codigoChasis);
	}

	@Override
	public boolean equals(Object obj) {
		boolean sonIguales = false;
		Chasis other = (Chasis) obj;
		if (this == obj)
			return sonIguales = this.codigoChasis.equals(other.codigoChasis);

		else if (getClass() != obj.getClass())
			return sonIguales= this.codigoChasis.equals(other.codigoChasis);
		
		else if (obj != null) {
			sonIguales = this.codigoChasis.equals(other.codigoChasis);
			return sonIguales;
		}
		return sonIguales = this.codigoChasis.equals(other.codigoChasis);
	}
}
