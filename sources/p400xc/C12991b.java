package p400xc;

import com.google.protobuf.C8135e0;
import com.google.protobuf.C8143f1;
import com.google.protobuf.C8167j;
import com.google.protobuf.C8210q;
import com.google.protobuf.C8243v0;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.lang.ref.Reference;
import java.lang.ref.WeakReference;
import p182a7.C6431n;
import p343rc.C12335j1;
import p343rc.C12371q0;
import p343rc.C12423z0;

/* renamed from: xc.b */
/* compiled from: ProtoLiteUtils */
public final class C12991b {

    /* renamed from: a */
    static volatile C8210q f47250a = C8210q.m45546b();

    /* renamed from: xc.b$a */
    /* compiled from: ProtoLiteUtils */
    private static final class C12992a<T extends C8243v0> implements C12423z0.C12426c {

        /* renamed from: c */
        private static final ThreadLocal<Reference<byte[]>> f47251c = new ThreadLocal<>();

        /* renamed from: a */
        private final C8143f1<T> f47252a;

        /* renamed from: b */
        private final T f47253b;

        C12992a(T t) {
            this.f47253b = t;
            this.f47252a = t.mo27321j();
        }

        /* renamed from: d */
        private T m61209d(C8167j jVar) throws C8135e0 {
            T t = (C8243v0) this.f47252a.mo26796b(jVar, C12991b.f47250a);
            try {
                jVar.mo26971a(0);
                return t;
            } catch (C8135e0 e) {
                e.mo26894k(t);
                throw e;
            }
        }

        /* renamed from: c */
        public T mo37202a(InputStream inputStream) {
            byte[] bArr;
            if ((inputStream instanceof C12990a) && ((C12990a) inputStream).mo38050f() == this.f47252a) {
                try {
                    return ((C12990a) inputStream).mo38049b();
                } catch (IllegalStateException unused) {
                }
            }
            C8167j jVar = null;
            try {
                if (inputStream instanceof C12371q0) {
                    int available = inputStream.available();
                    if (available > 0 && available <= 4194304) {
                        ThreadLocal<Reference<byte[]>> threadLocal = f47251c;
                        Reference reference = threadLocal.get();
                        if (reference == null || (bArr = (byte[]) reference.get()) == null || bArr.length < available) {
                            bArr = new byte[available];
                            threadLocal.set(new WeakReference(bArr));
                        }
                        int i = available;
                        while (true) {
                            if (i <= 0) {
                                break;
                            }
                            int read = inputStream.read(bArr, available - i, i);
                            if (read == -1) {
                                break;
                            }
                            i -= read;
                        }
                        if (i == 0) {
                            jVar = C8167j.m44846k(bArr, 0, available);
                        } else {
                            throw new RuntimeException("size inaccurate: " + available + " != " + (available - i));
                        }
                    } else if (available == 0) {
                        return this.f47253b;
                    }
                }
                if (jVar == null) {
                    jVar = C8167j.m44841f(inputStream);
                }
                jVar.mo26969G(Integer.MAX_VALUE);
                try {
                    return m61209d(jVar);
                } catch (C8135e0 e) {
                    throw C12335j1.f45620t.mo37030q("Invalid protobuf byte sequence").mo37029p(e).mo37021d();
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }

        /* renamed from: e */
        public InputStream mo37203b(T t) {
            return new C12990a(t, this.f47252a);
        }
    }

    /* renamed from: a */
    static long m61207a(InputStream inputStream, OutputStream outputStream) throws IOException {
        C6431n.m37562o(inputStream, "inputStream cannot be null!");
        C6431n.m37562o(outputStream, "outputStream cannot be null!");
        byte[] bArr = new byte[8192];
        long j = 0;
        while (true) {
            int read = inputStream.read(bArr);
            if (read == -1) {
                return j;
            }
            outputStream.write(bArr, 0, read);
            j += (long) read;
        }
    }

    /* renamed from: b */
    public static <T extends C8243v0> C12423z0.C12426c<T> m61208b(T t) {
        return new C12992a(t);
    }
}
