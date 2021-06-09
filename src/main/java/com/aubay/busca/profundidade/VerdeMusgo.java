package com.aubay.busca.profundidade;

import java.util.List;

public class VerdeMusgo extends Cor {
    void assumiu(No no, List<No> lista) {
        for(No adj : no.getAdjacentes())
            adj.buscaProfundidade(lista);
       
        no.setCor(new Vermelho(), lista);
    }

    @Override
    public Float getColor() {
        return 0.5f;
    }
}
