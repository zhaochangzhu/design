package design.Filter.manage;

import design.Filter.chain.FilterChain;
import design.Filter.inter.Filter;
import design.Filter.target.Target;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 16:52
 */
public class FilterManager {
    FilterChain filterChain;

    public FilterManager(Target target){
        filterChain = new FilterChain();
        filterChain.setTarget(target);
    }
    public void setFilter(Filter filter){
        filterChain.addFilter(filter);
    }

    public void filterRequest(String request){
        filterChain.execute(request);
    }
}
