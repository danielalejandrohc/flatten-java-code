package com.daniel;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.RecursiveAction;

/**
 *
 * @author daniel.hernandez01
 */
public class Flatten extends RecursiveAction {

    private List<Object> list;
    private List<Object> ret = new ArrayList<>();

    public Flatten(List<Object> list) {
        this.list = list;
    }


    public List<Object> getList() {
        return list;
    }

    public void setList(List<Object> list) {
        this.list = list;
    }

    public List<Object> getRet() {
        return ret;
    }

    public void setRet(List<Object> ret) {
        this.ret = ret;
    }

    
    /**
     * This will iterate all the elements of one array, if it a List they it will compute recursive
     */
    @Override
    protected void compute() {
        list.forEach(element -> {
            if (element instanceof List) {
                // It is a list
                Flatten splitter = new Flatten((List<Object>) element);
                splitter.setRet(ret);
                splitter.compute();
            } else {
                ret.add(element);
            }
        });
    }
}
