package mystack;

import java.util.Scanner;

public class ListStck {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        int shuliang = Integer.parseInt(sc.nextLine());
        String[] split = sc.nextLine().split(" ");
        Sistack sistack = new Sistack(shuliang+1);
        for (int i = 0; i < shuliang; i++) {
            sistack.push(split[i]);
        }
        sistack.display();
        // System.out.println();
        sistack.push(Integer.parseInt(sc.nextLine()));
        sistack.display();
        // System.out.println();
        sistack.pop();
        sistack.display();
        // System.out.println();
        sc.close();
    }
}

interface IStack {
    public void clear();
    public void push(Object item) throws Exception;
    public Object pop();
    public boolean isEmpty();
    public int lentgh();
    public Object peek();
}


class Sistack implements IStack{
    private Object[] stackElem;
    private int top;
    public Sistack(int maxSize) {
        top = 0;
        stackElem = new Object[maxSize];
    }

    @Override
    public void clear() {
        top = 0;
    }

    @Override
    public void push(Object item) throws Exception {
        if (top == stackElem.length) {
            throw new Exception("栈已满");

        }
        stackElem[top] = item;
        top++;

            }

    @Override
    public Object pop() {
        if (top == 0) {
            return null;
        } else {
            top--;
            return stackElem[top];
        }


            }

    @Override
    public boolean isEmpty() {
        return top == 0;
    }



    @Override
    public int lentgh() {
        return top;

            }

    @Override
    public Object peek() {
        if (top == 0) {
            return null;
        } else {
            return stackElem[top - 1];
        }
                
    
    }
    public void display() {
        for (int i = top - 1; i >= 0; i--) {
            System.out.print(stackElem[i].toString() + " ");
        }
        System.out.println();
    }



}
