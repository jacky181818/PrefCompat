package com.tramsun.libs.prefcompat;

import java.util.List;

public interface PrefInterface {

  boolean putString(String key, String value);

  String getString(String key);

  String getString(String key, String defaultValue);

  boolean putFloat(String key, Float value);

  Float getFloat(String key);

  Float getFloat(String key, Float defaultValue);

  boolean putDouble(String key, Double value);

  Double getDouble(String key);

  Double getDouble(String key, Double defaultValue);

  boolean putInt(String key, Integer value);

  Integer getInt(String key);

  Integer getInt(String key, Integer defaultValue);

  boolean putBoolean(String key, Boolean value);

  Boolean getBoolean(String key);

  Boolean getBoolean(String key, Boolean defaultValue);

  boolean putLong(String key, Long value);

  Long getLong(String key);

  Long getLong(String key, Long defaultValue);

  boolean putStringList(String key, List<String> value);

  List<String> getStringList(String key);

  List<String> getStringList(String key, List<String> defaultValue);

  boolean putFloatList(String key, List<Float> value);

  List<Float> getFloatList(String key);

  List<Float> getFloatList(String key, List<Float> defaultValue);

  boolean putDoubleList(String key, List<Double> value);

  List<Double> getDoubleList(String key);

  List<Double> getDoubleList(String key, List<Double> defaultValue);

  boolean putIntList(String key, List<Integer> value);

  List<Integer> getIntList(String key);

  List<Integer> getIntList(String key, List<Integer> defaultValue);

  boolean putBooleanList(String key, List<Boolean> value);

  List<Boolean> getBooleanList(String key);

  List<Boolean> getBooleanList(String key, List<Boolean> defaultValue);

  boolean putLongList(String key, List<Long> value);

  List<Long> getLongList(String key);

  List<Long> getLongList(String key, List<Long> defaultValue);

  <T> boolean putObject(String key, T value);

  <T> T getObject(String key, Class<T> tClass);

  <T> T getObject(String key, Class<T> tClass, T defaultValue);
}
