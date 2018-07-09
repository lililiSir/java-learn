package cn.lishiwei.learn.lesson_2_Tree;


public class Main {


    public static void main(String[] args) {

        Integer[] array = new Integer[]{35, 17, 39, 9, 28, 65, 56, 87};

        NodeTree root = null;

        for (int i = 0; i < array.length; i++) {

            NodeTree currentNode = new NodeTree(array[i], null, null);

            if (root == null) {
                root = currentNode;
            }

            root.Insert(root, array[i]);
        }
        System.out.println("先序遍历");
        preOrder(root);
        System.out.println("中序遍历");
        inOrder(root);
        System.out.println("后序遍历");
        postOrder(root);
    }


    public static void preOrder(NodeTree root) {

        if (root != null) {

            System.out.print(root.getData() + "---");

            preOrder(root.getLeftNodeTree());
            preOrder(root.getRightNodeTree());
        }

    }

    public static void inOrder(NodeTree root) {

        if (root != null) {

            inOrder(root.getLeftNodeTree());

            System.out.print(root.getData() + "---");
            inOrder(root.getRightNodeTree());
        }

    }

    public static void postOrder(NodeTree root) {

        if (root != null) {

            postOrder(root.getLeftNodeTree());
            postOrder(root.getRightNodeTree());
            System.out.print(root.getData() + "---");
        }

    }


}
