package com.aubay.busca.profundidade;

import org.graphstream.graph.Graph;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class No {
    private Set<No> adjacentes = new HashSet<>();
    private Cor cor;
    private String name;

    private Graph graph;

    public No(String name) {
        this.name = name;
        cor = new Verde();
    }

    public No(String name, Graph graph) {
        this(name);
        this.graph = graph;
        this.graph.addNode(name);
        this.graph.getNode(name).setAttribute("ui.color", cor.getColor());
    }

    public void buscaProfundidade(List<No> lista) {
        cor.busca(this, lista);
    }

    public Set<No> getAdjacentes() {
        return adjacentes;
    }

    public void addAdjacentes(No adj) {
        adjacentes.add(adj);
        if(this.graph != null)
            graph.addEdge(String.format("%s_%s", this.name, adj.name), this.name, adj.name);
    }

    public void setCor(Cor cor, List<No> list) {
        this.cor = cor;
        cor.assumiu(this, list);
        if(this.graph != null)
            graph.getNode(name).setAttribute("ui.color", cor.getColor());
    }

    public String toString() {
        return name;
    }

}
