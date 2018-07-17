package cn.lishiwei.learn.lesson_2_Tree;


import javax.xml.soap.Node;

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
                root.rightNodeTree = Insert(root.getRightNodeTree(), data);


                if (height(root.rightNodeTree, 0) - height(root.leftNodeTree, 0) == 2) {

                    if (data < root.getRightNodeTree().getData()) {
                        root = doubleRotateRL(root);
                    } else {
                        root = L_rotate(root);
                    }
                }

            } else {
                root.rightNodeTree = new NodeTree(data, null, null);
            }
        }

        if (data < root.getData()) {
            if (root.getLeftNodeTree() != null) {
                root.leftNodeTree = Insert(root.getLeftNodeTree(), data);

                if (height(root.leftNodeTree, 0) - height(root.rightNodeTree, 0) == 2) {

                    if (data < root.getLeftNodeTree().getData()) {
                        root = R_rotate(root);
                    } else {
                        root = doubleRotateLR(root);
                    }

                }
            } else {
                root.leftNodeTree = new NodeTree(data, null, null);
            }
        }

        return root;
    }

    /**
     * 右旋转,适合左左树类型
     *
     * @param root
     * @return
     */
    public NodeTree R_rotate(NodeTree root) {
        NodeTree temp = root.leftNodeTree;
        root.leftNodeTree = temp.rightNodeTree;
        temp.rightNodeTree = root;
        return temp;
    }

    /**
     * 左旋转，适合右右树类型
     *
     * @param root
     * @return
     */
    public NodeTree L_rotate(NodeTree root) {
        NodeTree temp = root.rightNodeTree;
        root.rightNodeTree = temp.leftNodeTree;
        temp.leftNodeTree = root;
        return temp;
    }


    /**
     * 双旋转，适合左右类型的树
     *
     * @param root
     * @return
     */
    public NodeTree doubleRotateLR(NodeTree root) {

        NodeTree temp = root.leftNodeTree;
        root.leftNodeTree = L_rotate(temp);
        return R_rotate(root);
    }

    /**
     * 双旋转，适合右左类型的树
     *
     * @param root
     * @return
     */
    public NodeTree doubleRotateRL(NodeTree root) {
        NodeTree temp = root.rightNodeTree;
        root.rightNodeTree = R_rotate(temp);
        return L_rotate(root);
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
