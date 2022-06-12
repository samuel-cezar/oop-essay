import java.util.List;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class GerCar {

	private Carro car;
	private List<Carro> bdCar = new ArrayList<Carro>();

	public List<Carro> getbdCar() {
		return bdCar;
	}

	public Carro cadastraCarro(Carro car) {

		if (consultaCarro(car) == null) {
			bdCar.add(car);
			return car;
		} else {
			return null;
		}

	}

	public Carro consultaCarro(Carro car) {
		for (int i = 0; i < bdCar.size(); i++) {
			if (this.car.getPlaca() == bdCar.get(i).getPlaca()) {
				return bdCar.get(i);
			}
		}
		return null;
	}

	public Carro excluiCarro(Carro car) {
		car = consultaCarro(car);
		if (car != null) {
			bdCar.remove(car);
			return null;
		} else {
			return car;
		}

	}// fim excluiCarro

	public Carro atualizaCarro(Carro car) {
		for (int i = 0; i < bdCar.size(); i++) {
			if (car.getPlaca() == bdCar.get(i).getPlaca()) {
				String nome = JOptionPane.showInputDialog(null, "Informe o novo modelo", "Atualização",
						JOptionPane.QUESTION_MESSAGE);
				car.setModelo(nome);
				bdCar.set(i, car);
				return bdCar.get(i);
			}
		}
		return null;
	}// fim atualizaCar

}// fim da classe