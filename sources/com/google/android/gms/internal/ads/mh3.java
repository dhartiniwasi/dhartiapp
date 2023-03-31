package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;

/* compiled from: com.google.android.gms:play-services-ads@@21.3.0 */
public final class mh3 {

    /* renamed from: a */
    private final Class f13335a;

    /* renamed from: b */
    private ConcurrentMap f13336b = new ConcurrentHashMap();

    /* renamed from: c */
    private nh3 f13337c;

    /* renamed from: d */
    private rn3 f13338d;

    /* synthetic */ mh3(Class cls, lh3 lh3) {
        this.f13335a = cls;
        this.f13338d = rn3.f17027b;
    }

    /* renamed from: e */
    private final mh3 m16531e(Object obj, ts3 ts3, boolean z) throws GeneralSecurityException {
        byte[] bArr;
        if (this.f13336b == null) {
            throw new IllegalStateException("addPrimitive cannot be called after build");
        } else if (ts3.mo14380N() == 3) {
            rh3 rh3 = new rh3(ts3.mo14378H().mo10635K(), ts3.mo14381O(), (qh3) null);
            int O = ts3.mo14381O() - 2;
            if (O != 1) {
                if (O != 2) {
                    if (O == 3) {
                        bArr = ng3.f14013a;
                    } else if (O != 4) {
                        throw new GeneralSecurityException("unknown output prefix type");
                    }
                }
                bArr = ByteBuffer.allocate(5).put((byte) 0).putInt(ts3.mo14377G()).array();
            } else {
                bArr = ByteBuffer.allocate(5).put((byte) 1).putInt(ts3.mo14377G()).array();
            }
            nh3 nh3 = new nh3(obj, bArr, ts3.mo14380N(), ts3.mo14381O(), ts3.mo14377G(), rh3);
            ArrayList arrayList = new ArrayList();
            arrayList.add(nh3);
            ph3 ph3 = new ph3(nh3.mo12626d(), (oh3) null);
            List list = (List) this.f13336b.put(ph3, Collections.unmodifiableList(arrayList));
            if (list != null) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(list);
                arrayList2.add(nh3);
                this.f13336b.put(ph3, Collections.unmodifiableList(arrayList2));
            }
            if (z) {
                if (this.f13337c == null) {
                    this.f13337c = nh3;
                } else {
                    throw new IllegalStateException("you cannot set two primary primitives");
                }
            }
            return this;
        } else {
            throw new GeneralSecurityException("only ENABLED key is allowed");
        }
    }

    /* renamed from: a */
    public final mh3 mo12352a(Object obj, ts3 ts3) throws GeneralSecurityException {
        m16531e(obj, ts3, true);
        return this;
    }

    /* renamed from: b */
    public final mh3 mo12353b(Object obj, ts3 ts3) throws GeneralSecurityException {
        m16531e(obj, ts3, false);
        return this;
    }

    /* renamed from: c */
    public final mh3 mo12354c(rn3 rn3) {
        if (this.f13336b != null) {
            this.f13338d = rn3;
            return this;
        }
        throw new IllegalStateException("setAnnotations cannot be called after build");
    }

    /* renamed from: d */
    public final th3 mo12355d() throws GeneralSecurityException {
        ConcurrentMap concurrentMap = this.f13336b;
        if (concurrentMap != null) {
            th3 th3 = new th3(concurrentMap, this.f13337c, this.f13338d, this.f13335a, (sh3) null);
            this.f13336b = null;
            return th3;
        }
        throw new IllegalStateException("build cannot be called twice");
    }
}
