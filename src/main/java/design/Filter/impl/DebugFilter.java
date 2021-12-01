package design.Filter.impl;

import design.Filter.inter.Filter;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 16:48
 */
public class DebugFilter implements Filter {
    public void execute(String request) {
        System.out.println("request log: " + request);
    }
}
