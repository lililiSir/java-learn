package cn.lishiwei.learn.lesson_2_Tree;


import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class NodeTree {

    private Integer data;

    private NodeTree leftNodeTree;

    private NodeTree rightNodeTree;

    public Integer getData() {
        return data;
    }

    public void setData(Integer data) {
        this.data = data;
    }

    public NodeTree getLeftNodeTree() {
        return leftNodeTree;
    }

    public void setLeftNodeTree(NodeTree leftNodeTree) {
        this.leftNodeTree = leftNodeTree;
    }

    public NodeTree getRightNodeTree() {
        return rightNodeTree;
    }

    public void setRightNodeTree(NodeTree rightNodeTree) {
        this.rightNodeTree = rightNodeTree;
    }

    public NodeTree(Integer data, NodeTree leftNodeTree, NodeTree rightNodeTree) {
        this.data = data;
        this.leftNodeTree = leftNodeTree;
        this.rightNodeTree = rightNodeTree;
    }


    public NodeTree Insert(NodeTree root, int data) {

        if (data > root.getData()) {

            if (root.getRightNodeTree() != null) {
                Insert(root.getRightNodeTree(), data);


                if (Math.abs(height(root.leftNodeTree, 0) - height(root.rightNodeTree, 0)) == 2) {

                    if (data < root.getData()) {
                        LL(root);
                    } else {
                        RL(root);
                    }

                }

            } else {
                root.rightNodeTree = new NodeTree(data, null, null);
            }
        }

        if (data < root.getData()) {
            if (root.getLeftNodeTree() != null) {
                Insert(root.getLeftNodeTree(), data);

                if (Math.abs(height(root.leftNodeTree, 0) - height(root.rightNodeTree, 0)) == 2) {

                    if (data < root.getData()) {
                        LR(root);
                    } else {
                        RR(root);
                    }

                }
            } else {
                root.leftNodeTree = new NodeTree(data, null, null);
            }
        }

        return root;
    }


    /**
     * 左旋转，适合右右类型的树
     *
     * @param root
     */
    public NodeTree LL(NodeTree root) {
        NodeTree temp = root.leftNodeTree;
        root.leftNodeTree = temp.rightNodeTree;
        temp.rightNodeTree = root;
        root = temp;
        return root;
    }

    /**
     * 右旋转，适合左左类型的树
     *
     * @param root
     */
    public NodeTree RR(NodeTree root) {
        NodeTree temp = root.rightNodeTree;

        if (temp != null) {
            root.rightNodeTree = temp.leftNodeTree;
            temp.leftNodeTree = root;
        } else {

        }

        root = temp;
        return root;
    }

    /**
     * 左右类型，要在左子树上面进行一次右旋转，然后再进行一次左旋转
     *
     * @param root
     * @return
     */
    public NodeTree LR(NodeTree root) {

        NodeTree left = root.leftNodeTree;

        root.leftNodeTree = LL(left);

        RR(root);

        return root;
    }

    /**
     * 右左类型，先进行一次左旋转，在进行一次右旋转
     *
     * @param root
     * @return
     */
    public NodeTree RL(NodeTree root) {

        NodeTree right = root.rightNodeTree;

        root.rightNodeTree = RR(right);

        LL(root);

        return root;
    }


    /**
     * 计算高度
     *
     * @param child
     * @return
     */
    private Integer height(NodeTree child, int currentHeight) {


        if (child == null) {
            return currentHeight;
        }

        return Math.max(height(child.leftNodeTree, currentHeight + 1), height(child.rightNodeTree, currentHeight + 1));
    }


}
