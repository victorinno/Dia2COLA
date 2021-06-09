package com.aubay.trafego.aerio;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

public class TrechoComposto implements TrechoAereo {
    private TrechoAereo primeiro;
    private TrechoAereo segundo;
    private double taxaconexao;

    public TrechoComposto(TrechoAereo primeiro, TrechoAereo segundo,
                          double taxaconexao) {
        this.primeiro = primeiro;
        this.segundo = segundo;
        this.taxaconexao = taxaconexao;
        if (!primeiro.getDestino().equals(segundo.getOrigem()))
            throw new RuntimeException("O destino do primeiro não é igual a origem do segundo");
    }

    public String getOrigem() {
        return primeiro.getOrigem();
    }

    public String getDestino() {
        return segundo.getDestino();
    }

    public double getPreco() {
        return primeiro.getPreco() + segundo.getPreco() +
                taxaconexao;
    }

    @Override
    public void print(Graph graph) {
        primeiro.print(graph);
        segundo.print(graph);
    }
}
