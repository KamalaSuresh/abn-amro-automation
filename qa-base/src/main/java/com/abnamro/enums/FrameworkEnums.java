package com.abnamro.enums;

public interface FrameworkEnums {
    /**
     * Enum of browsers supported
     */
    enum Browser {
        FIREFOX("Firefox"),
        CHROME("Chrome"),
        EDGE("Edge");


        private final String name;

        Browser(String name) {
            this.name = name;
        }

        public String toString() {
            return name;
        }
    }
}
