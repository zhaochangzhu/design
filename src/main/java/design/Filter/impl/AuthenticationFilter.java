package design.Filter.impl;

import design.Filter.inter.Filter;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 16:47
 */
public class AuthenticationFilter implements Filter {
    public void execute(String request) {
        System.out.println("Authenticating request: " + request);
    }
}
