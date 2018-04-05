package com.lewis.learn.lombok;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.util.List;

/**
 * @author lewis
 */
@Builder
@Getter
@AllArgsConstructor
public class Student {

    private String id;

    private String name;

    private String idCardNo;

    private List<String> hobbies;
}
