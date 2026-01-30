package config;

import config.core.InputEncodingType;

interface InputConfig extends FilePath {
    InputEncodingType getEncodingType();
}