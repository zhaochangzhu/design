package design.builder.inter;

/**
 * @program: design
 * @description: xx
 * @return: $
 * @author: MrZhao
 * @time: 2021/11/2 16:24
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
