package Algorithm4;

import java.util.ArrayList;
import java.util.List;

public class TreeSearch {
    public class Tree {
        Node root;

//        public boolean exist(int value) {
//            Node node = find(value, root);
//            if (node != null) {
//                return true;
//            } else {
//                return false;
//            }
//        }
// обход дерева в глубину
//        private Node find(int value, Node node) {
//            if (root != null) {
//                if (node.value == value) {
//                    return node;
//                } else {
//                    for (Node child : node.children
//                    ) {
//                        Node result = find(value, child);
//                        if (result != null) {
//                            return node;
//                        }
//                    }
//                }
//            }
//            return null;
//        }

        // обход дерева в ширину
        private Node find(int value) {
            List<Node> line = new ArrayList<>();
            line.add(root);
            while ((line.size() > 0)) {
                List<Node> nextLine = new ArrayList<>();
                for (Node node : line
                ) {
                    if (node.value == value) {
                        return node;
                    } else {
                        nextLine.addAll(node.children);
                    }
                    line = nextLine;
                }
            }
            return null;
        }

        public class Node {
            int value;
            List<Node> children;

        }
    }
}
