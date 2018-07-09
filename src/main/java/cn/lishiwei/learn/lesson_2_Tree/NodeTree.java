package cn.lishiwei.learn.lesson_2_Tree;

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


    public void Insert(NodeTree root, int data) {

        if (data > root.getData()) {

            if (root.getRightNodeTree() != null) {
                Insert(root.getRightNodeTree(), data);
            } else {
                root.rightNodeTree = new NodeTree(data, null, null);
            }
        }

        if (data < root.getData()) {
            if (root.getLeftNodeTree() != null) {
                Insert(root.getLeftNodeTree(), data);
            } else {
                root.leftNodeTree = new NodeTree(data, null, null);
            }
        }

    }


}
