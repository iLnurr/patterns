/**
 * Created by ilnur on 06.04.17.
 */
public abstract class Prototype implements Cloneable{
    @Override
    public abstract Object clone() throws CloneNotSupportedException;
}
