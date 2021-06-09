package com.aubay.busca.profundidade;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

import java.util.ArrayList;
import java.util.List;

public class GraphMain {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Dia 2");
        graph.setAttribute("ui.stylesheet", String.format("node {fill-mode: dyn-plain;fill-color: green, red;}"));
        graph.display();

        No a = new No("A", graph);

        No b = new No("B", graph);

        No c = new No("C", graph);

        No d = new No("D", graph);

        No e = new No("E", graph);

        No f = new No("F", graph);

        No g = new No("G", graph);

        No h = new No("H", graph);

        a.addAdjacentes(b);

        b.addAdjacentes(c);

        c.addAdjacentes(d);

        d.addAdjacentes(b);

        a.addAdjacentes(e);

        e.addAdjacentes(f);

        f.addAdjacentes(c);

        f.addAdjacentes(g);

        f.addAdjacentes(h);

        a.addAdjacentes(h);

        List<No> l = new ArrayList<>();
        a.buscaProfundidade(l);
        for (No n : l)
            System.out.println(n);



    }
}
