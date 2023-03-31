package com.pichillilorenzo.flutter_inappwebview.types;

public enum NavigationActionPolicy {
    CANCEL(0),
    ALLOW(1);
    
    private final int value;

    private NavigationActionPolicy(int i) {
        this.value = i;
    }

    public static NavigationActionPolicy fromValue(int i) {
        for (NavigationActionPolicy navigationActionPolicy : values()) {
            if (i == navigationActionPolicy.value) {
                return navigationActionPolicy;
            }
        }
        throw new IllegalArgumentException("No enum constant: " + i);
    }

    public boolean equalsValue(int i) {
        return this.value == i;
    }

    public int rawValue() {
        return this.value;
    }

    public String toString() {
        return String.valueOf(this.value);
    }
}
