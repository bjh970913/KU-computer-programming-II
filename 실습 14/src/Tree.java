import java.io.PrintStream;

/**
 * Created by bjh970913 on 07/12/2016.
 * KU-computer-programming-II
 */
public abstract class Tree {
    protected Tree left, right;

    public Tree() {
        left = null;
        right = null;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRighth() {
        return right;
    }

    public abstract Tree add(Tree node);

    public abstract void print(PrintStream s);
}
