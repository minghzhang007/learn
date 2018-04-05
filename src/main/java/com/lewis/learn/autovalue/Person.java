package com.lewis.learn.autovalue;

import com.google.auto.value.AutoValue;

import java.util.List;

@AutoValue
public abstract class Person {

    abstract String getId();

    abstract String getName();

    abstract String getIdCardNo();

    abstract Integer getAge();

    abstract
    List<String> getHobbies();

    public abstract Builder toBuilder();

    public static Builder builder() {
        return new AutoValue_Person.Builder();
    }


    @AutoValue.Builder
    public static abstract class Builder {
        public abstract Builder setId(String id);

        public abstract Builder setName(String name);

        public abstract Builder setIdCardNo(String idCardNo);

        public abstract Builder setHobbies(List<String> hobbies);

        public abstract Builder setAge(Integer age);

        abstract Person build();
    }
}
