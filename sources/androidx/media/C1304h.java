package androidx.media;

import android.text.TextUtils;
import androidx.core.util.C0825c;

/* renamed from: androidx.media.h */
/* compiled from: MediaSessionManagerImplBase */
class C1304h implements C1302f {

    /* renamed from: a */
    private String f3528a;

    /* renamed from: b */
    private int f3529b;

    /* renamed from: c */
    private int f3530c;

    C1304h(String str, int i, int i2) {
        this.f3528a = str;
        this.f3529b = i;
        this.f3530c = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C1304h)) {
            return false;
        }
        C1304h hVar = (C1304h) obj;
        if (this.f3529b < 0 || hVar.f3529b < 0) {
            if (!TextUtils.equals(this.f3528a, hVar.f3528a) || this.f3530c != hVar.f3530c) {
                return false;
            }
            return true;
        } else if (TextUtils.equals(this.f3528a, hVar.f3528a) && this.f3529b == hVar.f3529b && this.f3530c == hVar.f3530c) {
            return true;
        } else {
            return false;
        }
    }

    public int hashCode() {
        return C0825c.m3643b(this.f3528a, Integer.valueOf(this.f3530c));
    }
}
