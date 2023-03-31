package com.google.protobuf;

import java.io.IOException;
import java.io.Serializable;
import java.nio.ByteBuffer;
import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;
import java.util.NoSuchElementException;
import java.util.Objects;

/* renamed from: com.google.protobuf.i */
/* compiled from: ByteString */
public abstract class C8153i implements Iterable<Byte>, Serializable {

    /* renamed from: b */
    public static final C8153i f34908b = new C8163j(C8119d0.f34857d);

    /* renamed from: c */
    private static final C8159f f34909c = (C8118d.m44648c() ? new C8164k((C8154a) null) : new C8157d((C8154a) null));

    /* renamed from: d */
    private static final Comparator<C8153i> f34910d = new C8155b();

    /* renamed from: a */
    private int f34911a = 0;

    /* renamed from: com.google.protobuf.i$a */
    /* compiled from: ByteString */
    class C8154a extends C8156c {

        /* renamed from: a */
        private int f34912a = 0;

        /* renamed from: b */
        private final int f34913b;

        C8154a() {
            this.f34913b = C8153i.this.size();
        }

        /* renamed from: b */
        public byte mo26944b() {
            int i = this.f34912a;
            if (i < this.f34913b) {
                this.f34912a = i + 1;
                return C8153i.this.mo26890w(i);
            }
            throw new NoSuchElementException();
        }

        public boolean hasNext() {
            return this.f34912a < this.f34913b;
        }
    }

    /* renamed from: com.google.protobuf.i$b */
    /* compiled from: ByteString */
    static class C8155b implements Comparator<C8153i> {
        C8155b() {
        }

        /* renamed from: a */
        public int compare(C8153i iVar, C8153i iVar2) {
            C8160g z = iVar.iterator();
            C8160g z2 = iVar2.iterator();
            while (z.hasNext() && z2.hasNext()) {
                int compareTo = Integer.valueOf(C8153i.m44767L(z.mo26944b())).compareTo(Integer.valueOf(C8153i.m44767L(z2.mo26944b())));
                if (compareTo != 0) {
                    return compareTo;
                }
            }
            return Integer.valueOf(iVar.size()).compareTo(Integer.valueOf(iVar2.size()));
        }
    }

    /* renamed from: com.google.protobuf.i$c */
    /* compiled from: ByteString */
    static abstract class C8156c implements C8160g {
        C8156c() {
        }

        /* renamed from: a */
        public final Byte next() {
            return Byte.valueOf(mo26944b());
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.i$d */
    /* compiled from: ByteString */
    private static final class C8157d implements C8159f {
        private C8157d() {
        }

        /* renamed from: a */
        public byte[] mo26951a(byte[] bArr, int i, int i2) {
            return Arrays.copyOfRange(bArr, i, i2 + i);
        }

        /* synthetic */ C8157d(C8154a aVar) {
            this();
        }
    }

    /* renamed from: com.google.protobuf.i$e */
    /* compiled from: ByteString */
    private static final class C8158e extends C8163j {

        /* renamed from: f */
        private final int f34915f;

        /* renamed from: g */
        private final int f34916g;

        C8158e(byte[] bArr, int i, int i2) {
            super(bArr);
            C8153i.m44775k(i, i + i2, bArr.length);
            this.f34915f = i;
            this.f34916g = i2;
        }

        /* access modifiers changed from: protected */
        /* renamed from: Y */
        public int mo26952Y() {
            return this.f34915f;
        }

        /* renamed from: i */
        public byte mo26887i(int i) {
            C8153i.m44774j(i, size());
            return this.f34919e[this.f34915f + i];
        }

        public int size() {
            return this.f34916g;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo26889u(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f34919e, mo26952Y() + i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public byte mo26890w(int i) {
            return this.f34919e[this.f34915f + i];
        }
    }

    /* renamed from: com.google.protobuf.i$f */
    /* compiled from: ByteString */
    private interface C8159f {
        /* renamed from: a */
        byte[] mo26951a(byte[] bArr, int i, int i2);
    }

    /* renamed from: com.google.protobuf.i$g */
    /* compiled from: ByteString */
    public interface C8160g extends Iterator<Byte> {
        /* renamed from: b */
        byte mo26944b();
    }

    /* renamed from: com.google.protobuf.i$h */
    /* compiled from: ByteString */
    static final class C8161h {

        /* renamed from: a */
        private final C8180l f34917a;

        /* renamed from: b */
        private final byte[] f34918b;

        /* synthetic */ C8161h(int i, C8154a aVar) {
            this(i);
        }

        /* renamed from: a */
        public C8153i mo26953a() {
            this.f34917a.mo27118d();
            return new C8163j(this.f34918b);
        }

        /* renamed from: b */
        public C8180l mo26954b() {
            return this.f34917a;
        }

        private C8161h(int i) {
            byte[] bArr = new byte[i];
            this.f34918b = bArr;
            this.f34917a = C8180l.m45150g0(bArr);
        }
    }

    /* renamed from: com.google.protobuf.i$i */
    /* compiled from: ByteString */
    static abstract class C8162i extends C8153i {
        C8162i() {
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public abstract boolean mo26884X(C8153i iVar, int i, int i2);

        public /* bridge */ /* synthetic */ Iterator iterator() {
            return C8153i.super.iterator();
        }

        /* access modifiers changed from: protected */
        /* renamed from: v */
        public final int mo26941v() {
            return 0;
        }

        /* access modifiers changed from: protected */
        /* renamed from: x */
        public final boolean mo26942x() {
            return true;
        }
    }

    /* renamed from: com.google.protobuf.i$j */
    /* compiled from: ByteString */
    private static class C8163j extends C8162i {

        /* renamed from: e */
        protected final byte[] f34919e;

        C8163j(byte[] bArr) {
            Objects.requireNonNull(bArr);
            this.f34919e = bArr;
        }

        /* renamed from: B */
        public final C8167j mo26878B() {
            return C8167j.m44847l(this.f34919e, mo26952Y(), size(), true);
        }

        /* access modifiers changed from: protected */
        /* renamed from: C */
        public final int mo26879C(int i, int i2, int i3) {
            return C8119d0.m44657i(i, this.f34919e, mo26952Y() + i2, i3);
        }

        /* access modifiers changed from: protected */
        /* renamed from: D */
        public final int mo26880D(int i, int i2, int i3) {
            int Y = mo26952Y() + i2;
            return C8094a2.m44520v(i, this.f34919e, Y, i3 + Y);
        }

        /* renamed from: J */
        public final C8153i mo26881J(int i, int i2) {
            int k = C8153i.m44775k(i, i2, size());
            if (k == 0) {
                return C8153i.f34908b;
            }
            return new C8158e(this.f34919e, mo26952Y() + i, k);
        }

        /* access modifiers changed from: protected */
        /* renamed from: N */
        public final String mo26882N(Charset charset) {
            return new String(this.f34919e, mo26952Y(), size(), charset);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: W */
        public final void mo26883W(C8147h hVar) throws IOException {
            hVar.mo26917b(this.f34919e, mo26952Y(), size());
        }

        /* access modifiers changed from: package-private */
        /* renamed from: X */
        public final boolean mo26884X(C8153i iVar, int i, int i2) {
            if (i2 <= iVar.size()) {
                int i3 = i + i2;
                if (i3 > iVar.size()) {
                    throw new IllegalArgumentException("Ran off end of other: " + i + ", " + i2 + ", " + iVar.size());
                } else if (!(iVar instanceof C8163j)) {
                    return iVar.mo26881J(i, i3).equals(mo26881J(0, i2));
                } else {
                    C8163j jVar = (C8163j) iVar;
                    byte[] bArr = this.f34919e;
                    byte[] bArr2 = jVar.f34919e;
                    int Y = mo26952Y() + i2;
                    int Y2 = mo26952Y();
                    int Y3 = jVar.mo26952Y() + i;
                    while (Y2 < Y) {
                        if (bArr[Y2] != bArr2[Y3]) {
                            return false;
                        }
                        Y2++;
                        Y3++;
                    }
                    return true;
                }
            } else {
                throw new IllegalArgumentException("Length too large: " + i2 + size());
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: Y */
        public int mo26952Y() {
            return 0;
        }

        /* renamed from: c */
        public final ByteBuffer mo26885c() {
            return ByteBuffer.wrap(this.f34919e, mo26952Y(), size()).asReadOnlyBuffer();
        }

        public final boolean equals(Object obj) {
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof C8153i) || size() != ((C8153i) obj).size()) {
                return false;
            }
            if (size() == 0) {
                return true;
            }
            if (!(obj instanceof C8163j)) {
                return obj.equals(this);
            }
            C8163j jVar = (C8163j) obj;
            int E = mo26930E();
            int E2 = jVar.mo26930E();
            if (E == 0 || E2 == 0 || E == E2) {
                return mo26884X(jVar, 0, size());
            }
            return false;
        }

        /* renamed from: i */
        public byte mo26887i(int i) {
            return this.f34919e[i];
        }

        public int size() {
            return this.f34919e.length;
        }

        /* access modifiers changed from: protected */
        /* renamed from: u */
        public void mo26889u(byte[] bArr, int i, int i2, int i3) {
            System.arraycopy(this.f34919e, i, bArr, i2, i3);
        }

        /* access modifiers changed from: package-private */
        /* renamed from: w */
        public byte mo26890w(int i) {
            return this.f34919e[i];
        }

        /* renamed from: y */
        public final boolean mo26891y() {
            int Y = mo26952Y();
            return C8094a2.m44518t(this.f34919e, Y, size() + Y);
        }
    }

    /* renamed from: com.google.protobuf.i$k */
    /* compiled from: ByteString */
    private static final class C8164k implements C8159f {
        private C8164k() {
        }

        /* renamed from: a */
        public byte[] mo26951a(byte[] bArr, int i, int i2) {
            byte[] bArr2 = new byte[i2];
            System.arraycopy(bArr, i, bArr2, 0, i2);
            return bArr2;
        }

        /* synthetic */ C8164k(C8154a aVar) {
            this();
        }
    }

    C8153i() {
    }

    /* renamed from: A */
    static C8161h m44766A(int i) {
        return new C8161h(i, (C8154a) null);
    }

    /* access modifiers changed from: private */
    /* renamed from: L */
    public static int m44767L(byte b) {
        return b & 255;
    }

    /* renamed from: P */
    private String m44768P() {
        if (size() <= 50) {
            return C8229s1.m45624a(this);
        }
        return C8229s1.m45624a(mo26881J(0, 47)) + "...";
    }

    /* renamed from: R */
    static C8153i m44769R(ByteBuffer byteBuffer) {
        if (!byteBuffer.hasArray()) {
            return new C8131d1(byteBuffer);
        }
        return m44771V(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
    }

    /* renamed from: T */
    static C8153i m44770T(byte[] bArr) {
        return new C8163j(bArr);
    }

    /* renamed from: V */
    static C8153i m44771V(byte[] bArr, int i, int i2) {
        return new C8158e(bArr, i, i2);
    }

    /* renamed from: f */
    private static C8153i m44773f(Iterator<C8153i> it, int i) {
        if (i < 1) {
            throw new IllegalArgumentException(String.format("length (%s) must be >= 1", new Object[]{Integer.valueOf(i)}));
        } else if (i == 1) {
            return it.next();
        } else {
            int i2 = i >>> 1;
            return m44773f(it, i2).mo26938l(m44773f(it, i - i2));
        }
    }

    /* renamed from: j */
    static void m44774j(int i, int i2) {
        if (((i2 - (i + 1)) | i) >= 0) {
            return;
        }
        if (i < 0) {
            throw new ArrayIndexOutOfBoundsException("Index < 0: " + i);
        }
        throw new ArrayIndexOutOfBoundsException("Index > length: " + i + ", " + i2);
    }

    /* renamed from: k */
    static int m44775k(int i, int i2, int i3) {
        int i4 = i2 - i;
        if ((i | i2 | i4 | (i3 - i2)) >= 0) {
            return i4;
        }
        if (i < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i + " < 0");
        } else if (i2 < i) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i + ", " + i2);
        } else {
            throw new IndexOutOfBoundsException("End index: " + i2 + " >= " + i3);
        }
    }

    /* renamed from: o */
    public static C8153i m44776o(Iterable<C8153i> iterable) {
        int i;
        if (!(iterable instanceof Collection)) {
            i = 0;
            Iterator<C8153i> it = iterable.iterator();
            while (it.hasNext()) {
                it.next();
                i++;
            }
        } else {
            i = ((Collection) iterable).size();
        }
        if (i == 0) {
            return f34908b;
        }
        return m44773f(iterable.iterator(), i);
    }

    /* renamed from: q */
    public static C8153i m44777q(byte[] bArr) {
        return m44778r(bArr, 0, bArr.length);
    }

    /* renamed from: r */
    public static C8153i m44778r(byte[] bArr, int i, int i2) {
        m44775k(i, i + i2, bArr.length);
        return new C8163j(f34909c.mo26951a(bArr, i, i2));
    }

    /* renamed from: s */
    public static C8153i m44779s(String str) {
        return new C8163j(str.getBytes(C8119d0.f34855b));
    }

    /* renamed from: B */
    public abstract C8167j mo26878B();

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public abstract int mo26879C(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public abstract int mo26880D(int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: E */
    public final int mo26930E() {
        return this.f34911a;
    }

    /* renamed from: G */
    public final C8153i mo26931G(int i) {
        return mo26881J(i, size());
    }

    /* renamed from: J */
    public abstract C8153i mo26881J(int i, int i2);

    /* renamed from: K */
    public final byte[] mo26932K() {
        int size = size();
        if (size == 0) {
            return C8119d0.f34857d;
        }
        byte[] bArr = new byte[size];
        mo26889u(bArr, 0, 0, size);
        return bArr;
    }

    /* renamed from: M */
    public final String mo26933M(Charset charset) {
        return size() == 0 ? "" : mo26882N(charset);
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public abstract String mo26882N(Charset charset);

    /* renamed from: O */
    public final String mo26934O() {
        return mo26933M(C8119d0.f34855b);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public abstract void mo26883W(C8147h hVar) throws IOException;

    /* renamed from: c */
    public abstract ByteBuffer mo26885c();

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i = this.f34911a;
        if (i == 0) {
            int size = size();
            i = mo26879C(size, 0, size);
            if (i == 0) {
                i = 1;
            }
            this.f34911a = i;
        }
        return i;
    }

    /* renamed from: i */
    public abstract byte mo26887i(int i);

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: l */
    public final C8153i mo26938l(C8153i iVar) {
        if (Integer.MAX_VALUE - size() >= iVar.size()) {
            return C8194m1.m45408a0(this, iVar);
        }
        throw new IllegalArgumentException("ByteString would be too long: " + size() + "+" + iVar.size());
    }

    public abstract int size();

    @Deprecated
    /* renamed from: t */
    public final void mo26939t(byte[] bArr, int i, int i2, int i3) {
        m44775k(i, i + i3, size());
        m44775k(i2, i2 + i3, bArr.length);
        if (i3 > 0) {
            mo26889u(bArr, i, i2, i3);
        }
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", new Object[]{Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(size()), m44768P()});
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public abstract void mo26889u(byte[] bArr, int i, int i2, int i3);

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public abstract int mo26941v();

    /* access modifiers changed from: package-private */
    /* renamed from: w */
    public abstract byte mo26890w(int i);

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public abstract boolean mo26942x();

    /* renamed from: y */
    public abstract boolean mo26891y();

    /* renamed from: z */
    public C8160g iterator() {
        return new C8154a();
    }
}
