package cn.lishiwei.learn.lesson_2_Tree;


public class Main {


    public static void main(String[] args) {

        Integer[] array = new Integer[]{4, 2, 7, 6, 5, 8};

        NodeTree root = new NodeTree(array[0], null, null);;

        for (int i = 1; i < array.length; i++) {
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
