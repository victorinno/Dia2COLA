package com.aubay.trafego.aerio;

import org.graphstream.graph.Graph;
import org.graphstream.graph.Node;

public class TrechoSimples implements TrechoAereo {
    private String origem;
    private String destino;
    private double preco;

    public TrechoSimples(String origem, String destino, double preco) {
        this.origem = origem;
        this.destino = destino;
        this.preco = preco;
    }

    public String getOrigem() {
        return origem;
    }

    public String getDestino() {
        return destino;
    }

    public double getPreco() {
        return preco;
    }

    @Override
    public void print(Graph graph) {
        if (graph.getNode(origem) == null) {
            graph.addNode(origem);
            Node node = graph.getNode(origem);
            node.setAttribute("ui.label", node.getId());
        }
        if (graph.getNode(destino) == null) {
            graph.addNode(destino);
            Node node = graph.getNode(destino);
            node.setAttribute("ui.label", node.getId());
        }

        String edgeId = origem + "_" + destino;
        if(graph.getEdge(edgeId) == null)
            graph.addEdge(edgeId, origem, destino, true);

    }
}
