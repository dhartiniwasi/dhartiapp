package com.pichillilorenzo.flutter_inappwebview.types;

import java.util.Arrays;
import java.util.Map;

public class CustomTabsActionButton {
    private String description;
    private byte[] icon;

    /* renamed from: id */
    private int f36282id;
    private boolean shouldTint;

    public CustomTabsActionButton(int i, byte[] bArr, String str, boolean z) {
        this.f36282id = i;
        this.icon = bArr;
        this.description = str;
        this.shouldTint = z;
    }

    public static CustomTabsActionButton fromMap(Map<String, Object> map) {
        if (map == null) {
            return null;
        }
        return new CustomTabsActionButton(((Integer) map.get("id")).intValue(), (byte[]) map.get("icon"), (String) map.get("description"), ((Boolean) map.get("shouldTint")).booleanValue());
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CustomTabsActionButton customTabsActionButton = (CustomTabsActionButton) obj;
        if (this.f36282id == customTabsActionButton.f36282id && this.shouldTint == customTabsActionButton.shouldTint && Arrays.equals(this.icon, customTabsActionButton.icon)) {
            return this.description.equals(customTabsActionButton.description);
        }
        return false;
    }

    public String getDescription() {
        return this.description;
    }

    public byte[] getIcon() {
        return this.icon;
    }

    public int getId() {
        return this.f36282id;
    }

    public int hashCode() {
        return (((((this.f36282id * 31) + Arrays.hashCode(this.icon)) * 31) + this.description.hashCode()) * 31) + (this.shouldTint ? 1 : 0);
    }

    public boolean isShouldTint() {
        return this.shouldTint;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcon(byte[] bArr) {
        this.icon = bArr;
    }

    public void setId(int i) {
        this.f36282id = i;
    }

    public void setShouldTint(boolean z) {
        this.shouldTint = z;
    }

    public String toString() {
        return "CustomTabsActionButton{id=" + this.f36282id + ", icon=" + Arrays.toString(this.icon) + ", description='" + this.description + '\'' + ", shouldTint=" + this.shouldTint + '}';
    }
}
