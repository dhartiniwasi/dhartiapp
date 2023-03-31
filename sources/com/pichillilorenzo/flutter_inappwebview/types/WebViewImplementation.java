package com.pichillilorenzo.flutter_inappwebview.types;

public enum WebViewImplementation {
    NATIVE(0);
    
    private final int value;

    private WebViewImplementation(int i) {
        this.value = i;
    }

    public static WebViewImplementation fromValue(int i) {
        for (WebViewImplementation webViewImplementation : values()) {
            if (i == webViewImplementation.value) {
                return webViewImplementation;
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
