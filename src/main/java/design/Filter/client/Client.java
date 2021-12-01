package design.Filter.client;

import design.Filter.manage.FilterManager;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 16:54
 */
public class Client {
    FilterManager filterManager;

    public void setFilterManager(FilterManager filterManager){
        this.filterManager = filterManager;
    }

    public void sendRequest(String request){
        filterManager.filterRequest(request);
    }
}
