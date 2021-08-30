package model;

public class UpdArg {
    private String nameArg;
    private Object arg;

    public UpdArg(String nameArg, Object arg) {
        this.nameArg = nameArg;
        this.arg = arg;
    }

    public String getNameArg() {
        return nameArg;
    }

    public Object getArg() {
        return arg;
    }
}
