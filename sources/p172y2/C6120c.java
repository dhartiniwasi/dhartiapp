package p172y2;

import java.nio.ByteBuffer;
import p127r2.C5432a;
import p127r2.C5439e;
import p127r2.C5442h;
import p161w3.C5918a0;
import p161w3.C5940i0;
import p161w3.C5980z;

/* renamed from: y2.c */
/* compiled from: SpliceInfoDecoder */
public final class C6120c extends C5442h {

    /* renamed from: a */
    private final C5918a0 f29521a = new C5918a0();

    /* renamed from: b */
    private final C5980z f29522b = new C5980z();

    /* renamed from: c */
    private C5940i0 f29523c;

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public C5432a mo19711b(C5439e eVar, ByteBuffer byteBuffer) {
        C5940i0 i0Var = this.f29523c;
        if (i0Var == null || eVar.f27693i != i0Var.mo20625e()) {
            C5940i0 i0Var2 = new C5940i0(eVar.f5432e);
            this.f29523c = i0Var2;
            i0Var2.mo20621a(eVar.f5432e - eVar.f27693i);
        }
        byte[] array = byteBuffer.array();
        int limit = byteBuffer.limit();
        this.f29521a.mo20544M(array, limit);
        this.f29522b.mo20683o(array, limit);
        this.f29522b.mo20686r(39);
        long h = (((long) this.f29522b.mo20676h(1)) << 32) | ((long) this.f29522b.mo20676h(32));
        this.f29522b.mo20686r(20);
        int h2 = this.f29522b.mo20676h(12);
        int h3 = this.f29522b.mo20676h(8);
        C5432a.C5434b bVar = null;
        this.f29521a.mo20547P(14);
        if (h3 == 0) {
            bVar = new C6124e();
        } else if (h3 == 255) {
            bVar = C6117a.m35766a(this.f29521a, h2, h);
        } else if (h3 == 4) {
            bVar = C6126f.m35780a(this.f29521a);
        } else if (h3 == 5) {
            bVar = C6121d.m35773a(this.f29521a, h, this.f29523c);
        } else if (h3 == 6) {
            bVar = C6130g.m35793a(this.f29521a, h, this.f29523c);
        }
        if (bVar == null) {
            return new C5432a(new C5432a.C5434b[0]);
        }
        return new C5432a(bVar);
    }
}
