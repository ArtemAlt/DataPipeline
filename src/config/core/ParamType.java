package config.core;

public enum ParamType {
    STRING,
    BOOLEAN,
    STRING_LIST,
    UNKNOWN;

    public static ParamType detect(Object value) {
        if (value == null) {
            return UNKNOWN;
        }
        if (value instanceof String str) {
            if (str.startsWith("[") && str.endsWith("]")) {
                return STRING_LIST;
            }
            if (str.equalsIgnoreCase("true") || str.equalsIgnoreCase("false")) {
                return BOOLEAN;
            }
            return STRING;
        }
        return UNKNOWN;
    }
}
