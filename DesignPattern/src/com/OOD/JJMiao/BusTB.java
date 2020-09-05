package com.OOD.JJMiao;

public class BusTB implements TransportBehavior {
    final String type = "riding bus";

    public PathNode buildPath(Location A, Location B) {
        PathNode startPathNode = new PathNode(A);

        System.out.println("Building " + type + " path from " + A + " to " + B );

        return startPathNode;
    }
}