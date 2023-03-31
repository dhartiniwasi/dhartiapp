package androidx.lifecycle;

import android.os.Bundle;
import androidx.core.p010os.C0762d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import kotlin.jvm.internal.C11665g;
import kotlin.jvm.internal.C11669k;
import p104o0.C5140c;
import p197be.C6750f;
import p243gd.C10346p;

/* renamed from: androidx.lifecycle.z */
/* compiled from: SavedStateHandle.kt */
public final class C1240z {

    /* renamed from: f */
    public static final C1241a f3366f = new C1241a((C11665g) null);
    /* access modifiers changed from: private */

    /* renamed from: g */
    public static final Class<? extends Object>[] f3367g;

    /* renamed from: a */
    private final Map<String, Object> f3368a;

    /* renamed from: b */
    private final Map<String, C5140c.C5143c> f3369b;

    /* renamed from: c */
    private final Map<String, Object> f3370c;

    /* renamed from: d */
    private final Map<String, C6750f<Object>> f3371d;

    /* renamed from: e */
    private final C5140c.C5143c f3372e;

    /* renamed from: androidx.lifecycle.z$a */
    /* compiled from: SavedStateHandle.kt */
    public static final class C1241a {
        private C1241a() {
        }

        public /* synthetic */ C1241a(C11665g gVar) {
            this();
        }

        /* renamed from: a */
        public final C1240z mo4454a(Bundle bundle, Bundle bundle2) {
            if (bundle != null) {
                ArrayList parcelableArrayList = bundle.getParcelableArrayList("keys");
                ArrayList parcelableArrayList2 = bundle.getParcelableArrayList("values");
                if ((parcelableArrayList == null || parcelableArrayList2 == null || parcelableArrayList.size() != parcelableArrayList2.size()) ? false : true) {
                    LinkedHashMap linkedHashMap = new LinkedHashMap();
                    int size = parcelableArrayList.size();
                    for (int i = 0; i < size; i++) {
                        Object obj = parcelableArrayList.get(i);
                        Objects.requireNonNull(obj, "null cannot be cast to non-null type kotlin.String");
                        linkedHashMap.put((String) obj, parcelableArrayList2.get(i));
                    }
                    return new C1240z(linkedHashMap);
                }
                throw new IllegalStateException("Invalid bundle passed as restored state".toString());
            } else if (bundle2 == null) {
                return new C1240z();
            } else {
                HashMap hashMap = new HashMap();
                for (String str : bundle2.keySet()) {
                    C11669k.m56786d(str, "key");
                    hashMap.put(str, bundle2.get(str));
                }
                return new C1240z(hashMap);
            }
        }

        /* renamed from: b */
        public final boolean mo4455b(Object obj) {
            if (obj == null) {
                return true;
            }
            for (Class cls : C1240z.f3367g) {
                C11669k.m56784b(cls);
                if (cls.isInstance(obj)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r0v2, resolved type: java.lang.Class<? extends java.lang.Object>[]} */
    /* JADX WARNING: Multi-variable type inference failed */
    static {
        /*
            androidx.lifecycle.z$a r0 = new androidx.lifecycle.z$a
            r1 = 0
            r0.<init>(r1)
            f3366f = r0
            r0 = 29
            java.lang.Class[] r0 = new java.lang.Class[r0]
            java.lang.Class r1 = java.lang.Boolean.TYPE
            r2 = 0
            r0[r2] = r1
            r1 = 1
            java.lang.Class<boolean[]> r2 = boolean[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Double.TYPE
            r2 = 2
            r0[r2] = r1
            r1 = 3
            java.lang.Class<double[]> r2 = double[].class
            r0[r1] = r2
            java.lang.Class r1 = java.lang.Integer.TYPE
            r2 = 4
            r0[r2] = r1
            r2 = 5
            java.lang.Class<int[]> r3 = int[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Long.TYPE
            r3 = 6
            r0[r3] = r2
            r2 = 7
            java.lang.Class<long[]> r3 = long[].class
            r0[r2] = r3
            r2 = 8
            java.lang.Class<java.lang.String> r3 = java.lang.String.class
            r0[r2] = r3
            r2 = 9
            java.lang.Class<java.lang.String[]> r3 = java.lang.String[].class
            r0[r2] = r3
            r2 = 10
            java.lang.Class<android.os.Binder> r3 = android.os.Binder.class
            r0[r2] = r3
            r2 = 11
            java.lang.Class<android.os.Bundle> r3 = android.os.Bundle.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Byte.TYPE
            r3 = 12
            r0[r3] = r2
            r2 = 13
            java.lang.Class<byte[]> r3 = byte[].class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Character.TYPE
            r3 = 14
            r0[r3] = r2
            r2 = 15
            java.lang.Class<char[]> r3 = char[].class
            r0[r2] = r3
            r2 = 16
            java.lang.Class<java.lang.CharSequence> r3 = java.lang.CharSequence.class
            r0[r2] = r3
            r2 = 17
            java.lang.Class<java.lang.CharSequence[]> r3 = java.lang.CharSequence[].class
            r0[r2] = r3
            r2 = 18
            java.lang.Class<java.util.ArrayList> r3 = java.util.ArrayList.class
            r0[r2] = r3
            java.lang.Class r2 = java.lang.Float.TYPE
            r3 = 19
            r0[r3] = r2
            r2 = 20
            java.lang.Class<float[]> r3 = float[].class
            r0[r2] = r3
            java.lang.Class<android.os.Parcelable> r2 = android.os.Parcelable.class
            r3 = 21
            r0[r3] = r2
            r2 = 22
            java.lang.Class<android.os.Parcelable[]> r4 = android.os.Parcelable[].class
            r0[r2] = r4
            r2 = 23
            java.lang.Class<java.io.Serializable> r4 = java.io.Serializable.class
            r0[r2] = r4
            java.lang.Class r2 = java.lang.Short.TYPE
            r4 = 24
            r0[r4] = r2
            r2 = 25
            java.lang.Class<short[]> r4 = short[].class
            r0[r2] = r4
            r2 = 26
            java.lang.Class<android.util.SparseArray> r4 = android.util.SparseArray.class
            r0[r2] = r4
            int r2 = android.os.Build.VERSION.SDK_INT
            if (r2 < r3) goto L_0x00ad
            java.lang.Class<android.util.Size> r4 = android.util.Size.class
            goto L_0x00ae
        L_0x00ad:
            r4 = r1
        L_0x00ae:
            r5 = 27
            r0[r5] = r4
            r4 = 28
            if (r2 < r3) goto L_0x00b8
            java.lang.Class<android.util.SizeF> r1 = android.util.SizeF.class
        L_0x00b8:
            r0[r4] = r1
            f3367g = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.lifecycle.C1240z.<clinit>():void");
    }

    public C1240z(Map<String, ? extends Object> map) {
        C11669k.m56787e(map, "initialState");
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.f3368a = linkedHashMap;
        this.f3369b = new LinkedHashMap();
        this.f3370c = new LinkedHashMap();
        this.f3371d = new LinkedHashMap();
        this.f3372e = new C1239y(this);
        linkedHashMap.putAll(map);
    }

    /* renamed from: c */
    public static final C1240z m5487c(Bundle bundle, Bundle bundle2) {
        return f3366f.mo4454a(bundle, bundle2);
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public static final Bundle m5488e(C1240z zVar) {
        C11669k.m56787e(zVar, "this$0");
        for (Map.Entry entry : C10508b0.m52921m(zVar.f3369b).entrySet()) {
            zVar.mo4453f((String) entry.getKey(), ((C5140c.C5143c) entry.getValue()).mo763a());
        }
        Set<String> keySet = zVar.f3368a.keySet();
        ArrayList arrayList = new ArrayList(keySet.size());
        ArrayList arrayList2 = new ArrayList(arrayList.size());
        for (String next : keySet) {
            arrayList.add(next);
            arrayList2.add(zVar.f3368a.get(next));
        }
        return C0762d.m3511a(C10346p.m52247a("keys", arrayList), C10346p.m52247a("values", arrayList2));
    }

    /* renamed from: d */
    public final C5140c.C5143c mo4452d() {
        return this.f3372e;
    }

    /* renamed from: f */
    public final <T> void mo4453f(String str, T t) {
        C11669k.m56787e(str, "key");
        if (f3366f.mo4455b(t)) {
            Object obj = this.f3370c.get(str);
            C1228t tVar = obj instanceof C1228t ? (C1228t) obj : null;
            if (tVar != null) {
                tVar.mo4354j(t);
            } else {
                this.f3368a.put(str, t);
            }
            C6750f fVar = this.f3371d.get(str);
            if (fVar != null) {
                fVar.setValue(t);
                return;
            }
            return;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("Can't put value with type ");
        C11669k.m56784b(t);
        sb.append(t.getClass());
        sb.append(" into saved state");
        throw new IllegalArgumentException(sb.toString());
    }

    public C1240z() {
        this.f3368a = new LinkedHashMap();
        this.f3369b = new LinkedHashMap();
        this.f3370c = new LinkedHashMap();
        this.f3371d = new LinkedHashMap();
        this.f3372e = new C1239y(this);
    }
}
