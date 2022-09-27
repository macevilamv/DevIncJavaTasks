package by.incubator.task17;

import jdk.jfr.Experimental;
import java.io.Closeable;
import java.io.IOException;
import java.io.Serializable;

@Deprecated @Experimental
public class AnalyzedClassExample extends Parent implements Runnable, Serializable, Cloneable, Closeable {
    @Deprecated
    String information;
    @Experimental
    Integer code;

    public AnalyzedClassExample(String information, Integer code) {
        this.information = information;
        this.code = code;
    }

    @Deprecated
    private AnalyzedClassExample() {

    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
    }

    @Override @Deprecated
    public void run() {

    }


    @Override @Deprecated
    public void close() throws IOException {

    }

}
