package p146u0;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* renamed from: u0.s */
/* compiled from: TransitionValues */
public class C5683s {

    /* renamed from: a */
    public final Map<String, Object> f28427a = new HashMap();

    /* renamed from: b */
    public View f28428b;

    /* renamed from: c */
    final ArrayList<C5666m> f28429c = new ArrayList<>();

    @Deprecated
    public C5683s() {
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C5683s)) {
            return false;
        }
        C5683s sVar = (C5683s) obj;
        return this.f28428b == sVar.f28428b && this.f28427a.equals(sVar.f28427a);
    }

    public int hashCode() {
        return (this.f28428b.hashCode() * 31) + this.f28427a.hashCode();
    }

    public String toString() {
        String str = (("TransitionValues@" + Integer.toHexString(hashCode()) + ":\n") + "    view = " + this.f28428b + "\n") + "    values:";
        for (String next : this.f28427a.keySet()) {
            str = str + "    " + next + ": " + this.f28427a.get(next) + "\n";
        }
        return str;
    }

    public C5683s(View view) {
        this.f28428b = view;
    }
}
