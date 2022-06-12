/**
Samuel C. dos Santos - 1996789
Prog. Orientada Objetos - Prof. José
*/
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

    public Carro consultaCarro(Carro c1) {
        for (int i = 0; i < bdCar.size(); i++) {
            if (c1.getPlaca().equals(bdCar.get(i).getPlaca())) {
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
    }

    public Carro atualizaCarro(Carro c2) {
        for (int i = 0; i < bdCar.size(); i++) {
            if (c2.getPlaca().equals(bdCar.get(i).getPlaca())) {
                String nome = JOptionPane.showInputDialog(null, "Informe o novo modelo", "Atualização",
                        JOptionPane.QUESTION_MESSAGE);
                c2.setModelo(nome);
                String novaMarca = JOptionPane.showInputDialog(null, "Informe a nova marca", "Atualização",
                        JOptionPane.QUESTION_MESSAGE);
                c2.setMarca(novaMarca);
                String novoAno = JOptionPane.showInputDialog(null, "Informe o novo ano", "Atualização",
                        JOptionPane.QUESTION_MESSAGE);
                c2.setAno(Integer.parseInt(novoAno));

                bdCar.set(i, c2);
                return bdCar.get(i);
            }
        }
        return null;
    }
}
