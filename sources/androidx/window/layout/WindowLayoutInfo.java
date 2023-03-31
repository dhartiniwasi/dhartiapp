package androidx.window.layout;

import java.util.List;
import kotlin.jvm.internal.C11669k;
import p344rd.C12439l;

/* compiled from: WindowLayoutInfo.kt */
public final class WindowLayoutInfo {
    private final List<DisplayFeature> displayFeatures;

    public WindowLayoutInfo(List<? extends DisplayFeature> list) {
        C11669k.m56787e(list, "displayFeatures");
        this.displayFeatures = list;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !C11669k.m56783a(WindowLayoutInfo.class, obj.getClass())) {
            return false;
        }
        return C11669k.m56783a(this.displayFeatures, ((WindowLayoutInfo) obj).displayFeatures);
    }

    public final List<DisplayFeature> getDisplayFeatures() {
        return this.displayFeatures;
    }

    public int hashCode() {
        return this.displayFeatures.hashCode();
    }

    public String toString() {
        return C10530r.m52985r(this.displayFeatures, ", ", "WindowLayoutInfo{ DisplayFeatures[", "] }", 0, (CharSequence) null, (C12439l) null, 56, (Object) null);
    }
}
