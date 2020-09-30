public class node {
    //instance
    Object data;
    node parent;
    node child;

    //basic constructor
    public node(){}

    // constructor with data input
    public node(Object data) {
        this.data = data;
    }

    //constructor with data, parent, and child.
    public node(Object data, node parent, node child) {
        this.data = data;
        this.parent = parent;
        this.child = child;
    }


    //Data Viewers
    public Object getData() {
        return data;
    }
    public node getParent() {
        return parent;
    }
    public node getChild() {
        return child;
    }


    //Data Modifiers
    public void setData(Object data) {
        this.data = data;
    }
    public void setParent(node parent){
        this.parent = parent;
    }
    public void setChild(node child) {
        this.child = child;
    }
}