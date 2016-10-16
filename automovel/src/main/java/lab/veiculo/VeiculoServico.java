package lab.veiculo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VeiculoServico {

	@Autowired
	private VeiculoRepository veiculoRepository;//teste

	public Veiculo cadastrarVeiculo(Veiculo veiculo) {
		return veiculoRepository.save(veiculo);
	}
	
	public Veiculo consultarVeiculo(Integer id) {
		return veiculoRepository.findOne(id);
	}

}
