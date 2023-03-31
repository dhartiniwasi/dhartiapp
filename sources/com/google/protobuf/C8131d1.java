package com.google.protobuf;

import com.google.protobuf.C8153i;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* renamed from: com.google.protobuf.d1 */
/* compiled from: NioByteString */
final class C8131d1 extends C8153i.C8162i {

    /* renamed from: e */
    private final ByteBuffer f34862e;

    C8131d1(ByteBuffer byteBuffer) {
        C8119d0.m44650b(byteBuffer, "buffer");
        this.f34862e = byteBuffer.slice().order(ByteOrder.nativeOrder());
    }

    /* renamed from: Y */
    private ByteBuffer m44668Y(int i, int i2) {
        if (i < this.f34862e.position() || i2 > this.f34862e.limit() || i > i2) {
            throw new IllegalArgumentException(String.format("Invalid indices [%d, %d]", new Object[]{Integer.valueOf(i), Integer.valueOf(i2)}));
        }
        ByteBuffer slice = this.f34862e.slice();
        slice.position(i - this.f34862e.position());
        slice.limit(i2 - this.f34862e.position());
        return slice;
    }

    /* renamed from: B */
    public C8167j mo26878B() {
        return C8167j.m44844i(this.f34862e, true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public int mo26879C(int i, int i2, int i3) {
        for (int i4 = i2; i4 < i2 + i3; i4++) {
            i = (i * 31) + this.f34862e.get(i4);
        }
        return i;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public int mo26880D(int i, int i2, int i3) {
        return C8094a2.m44519u(i, this.f34862e, i2, i3 + i2);
    }

    /* renamed from: J */
    public C8153i mo26881J(int i, int i2) {
        try {
            return new C8131d1(m44668Y(i, i2));
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: N */
    public String mo26882N(Charset charset) {
        int i;
        int i2;
        byte[] bArr;
        if (this.f34862e.hasArray()) {
            bArr = this.f34862e.array();
            i2 = this.f34862e.arrayOffset() + this.f34862e.position();
            i = this.f34862e.remaining();
        } else {
            bArr = mo26932K();
            i2 = 0;
            i = bArr.length;
        }
        return new String(bArr, i2, i, charset);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: W */
    public void mo26883W(C8147h hVar) throws IOException {
        hVar.mo26916a(this.f34862e.slice());
    }

    /* access modifiers changed from: package-private */
    /* renamed from: X */
    public boolean mo26884X(C8153i iVar, int i, int i2) {
        return mo26881J(0, i2).equals(iVar.mo26881J(i, i2 + i));
    }

    /* renamed from: c */
    public ByteBuffer mo26885c() {
        return this.f34862e.asReadOnlyBuffer();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8153i)) {
            return false;
        }
        C8153i iVar = (C8153i) obj;
        if (size() != iVar.size()) {
            return false;
        }
        if (size() == 0) {
            return true;
        }
        if (obj instanceof C8131d1) {
            return this.f34862e.equals(((C8131d1) obj).f34862e);
        }
        if (obj instanceof C8194m1) {
            return obj.equals(this);
        }
        return this.f34862e.equals(iVar.mo26885c());
    }

    /* renamed from: i */
    public byte mo26887i(int i) {
        try {
            return this.f34862e.get(i);
        } catch (ArrayIndexOutOfBoundsException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new ArrayIndexOutOfBoundsException(e2.getMessage());
        }
    }

    public int size() {
        return this.f34862e.remaining();
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo26889u(byte[] bArr, int i, int i2, int i3) {
        ByteBuffer slice = this.f34862e.slice();
        slice.position(i);
        slice.get(bArr, i2, i3);
    }

    /* renamed from: w */
    public byte mo26890w(int i) {
        return mo26887i(i);
    }

    /* renamed from: y */
    public boolean mo26891y() {
        return C8094a2.m44516r(this.f34862e);
    }
}
