package p264io.grpc.internal;

import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.nio.InvalidMarkException;
import java.util.ArrayDeque;
import java.util.Deque;

/* renamed from: io.grpc.internal.u */
/* compiled from: CompositeReadableBuffer */
public class C11362u extends C11137c {

    /* renamed from: e */
    private static final C11368f<Void> f43619e = new C11363a();

    /* renamed from: f */
    private static final C11368f<Void> f43620f = new C11364b();

    /* renamed from: g */
    private static final C11368f<byte[]> f43621g = new C11365c();

    /* renamed from: h */
    private static final C11368f<ByteBuffer> f43622h = new C11366d();

    /* renamed from: i */
    private static final C11369g<OutputStream> f43623i = new C11367e();

    /* renamed from: a */
    private final Deque<C11380v1> f43624a;

    /* renamed from: b */
    private Deque<C11380v1> f43625b;

    /* renamed from: c */
    private int f43626c;

    /* renamed from: d */
    private boolean f43627d;

    /* renamed from: io.grpc.internal.u$a */
    /* compiled from: CompositeReadableBuffer */
    class C11363a implements C11368f<Void> {
        C11363a() {
        }

        /* renamed from: b */
        public int mo35351a(C11380v1 v1Var, int i, Void voidR, int i2) {
            return v1Var.readUnsignedByte();
        }
    }

    /* renamed from: io.grpc.internal.u$b */
    /* compiled from: CompositeReadableBuffer */
    class C11364b implements C11368f<Void> {
        C11364b() {
        }

        /* renamed from: b */
        public int mo35351a(C11380v1 v1Var, int i, Void voidR, int i2) {
            v1Var.skipBytes(i);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$c */
    /* compiled from: CompositeReadableBuffer */
    class C11365c implements C11368f<byte[]> {
        C11365c() {
        }

        /* renamed from: b */
        public int mo35351a(C11380v1 v1Var, int i, byte[] bArr, int i2) {
            v1Var.mo35269A0(bArr, i2, i);
            return i2 + i;
        }
    }

    /* renamed from: io.grpc.internal.u$d */
    /* compiled from: CompositeReadableBuffer */
    class C11366d implements C11368f<ByteBuffer> {
        C11366d() {
        }

        /* renamed from: b */
        public int mo35351a(C11380v1 v1Var, int i, ByteBuffer byteBuffer, int i2) {
            int limit = byteBuffer.limit();
            byteBuffer.limit(byteBuffer.position() + i);
            v1Var.mo35276z1(byteBuffer);
            byteBuffer.limit(limit);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$e */
    /* compiled from: CompositeReadableBuffer */
    class C11367e implements C11369g<OutputStream> {
        C11367e() {
        }

        /* renamed from: b */
        public int mo35351a(C11380v1 v1Var, int i, OutputStream outputStream, int i2) throws IOException {
            v1Var.mo35272l1(outputStream, i);
            return 0;
        }
    }

    /* renamed from: io.grpc.internal.u$f */
    /* compiled from: CompositeReadableBuffer */
    private interface C11368f<T> extends C11369g<T> {
    }

    /* renamed from: io.grpc.internal.u$g */
    /* compiled from: CompositeReadableBuffer */
    private interface C11369g<T> {
        /* renamed from: a */
        int mo35351a(C11380v1 v1Var, int i, T t, int i2) throws IOException;
    }

    public C11362u(int i) {
        this.f43624a = new ArrayDeque(i);
    }

    /* renamed from: f */
    private void m55902f() {
        if (this.f43627d) {
            this.f43625b.add(this.f43624a.remove());
            C11380v1 peek = this.f43624a.peek();
            if (peek != null) {
                peek.mo34982K0();
                return;
            }
            return;
        }
        this.f43624a.remove().close();
    }

    /* renamed from: g */
    private void m55903g() {
        if (this.f43624a.peek().mo35271k() == 0) {
            m55902f();
        }
    }

    /* renamed from: h */
    private void m55904h(C11380v1 v1Var) {
        if (!(v1Var instanceof C11362u)) {
            this.f43624a.add(v1Var);
            this.f43626c += v1Var.mo35271k();
            return;
        }
        C11362u uVar = (C11362u) v1Var;
        while (!uVar.f43624a.isEmpty()) {
            this.f43624a.add(uVar.f43624a.remove());
        }
        this.f43626c += uVar.f43626c;
        uVar.f43626c = 0;
        uVar.close();
    }

    /* renamed from: m */
    private <T> int m55905m(C11369g<T> gVar, int i, T t, int i2) throws IOException {
        mo34983a(i);
        if (!this.f43624a.isEmpty()) {
            m55903g();
        }
        while (i > 0 && !this.f43624a.isEmpty()) {
            C11380v1 peek = this.f43624a.peek();
            int min = Math.min(i, peek.mo35271k());
            i2 = gVar.mo35351a(peek, min, t, i2);
            i -= min;
            this.f43626c -= min;
            m55903g();
        }
        if (i <= 0) {
            return i2;
        }
        throw new AssertionError("Failed executing read operation");
    }

    /* renamed from: n */
    private <T> int m55906n(C11368f<T> fVar, int i, T t, int i2) {
        try {
            return m55905m(fVar, i, t, i2);
        } catch (IOException e) {
            throw new AssertionError(e);
        }
    }

    /* renamed from: A0 */
    public void mo35269A0(byte[] bArr, int i, int i2) {
        m55906n(f43621g, i2, bArr, i);
    }

    /* renamed from: K0 */
    public void mo34982K0() {
        if (this.f43625b == null) {
            this.f43625b = new ArrayDeque(Math.min(this.f43624a.size(), 16));
        }
        while (!this.f43625b.isEmpty()) {
            this.f43625b.remove().close();
        }
        this.f43627d = true;
        C11380v1 peek = this.f43624a.peek();
        if (peek != null) {
            peek.mo34982K0();
        }
    }

    /* renamed from: P */
    public C11380v1 mo35270P(int i) {
        C11380v1 v1Var;
        int i2;
        C11380v1 v1Var2;
        if (i <= 0) {
            return C11384w1.m55968a();
        }
        mo34983a(i);
        this.f43626c -= i;
        C11362u uVar = null;
        C11362u uVar2 = null;
        while (true) {
            C11380v1 peek = this.f43624a.peek();
            int k = peek.mo35271k();
            if (k > i) {
                v1Var = peek.mo35270P(i);
                i2 = 0;
            } else {
                if (this.f43627d) {
                    v1Var2 = peek.mo35270P(k);
                    m55902f();
                } else {
                    v1Var2 = this.f43624a.poll();
                }
                C11380v1 v1Var3 = v1Var2;
                i2 = i - k;
                v1Var = v1Var3;
            }
            if (uVar == null) {
                uVar = v1Var;
            } else {
                if (uVar2 == null) {
                    int i3 = 2;
                    if (i2 != 0) {
                        i3 = Math.min(this.f43624a.size() + 2, 16);
                    }
                    uVar2 = new C11362u(i3);
                    uVar2.mo35350b(uVar);
                    uVar = uVar2;
                }
                uVar2.mo35350b(v1Var);
            }
            if (i2 <= 0) {
                return uVar;
            }
            i = i2;
        }
    }

    /* renamed from: b */
    public void mo35350b(C11380v1 v1Var) {
        boolean z = this.f43627d && this.f43624a.isEmpty();
        m55904h(v1Var);
        if (z) {
            this.f43624a.peek().mo34982K0();
        }
    }

    public void close() {
        while (!this.f43624a.isEmpty()) {
            this.f43624a.remove().close();
        }
        if (this.f43625b != null) {
            while (!this.f43625b.isEmpty()) {
                this.f43625b.remove().close();
            }
        }
    }

    /* renamed from: k */
    public int mo35271k() {
        return this.f43626c;
    }

    /* renamed from: l1 */
    public void mo35272l1(OutputStream outputStream, int i) throws IOException {
        m55905m(f43623i, i, outputStream, 0);
    }

    public boolean markSupported() {
        for (C11380v1 markSupported : this.f43624a) {
            if (!markSupported.markSupported()) {
                return false;
            }
        }
        return true;
    }

    public int readUnsignedByte() {
        return m55906n(f43619e, 1, (Object) null, 0);
    }

    public void reset() {
        if (this.f43627d) {
            C11380v1 peek = this.f43624a.peek();
            if (peek != null) {
                int k = peek.mo35271k();
                peek.reset();
                this.f43626c += peek.mo35271k() - k;
            }
            while (true) {
                C11380v1 pollLast = this.f43625b.pollLast();
                if (pollLast != null) {
                    pollLast.reset();
                    this.f43624a.addFirst(pollLast);
                    this.f43626c += pollLast.mo35271k();
                } else {
                    return;
                }
            }
        } else {
            throw new InvalidMarkException();
        }
    }

    public void skipBytes(int i) {
        m55906n(f43620f, i, (Object) null, 0);
    }

    /* renamed from: z1 */
    public void mo35276z1(ByteBuffer byteBuffer) {
        m55906n(f43622h, byteBuffer.remaining(), byteBuffer, 0);
    }

    public C11362u() {
        this.f43624a = new ArrayDeque();
    }
}
