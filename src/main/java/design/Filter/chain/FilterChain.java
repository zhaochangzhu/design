package design.Filter.chain;

import design.Filter.inter.Filter;
import design.Filter.target.Target;

import java.util.ArrayList;
import java.util.List;

/**
 * @program: design
 * @description: xx
 * @author: MrZhao
 * @time: 2021/10/29 16:51
 */
public class FilterChain {
    private List<Filter> filters = new ArrayList<Filter>();
    private Target target;

    public void addFilter(Filter filter){
        filters.add(filter);
    }

    public void execute(String request){
        for (Filter filter : filters) {
            filter.execute(request);
        }
        target.execute(request);
    }

    public void setTarget(Target target){
        this.target = target;
    }
}
