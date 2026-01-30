package config.core;

public class Param {
    private final ParamType type;
    private final Object value;

    public Param(ParamType type, Object value) {
        this.type = type;
        this.value = value;
    }
    public ParamType getType() {
        return type;
    }
    public Object getValue() {
        return value;
    }
}
