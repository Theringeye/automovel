package lab.veiculo;

import static org.springframework.web.bind.annotation.RequestMethod.GET;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/veiculo")
public class VeiculoController {

	@Autowired
	private VeiculoServico veiculoService;

	@RequestMapping(value = "/novo", method = POST)
	public Veiculo cadastrar(@RequestBody Veiculo veiculo) {
		return veiculoService.cadastrarVeiculo(veiculo);
	}

	@RequestMapping(value = "/consultar", method = GET)
	public Veiculo consultar(@RequestParam Integer codigo) {
		return veiculoService.consultarVeiculo(codigo);
	}

}
