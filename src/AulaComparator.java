import java.util.Comparator;

public class AulaComparator implements Comparator <Catedra> {

	@Override
	public int compare(Catedra o1, Catedra o2) {
		// TODO Auto-generated method stub
		return o1.getNroDeAula()-o2.getNroDeAula();
	}

}
