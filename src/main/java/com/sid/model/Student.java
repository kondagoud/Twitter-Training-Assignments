package com.sid.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Comparator;

/**
 * This pojo class represents student.
 *
 * @author kmerugu.
 */
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Student {
    private Long rollNumber;
    private String name;

    /**
     * This method is used for string representation of student.
     *
     * @return
     */
    public String toString() {
        return getRollNumber() + " " + " " + "" + getName();
    }
}
