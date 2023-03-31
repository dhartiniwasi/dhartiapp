package p386w7;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
import java.util.Collection;
import java.util.Map;
import p356t7.C12540b;
import p356t7.C12541c;
import p356t7.C12544d;
import p356t7.C12545e;
import p356t7.C12546f;

/* renamed from: w7.f */
/* compiled from: ProtobufDataEncoderContext */
final class C12917f implements C12545e {

    /* renamed from: f */
    private static final Charset f47127f = Charset.forName("UTF-8");

    /* renamed from: g */
    private static final C12541c f47128g = C12541c.m59731a("key").mo37366b(C12910a.m61012b().mo37938c(1).mo37937a()).mo37365a();

    /* renamed from: h */
    private static final C12541c f47129h = C12541c.m59731a("value").mo37366b(C12910a.m61012b().mo37938c(2).mo37937a()).mo37365a();

    /* renamed from: i */
    private static final C12544d<Map.Entry<Object, Object>> f47130i = C12916e.f47126a;

    /* renamed from: a */
    private OutputStream f47131a;

    /* renamed from: b */
    private final Map<Class<?>, C12544d<?>> f47132b;

    /* renamed from: c */
    private final Map<Class<?>, C12546f<?>> f47133c;

    /* renamed from: d */
    private final C12544d<Object> f47134d;

    /* renamed from: e */
    private final C12922i f47135e = new C12922i(this);

    /* renamed from: w7.f$a */
    /* compiled from: ProtobufDataEncoderContext */
    static /* synthetic */ class C12918a {

        /* renamed from: a */
        static final /* synthetic */ int[] f47136a;

        /* JADX WARNING: Can't wrap try/catch for region: R(6:0|1|2|3|4|(3:5|6|8)) */
        /* JADX WARNING: Failed to process nested try/catch */
        /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0012 */
        /* JADX WARNING: Missing exception handler attribute for start block: B:5:0x001d */
        static {
            /*
                w7.d$a[] r0 = p386w7.C12914d.C12915a.values()
                int r0 = r0.length
                int[] r0 = new int[r0]
                f47136a = r0
                w7.d$a r1 = p386w7.C12914d.C12915a.DEFAULT     // Catch:{ NoSuchFieldError -> 0x0012 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0012 }
                r2 = 1
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0012 }
            L_0x0012:
                int[] r0 = f47136a     // Catch:{ NoSuchFieldError -> 0x001d }
                w7.d$a r1 = p386w7.C12914d.C12915a.SIGNED     // Catch:{ NoSuchFieldError -> 0x001d }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x001d }
                r2 = 2
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x001d }
            L_0x001d:
                int[] r0 = f47136a     // Catch:{ NoSuchFieldError -> 0x0028 }
                w7.d$a r1 = p386w7.C12914d.C12915a.FIXED     // Catch:{ NoSuchFieldError -> 0x0028 }
                int r1 = r1.ordinal()     // Catch:{ NoSuchFieldError -> 0x0028 }
                r2 = 3
                r0[r1] = r2     // Catch:{ NoSuchFieldError -> 0x0028 }
            L_0x0028:
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: p386w7.C12917f.C12918a.<clinit>():void");
        }
    }

    C12917f(OutputStream outputStream, Map<Class<?>, C12544d<?>> map, Map<Class<?>, C12546f<?>> map2, C12544d<Object> dVar) {
        this.f47131a = outputStream;
        this.f47132b = map;
        this.f47133c = map2;
        this.f47134d = dVar;
    }

    /* renamed from: m */
    private static ByteBuffer m61019m(int i) {
        return ByteBuffer.allocate(i).order(ByteOrder.LITTLE_ENDIAN);
    }

    /* renamed from: n */
    private <T> long m61020n(C12544d<T> dVar, T t) throws IOException {
        OutputStream outputStream;
        C12912b bVar = new C12912b();
        try {
            outputStream = this.f47131a;
            this.f47131a = bVar;
            dVar.mo18855a(t, this);
            this.f47131a = outputStream;
            long a = bVar.mo37945a();
            bVar.close();
            return a;
        } catch (Throwable th) {
            try {
                bVar.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    /* renamed from: o */
    private <T> C12917f m61021o(C12544d<T> dVar, C12541c cVar, T t, boolean z) throws IOException {
        long n = m61020n(dVar, t);
        if (z && n == 0) {
            return this;
        }
        m61026u((m61024s(cVar) << 3) | 2);
        m61027v(n);
        dVar.mo18855a(t, this);
        return this;
    }

    /* renamed from: p */
    private <T> C12917f m61022p(C12546f<T> fVar, C12541c cVar, T t, boolean z) throws IOException {
        this.f47135e.mo37963b(cVar, z);
        fVar.mo37370a(t, this.f47135e);
        return this;
    }

    /* renamed from: r */
    private static C12914d m61023r(C12541c cVar) {
        C12914d dVar = (C12914d) cVar.mo37361c(C12914d.class);
        if (dVar != null) {
            return dVar;
        }
        throw new C12540b("Field has no @Protobuf config");
    }

    /* renamed from: s */
    private static int m61024s(C12541c cVar) {
        C12914d dVar = (C12914d) cVar.mo37361c(C12914d.class);
        if (dVar != null) {
            return dVar.tag();
        }
        throw new C12540b("Field has no @Protobuf config");
    }

    /* access modifiers changed from: private */
    /* renamed from: t */
    public static /* synthetic */ void m61025t(Map.Entry entry, C12545e eVar) throws IOException {
        eVar.mo37369c(f47128g, entry.getKey());
        eVar.mo37369c(f47129h, entry.getValue());
    }

    /* renamed from: u */
    private void m61026u(int i) throws IOException {
        while (((long) (i & -128)) != 0) {
            this.f47131a.write((i & 127) | 128);
            i >>>= 7;
        }
        this.f47131a.write(i & 127);
    }

    /* renamed from: v */
    private void m61027v(long j) throws IOException {
        while ((-128 & j) != 0) {
            this.f47131a.write((((int) j) & 127) | 128);
            j >>>= 7;
        }
        this.f47131a.write(((int) j) & 127);
    }

    /* renamed from: c */
    public C12545e mo37369c(C12541c cVar, Object obj) throws IOException {
        return mo37951g(cVar, obj, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public C12545e mo37949e(C12541c cVar, double d, boolean z) throws IOException {
        if (z && d == 0.0d) {
            return this;
        }
        m61026u((m61024s(cVar) << 3) | 1);
        this.f47131a.write(m61019m(8).putDouble(d).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C12545e mo37950f(C12541c cVar, float f, boolean z) throws IOException {
        if (z && f == 0.0f) {
            return this;
        }
        m61026u((m61024s(cVar) << 3) | 5);
        this.f47131a.write(m61019m(4).putFloat(f).array());
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: g */
    public C12545e mo37951g(C12541c cVar, Object obj, boolean z) throws IOException {
        if (obj == null) {
            return this;
        }
        if (obj instanceof CharSequence) {
            CharSequence charSequence = (CharSequence) obj;
            if (z && charSequence.length() == 0) {
                return this;
            }
            m61026u((m61024s(cVar) << 3) | 2);
            byte[] bytes = charSequence.toString().getBytes(f47127f);
            m61026u(bytes.length);
            this.f47131a.write(bytes);
            return this;
        } else if (obj instanceof Collection) {
            for (Object g : (Collection) obj) {
                mo37951g(cVar, g, false);
            }
            return this;
        } else if (obj instanceof Map) {
            for (Map.Entry o : ((Map) obj).entrySet()) {
                m61021o(f47130i, cVar, o, false);
            }
            return this;
        } else if (obj instanceof Double) {
            return mo37949e(cVar, ((Double) obj).doubleValue(), z);
        } else {
            if (obj instanceof Float) {
                return mo37950f(cVar, ((Float) obj).floatValue(), z);
            }
            if (obj instanceof Number) {
                return mo37955k(cVar, ((Number) obj).longValue(), z);
            }
            if (obj instanceof Boolean) {
                return mo37956l(cVar, ((Boolean) obj).booleanValue(), z);
            }
            if (obj instanceof byte[]) {
                byte[] bArr = (byte[]) obj;
                if (z && bArr.length == 0) {
                    return this;
                }
                m61026u((m61024s(cVar) << 3) | 2);
                m61026u(bArr.length);
                this.f47131a.write(bArr);
                return this;
            }
            C12544d dVar = this.f47132b.get(obj.getClass());
            if (dVar != null) {
                return m61021o(dVar, cVar, obj, z);
            }
            C12546f fVar = this.f47133c.get(obj.getClass());
            if (fVar != null) {
                return m61022p(fVar, cVar, obj, z);
            }
            if (obj instanceof C12913c) {
                return mo37368b(cVar, ((C12913c) obj).mo19414f());
            }
            if (obj instanceof Enum) {
                return mo37368b(cVar, ((Enum) obj).ordinal());
            }
            return m61021o(this.f47134d, cVar, obj, z);
        }
    }

    /* renamed from: h */
    public C12917f mo37368b(C12541c cVar, int i) throws IOException {
        return mo37953i(cVar, i, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: i */
    public C12917f mo37953i(C12541c cVar, int i, boolean z) throws IOException {
        if (z && i == 0) {
            return this;
        }
        C12914d r = m61023r(cVar);
        int i2 = C12918a.f47136a[r.intEncoding().ordinal()];
        if (i2 == 1) {
            m61026u(r.tag() << 3);
            m61026u(i);
        } else if (i2 == 2) {
            m61026u(r.tag() << 3);
            m61026u((i << 1) ^ (i >> 31));
        } else if (i2 == 3) {
            m61026u((r.tag() << 3) | 5);
            this.f47131a.write(m61019m(4).putInt(i).array());
        }
        return this;
    }

    /* renamed from: j */
    public C12917f mo37367a(C12541c cVar, long j) throws IOException {
        return mo37955k(cVar, j, true);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: k */
    public C12917f mo37955k(C12541c cVar, long j, boolean z) throws IOException {
        if (z && j == 0) {
            return this;
        }
        C12914d r = m61023r(cVar);
        int i = C12918a.f47136a[r.intEncoding().ordinal()];
        if (i == 1) {
            m61026u(r.tag() << 3);
            m61027v(j);
        } else if (i == 2) {
            m61026u(r.tag() << 3);
            m61027v((j >> 63) ^ (j << 1));
        } else if (i == 3) {
            m61026u((r.tag() << 3) | 1);
            this.f47131a.write(m61019m(8).putLong(j).array());
        }
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: l */
    public C12917f mo37956l(C12541c cVar, boolean z, boolean z2) throws IOException {
        return mo37953i(cVar, z ? 1 : 0, z2);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: q */
    public C12917f mo37957q(Object obj) throws IOException {
        if (obj == null) {
            return this;
        }
        C12544d dVar = this.f47132b.get(obj.getClass());
        if (dVar != null) {
            dVar.mo18855a(obj, this);
            return this;
        }
        throw new C12540b("No encoder for " + obj.getClass());
    }
}
