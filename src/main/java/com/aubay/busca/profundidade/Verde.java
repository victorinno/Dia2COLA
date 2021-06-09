package com.aubay.busca.profundidade;

import java.util.List;

public class Verde extends Cor {
    public void busca(No no, List<No> lista) {
        no.setCor(new VerdeMusgo(), lista);
    }

    @Override
    public Float getColor() {
        return 0.0f;
    }
}
