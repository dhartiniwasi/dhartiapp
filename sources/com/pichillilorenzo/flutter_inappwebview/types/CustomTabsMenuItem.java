package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Map;

public class CustomTabsMenuItem {

    /* renamed from: id */
    private int f36283id;
    private String label;

    public CustomTabsMenuItem(int i, String str) {
        this.f36283id = i;
        this.label = str;
    }

    public static CustomTabsMenuItem fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsMenuItem(((Integer) map.get("id")).intValue(), (String) map.get("label"));
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsMenuItem customTabsMenuItem = (CustomTabsMenuItem) obj;
        if (this.f36283id != customTabsMenuItem.f36283id) {
            return false;
        }
        return this.label.equals(customTabsMenuItem.label);
    }

    public int getId() {
        return this.f36283id;
    }

    public String getLabel() {
        return this.label;
    }

    public int hashCode() {
        return (this.f36283id * 31) + this.label.hashCode();
    }

    public void setId(int i) {
        this.f36283id = i;
    }

    public void setLabel(String str) {
        this.label = str;
    }

    public String toString() {
        return "CustomTabsMenuItem{id=" + this.f36283id + ", label='" + this.label + '\'' + '}';
    }
}
