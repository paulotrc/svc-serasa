package br.paulotrc.svcserasa.entites;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigDecimal;
import java.util.UUID;

@Getter
@Builder
@AllArgsConstructor
@Document //Anotação mongo para mapeamento do document.
public class Serasa {

    @Id
    private UUID id = UUID.randomUUID();
    private String nome;
    private String cpf;
    private String ddd;
    private String telefone;
    private Boolean temImovel;
    private Boolean temAutomovel;
    private BigDecimal renda;
}

