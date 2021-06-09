package com.aubay.trafego.aerio;

import org.graphstream.graph.Graph;
import org.graphstream.graph.implementations.SingleGraph;

public class TrechoAereoMain {

    public static void main(String[] args) {
        TrechoSimples ts1 = new TrechoSimples("Lisboa", "São Paulo", 500);
        TrechoSimples ts2 = new TrechoSimples("São Paulo", "Recife", 300);
        TrechoSimples ts3 = new TrechoSimples("Recife","Natal", 350);
        TrechoComposto tc1 = new TrechoComposto(ts2, ts3, 30);
        TrechoComposto tc2 = new TrechoComposto(ts1, tc1, 50);

        System.setProperty("org.graphstream.ui", "swing");
        Graph graph = new SingleGraph("Dia 2");
        tc2.print(graph);
        graph.display();
    }

}
