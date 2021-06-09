package com.aubay.trafego.aerio;

import org.graphstream.graph.Graph;

public interface TrechoAereo {
    String getOrigem();
    String getDestino();
    double getPreco();

    void print(Graph graph);
}
