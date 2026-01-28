package config;

import config.core.FormatType;

public interface OutputConfig extends FilePath {
    FormatType getFormatType();
}
