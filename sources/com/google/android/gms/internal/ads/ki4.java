package com.google.android.gms.internal.ads;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class ki4 {

    /* renamed from: d */
    public static final ki4 f12114d = new ki4(new gv0[0]);

    /* renamed from: e */
    public static final za4 f12115e = ji4.f11648a;

    /* renamed from: a */
    public final int f12116a;

    /* renamed from: b */
    private final ua3 f12117b;

    /* renamed from: c */
    private int f12118c;

    public ki4(gv0... gv0Arr) {
        this.f12117b = ua3.m21507v(gv0Arr);
        this.f12116a = gv0Arr.length;
        int i = 0;
        while (i < this.f12117b.size()) {
            int i2 = i + 1;
            for (int i3 = i2; i3 < this.f12117b.size(); i3++) {
                if (((gv0) this.f12117b.get(i)).equals(this.f12117b.get(i3))) {
                    ot1.m18058c("TrackGroupArray", "", new IllegalArgumentException("Multiple identical TrackGroups added to one TrackGroupArray."));
                }
            }
            i = i2;
        }
    }

    /* renamed from: a */
    public final int mo11710a(gv0 gv0) {
        int indexOf = this.f12117b.indexOf(gv0);
        if (indexOf >= 0) {
            return indexOf;
        }
        return -1;
    }

    /* renamed from: b */
    public final gv0 mo11711b(int i) {
        return (gv0) this.f12117b.get(i);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && ki4.class == obj.getClass()) {
            ki4 ki4 = (ki4) obj;
            return this.f12116a == ki4.f12116a && this.f12117b.equals(ki4.f12117b);
        }
    }

    public final int hashCode() {
        int i = this.f12118c;
        if (i != 0) {
            return i;
        }
        int hashCode = this.f12117b.hashCode();
        this.f12118c = hashCode;
        return hashCode;
    }
}
