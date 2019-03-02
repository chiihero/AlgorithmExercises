import java.util.Stack;

/*
155. 最小栈
设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。

    push(x) -- 将元素 x 推入栈中。
    pop() -- 删除栈顶的元素。
    top() -- 获取栈顶元素。
    getMin() -- 检索栈中的最小元素。
示例:

MinStack minStack = new MinStack();
minStack.push(-2);
minStack.push(0);
minStack.push(-3);
minStack.getMin();   --> 返回 -3.
minStack.pop();
minStack.top();      --> 返回 0.
minStack.getMin();   --> 返回 -2.
*/

public class leetcode_155 {
    private Stack<Integer> stack;
    public MinStack() {
        stack = new Stack<>();
    }
    
    public void push(int x) {
        stack.push(x);

        if (stack.empty()) {
            stack.push(x);
        }else{
            int var = stack.peek();
            if (var<x) {
                stack.push(var);

            }else{
                stack.push(x);
            }
        }
    }
    
    public void pop() {
        stack.pop();
        stack.pop();

    }
    
    public int top() {
        return stack.get(stack.size()-2);
    }
    
    public int getMin() {
        return stack.peek();
    }
}
