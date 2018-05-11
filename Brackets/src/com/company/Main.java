package com.company;


public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack(10);
        String str = "(){}{()}";
        String s1 = String.valueOf(str.charAt(0));
        for (int i = 0; i < str.length(); i++) {
            stack.push("(");
            s1 = String.valueOf(str.charAt(i));
            System.out.println(stack.pop());
            if (s1.equals("(") || s1.equals("{") || s1.equals("[")) {
                stack.push(s1);
            } else {
                String bracketFromStack = stack.pop();
                if (bracketFromStack.equals("(")) {
                    if (s1.equals(")")) {
                        //норм
                    } else {
                        if (s1.equals("]") || s1.equals("}"));
                        //не норм
                    }
                }
                if (bracketFromStack.equals("{")) {
                    if (s1.equals("}")) {
                        //норм
                    } else {
                        if (s1.equals("]") || s1.equals(")"));
                        //не норм
                    }
                }
                if (bracketFromStack.equals("[")) {
                    if (s1.equals("]")) {

                        //норм
                    } else {
                        if (s1.equals("}") || s1.equals(")"));
                        //не норм
                    }
                }
            }
        }

        stack.push(s1);
        stack.pop();
        System.out.println(stack.pop());

    }
}

