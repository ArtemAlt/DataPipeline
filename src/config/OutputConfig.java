package config;

import config.core.OutputFormatType;

public interface OutputConfig extends FilePath {
    OutputFormatType getFormatType();
}
