package org.javaro.lecture;

class NameX {
    String name;

    void setName(String nm) {
        name = nm;
    }

    String getName() {
        return name;
    }

    String getSName() {
        return "이름=" + getName();
    }
}
