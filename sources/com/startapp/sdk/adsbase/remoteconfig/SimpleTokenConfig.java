package com.startapp.sdk.adsbase.remoteconfig;

import android.content.Context;
import com.startapp.C8923e2;
import com.startapp.sdk.adsbase.C9441e;
import com.startapp.sdk.components.ComponentLocator;
import java.io.Serializable;

/* compiled from: Sta */
public class SimpleTokenConfig implements Serializable {
    private static final long serialVersionUID = 2058698844345650499L;
    private boolean enabled = false;

    /* renamed from: a */
    public boolean mo31128a(Context context) {
        ComponentLocator a = ComponentLocator.m50248a(context);
        C9441e d = a.mo31168d();
        C8923e2 f = a.mo31170f();
        if (d.getBoolean("userDisabledSimpleToken", false) || !this.enabled || !f.mo29324c()) {
            return false;
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass() && this.enabled == ((SimpleTokenConfig) obj).enabled) {
            return true;
        }
        return false;
    }

    public int hashCode() {
        return Boolean.valueOf(this.enabled).hashCode();
    }
}
