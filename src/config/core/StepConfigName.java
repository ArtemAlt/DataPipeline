package config.core;

public enum StepConfigName {
    CLEAN_HTML("clean_html"),
    NORMALIZE("normalize_whitespace");

    StepConfigName(String key) {
        key = key.toLowerCase();
    }
    private String key;

    public String getKey() {
        return key;
    }
}
