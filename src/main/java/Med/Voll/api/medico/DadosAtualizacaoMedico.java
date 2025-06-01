package Med.Voll.api.medico;

import Med.Voll.api.endereco.DadosEndereco;
import Med.Voll.api.endereco.Endereco;
import jakarta.validation.constraints.NotNull;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
