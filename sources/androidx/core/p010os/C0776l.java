package androidx.core.p010os;

import android.os.LocaleList;
import java.util.Locale;

/* renamed from: androidx.core.os.l */
/* compiled from: LocaleListPlatformWrapper */
final class C0776l implements C0775k {

    /* renamed from: a */
    private final LocaleList f2339a;

    C0776l(Object obj) {
        this.f2339a = (LocaleList) obj;
    }

    /* renamed from: a */
    public Object mo3148a() {
        return this.f2339a;
    }

    public boolean equals(Object obj) {
        return this.f2339a.equals(((C0775k) obj).mo3148a());
    }

    public Locale get(int i) {
        return this.f2339a.get(i);
    }

    public int hashCode() {
        return this.f2339a.hashCode();
    }

    public String toString() {
        return this.f2339a.toString();
    }
}
