package com.srm.lifecyclehooks;

import java.util.List;
import java.util.Map;
import java.util.Set;

public class CollectionDI {
    private List<String> subjects;
    private Set<Double> marks;
    private Map<Integer,String> wonders;
    public Set<Double> getMarks() {
        return marks;
    }

    public Map<Integer, String> getWonders() {
        return wonders;
    }

    public void setWonders(Map<Integer, String> wonders) {
        this.wonders = wonders;
    }

    public void setMarks(Set<Double> marks) {
        this.marks = marks;
    }

    public List<String> getSubjects() {
        return subjects;
    }

    public void setSubjects(List<String> subjects) {
        this.subjects = subjects;
    }



    
}
