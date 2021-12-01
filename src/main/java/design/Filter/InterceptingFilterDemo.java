package design.Filter;

import design.Filter.client.Client;
import design.Filter.impl.AuthenticationFilter;
import design.Filter.impl.DebugFilter;
import design.Filter.manage.FilterManager;
import design.Filter.target.Target;

/**
 * @program: design
 * @description: 拦截过滤器模式
 * @author: MrZhao
 * @time: 2021/10/29 16:55
 */
public class InterceptingFilterDemo {
    public static void main(String[] args) {
        FilterManager filterManager = new FilterManager(new Target());
        filterManager.setFilter(new AuthenticationFilter());
        filterManager.setFilter(new DebugFilter());

        Client client = new Client();
        client.setFilterManager(filterManager);
        client.sendRequest("HOME");
    }
}
