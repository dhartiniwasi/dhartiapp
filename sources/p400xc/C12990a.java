package p400xc;

import com.google.protobuf.C8143f1;
import com.google.protobuf.C8180l;
import com.google.protobuf.C8243v0;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import p343rc.C12371q0;
import p343rc.C12403w;

/* renamed from: xc.a */
/* compiled from: ProtoInputStream */
final class C12990a extends InputStream implements C12403w, C12371q0 {

    /* renamed from: a */
    private C8243v0 f47247a;

    /* renamed from: b */
    private final C8143f1<?> f47248b;

    /* renamed from: c */
    private ByteArrayInputStream f47249c;

    C12990a(C8243v0 v0Var, C8143f1<?> f1Var) {
        this.f47247a = v0Var;
        this.f47248b = f1Var;
    }

    /* renamed from: a */
    public int mo37145a(OutputStream outputStream) throws IOException {
        C8243v0 v0Var = this.f47247a;
        if (v0Var != null) {
            int f = v0Var.mo27319f();
            this.f47247a.mo26771c(outputStream);
            this.f47247a = null;
            return f;
        }
        ByteArrayInputStream byteArrayInputStream = this.f47249c;
        if (byteArrayInputStream == null) {
            return 0;
        }
        int a = (int) C12991b.m61207a(byteArrayInputStream, outputStream);
        this.f47249c = null;
        return a;
    }

    public int available() {
        C8243v0 v0Var = this.f47247a;
        if (v0Var != null) {
            return v0Var.mo27319f();
        }
        ByteArrayInputStream byteArrayInputStream = this.f47249c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.available();
        }
        return 0;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: b */
    public C8243v0 mo38049b() {
        C8243v0 v0Var = this.f47247a;
        if (v0Var != null) {
            return v0Var;
        }
        throw new IllegalStateException("message not available");
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public C8143f1<?> mo38050f() {
        return this.f47248b;
    }

    public int read() {
        if (this.f47247a != null) {
            this.f47249c = new ByteArrayInputStream(this.f47247a.mo26773h());
            this.f47247a = null;
        }
        ByteArrayInputStream byteArrayInputStream = this.f47249c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read();
        }
        return -1;
    }

    public int read(byte[] bArr, int i, int i2) throws IOException {
        C8243v0 v0Var = this.f47247a;
        if (v0Var != null) {
            int f = v0Var.mo27319f();
            if (f == 0) {
                this.f47247a = null;
                this.f47249c = null;
                return -1;
            } else if (i2 >= f) {
                C8180l h0 = C8180l.m45152h0(bArr, i, f);
                this.f47247a.mo27318d(h0);
                h0.mo27117c0();
                h0.mo27118d();
                this.f47247a = null;
                this.f47249c = null;
                return f;
            } else {
                this.f47249c = new ByteArrayInputStream(this.f47247a.mo26773h());
                this.f47247a = null;
            }
        }
        ByteArrayInputStream byteArrayInputStream = this.f47249c;
        if (byteArrayInputStream != null) {
            return byteArrayInputStream.read(bArr, i, i2);
        }
        return -1;
    }
}
