package com.aubay.busca.profundidade;

import java.util.List;

public class Vermelho extends Cor {
    void assumiu(No no, List<No> list) {
        list.add(no);
    }

    @Override
    public Float getColor() {
        return 1.0f;
    }
}