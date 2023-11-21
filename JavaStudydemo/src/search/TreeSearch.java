package search;

import java.util.Scanner;
import java.util.StringJoiner;

public class TreeSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=Integer.parseInt(sc.nextLine());
        String[] num=sc.nextLine().split(" ");
        BinarySearchTree tree=new BinarySearchTree();
        for (String string : num) {
            tree.insert(Integer.parseInt(string));
        }
        tree.midprint();   
        tree.preprint(); 
    }
}

class Node {
    int data;
    Node left;
    Node right;

    public Node(int data) {
        this.data = data;
        left = null;
        right = null;
    }
}
class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        root = null;
    }

    public void insert(int data) {
        root = insertRec(root, data);
    }

    Node insertRec(Node root, int data) {
        if (root == null) {
            root = new Node(data);
            return root;
        }
        if (data < root.data)
            root.left = insertRec(root.left, data);
        else if (data > root.data)
            root.right = insertRec(root.right, data);
        return root;
    }
    public void midprint() {
    StringJoiner sj=new StringJoiner(" ");
    midprintRec(root,sj);
    System.out.println(sj.toString()); 

    
    }

    void midprintRec(Node root,StringJoiner sj) {
    if (root != null) {
        midprintRec(root.left,sj);
        sj.add(root.data+"");
        
        midprintRec(root.right,sj);
    }
}


    public void preprint() {
        StringJoiner sj=new StringJoiner(" ");
        preprintRec(root,sj);
        System.out.println(sj.toString());
        
    }
    
    
    void preprintRec(Node root,StringJoiner sj) 
    {
        if (root != null) {
            
            sj.add(root.data+"");
            preprintRec(root.left,sj);
            preprintRec(root.right,sj);
        }
        else{
            sj.add("#");
        }
    }
    
}


