package com.google.android.gms.internal.ads;

import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class un3 {

    /* renamed from: a */
    private ArrayList f18647a = new ArrayList();

    /* renamed from: b */
    private rn3 f18648b = rn3.f17027b;

    /* renamed from: c */
    private Integer f18649c = null;

    /* renamed from: a */
    public final un3 mo14550a(bh3 bh3, int i, kh3 kh3) {
        ArrayList arrayList = this.f18647a;
        if (arrayList != null) {
            arrayList.add(new wn3(bh3, i, kh3, (vn3) null));
            return this;
        }
        throw new IllegalStateException("addEntry cannot be called after build()");
    }

    /* renamed from: b */
    public final un3 mo14551b(rn3 rn3) {
        if (this.f18647a != null) {
            this.f18648b = rn3;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build()");
    }

    /* renamed from: c */
    public final un3 mo14552c(int i) {
        if (this.f18647a != null) {
            this.f18649c = Integer.valueOf(i);
            return this;
        }
        throw new IllegalStateException("setPrimaryKeyId cannot be called after build()");
    }

    /* renamed from: d */
    public final yn3 mo14553d() throws GeneralSecurityException {
        if (this.f18647a != null) {
            Integer num = this.f18649c;
            if (num != null) {
                int intValue = num.intValue();
                ArrayList arrayList = this.f18647a;
                int size = arrayList.size();
                int i = 0;
                while (i < size) {
                    int i2 = i + 1;
                    if (((wn3) arrayList.get(i)).mo14957a() != intValue) {
                        i = i2;
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            }
            yn3 yn3 = new yn3(this.f18648b, Collections.unmodifiableList(this.f18647a), this.f18649c, (xn3) null);
            this.f18647a = null;
            return yn3;
        }
        throw new IllegalStateException("cannot call build() twice");
    }
}
