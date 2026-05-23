package MaxBr221.github.icompras.faturamento.subscriber;

import MaxBr221.github.icompras.faturamento.model.Pedido;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Component;

@Component
@Slf4j
public class GeradorNotaFiscalService {

    public void gerar(Pedido pedido){
        log.info("Gerada nota fiscal para o pedido {} ", pedido.codigo());
    }

}
